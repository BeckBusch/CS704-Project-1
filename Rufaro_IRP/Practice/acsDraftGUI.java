import javax.swing.*; 
//import javax.swing.event.ChangeEvent;
//import javax.swing.event.ChangeListener;

import java.awt.Color;
//import java.awt.Dimension;
import java.awt.Font; 
import java.awt.event.*;  
//import java.util.*;
//import java.util.Date; 


public class acsDraftGUI{

    //==GLOBAL CONSTANTS==
    static int WINDOW_LENGTH = 800; //will be used for reactive window making
    static int WINDOW_HEIGHT = 700;
    static int TOP_MARGIN = 100;

    static int ABS_REGION_BOTTOM = 205;
    static int ABS_REGION_LEFT = 591;
    static int ABS_REGION_RIGHT = 680;
    static int ABS_REGION_TOP = 125;

    static int ZONE1_REGION_BOTTOM = -1;
    static int ZONE1_REGION_LEFT = -1;
    static int ZONE1_REGION_RIGHT = -1;
    static int ZONE1_REGION_TOP = -1;

    static int ZONE2_REGION_BOTTOM = -1;
    static int ZONE2_REGION_LEFT = -1;
    static int ZONE2_REGION_RIGHT = -1;
    static int ZONE2_REGION_TOP = -1;

    static int ZONE3_REGION_BOTTOM = -1;
    static int ZONE3_REGION_LEFT = -1;
    static int ZONE3_REGION_RIGHT = -1;
    static int ZONE3_REGION_TOP = -1;

    static int ZONE4_REGION_BOTTOM = -1;
    static int ZONE4_REGION_LEFT = -1;
    static int ZONE4_REGION_RIGHT = -1;
    static int ZONE4_REGION_TOP = -1;

    static int ZONE5_REGION_BOTTOM = -1;
    static int ZONE5_REGION_LEFT = -1;
    static int ZONE5_REGION_RIGHT = -1;
    static int ZONE5_REGION_TOP = -1;

    static int ZONE6_REGION_BOTTOM = -1;
    static int ZONE6_REGION_LEFT = -1;
    static int ZONE6_REGION_RIGHT = -1;
    static int ZONE6_REGION_TOP = -1;

    static int _REGION_BOTTOM = -1;
    static int _REGION_LEFT = -1;
    static int _REGION_RIGHT = -1;
    static int _REGION_TOP = -1;

    //==GLOBAL CLASS VARIABLES==
    static int Xvalue = WINDOW_LENGTH/2;
    static int Yvalue = TOP_MARGIN+50;

    public static void main(String[] args) {  
        JFrame f=new JFrame();//creating instance of JFrame  
        //
        //==BUTTONS==

        //Left Button 
                 //TODO make these strings into icons for quality points
        JButton leftB=new JButton("left");//creating instance of JButton
        leftB.setBounds(12,(TOP_MARGIN+100),100, 40);//x axis(from left), y axis(from top), width, height
        leftB.setActionCommand("Move Left");
        leftB.addActionListener(new ButtonClickListener());

        //Right Button 
        JButton rightB=new JButton("right");//creating instance of JButton  
        rightB.setBounds(250,(TOP_MARGIN+100),100, 40);//x axis(from left), y axis(from top), width, height
        rightB.setActionCommand("Move Right");
        rightB.addActionListener(new ButtonClickListener());

        //Up Button 
        JButton upB=new JButton("up");//creating instance of JButton  
        upB.setBounds(131,TOP_MARGIN,100, 40);//x axis(from left), y axis(from top), width, height 
        upB.setActionCommand("Move Up");
        upB.addActionListener(new ButtonClickListener());

        //Down Button 
        JButton downB=new JButton("down");//creating instance of JButton  
        downB.setBounds(131,(TOP_MARGIN+200),100, 40);//x axis(from left), y axis(from top), width, height
        downB.setActionCommand("Move Down");
        downB.addActionListener(new ButtonClickListener());

        //Scan Button
        JButton scanB=new JButton("scan");//creating instance of JButton  
        scanB.setBounds(131,(TOP_MARGIN+100),100, 40);//x axis(from left), y axis(from top), width, height
        scanB.setActionCommand("Scan");
        scanB.addActionListener(new ButtonClickListener());

        //==LABELS AND IMAGES==

        //Map Image
        JLabel map = new JLabel( new ImageIcon("map.png"));
        map.setBounds((WINDOW_LENGTH/2), (TOP_MARGIN+20), 800, 600);
        map.setVisible(true);
        
        //Avatar Image
        JLabel avatar = new JLabel( new ImageIcon("avatar.png"));
        avatar.setBounds((WINDOW_LENGTH/2), (TOP_MARGIN+50), 500, 300);
        avatar.setVisible(true);

        //Approved Label
        JLabel approved = new JLabel("APPROVED");
        approved.setBounds((WINDOW_LENGTH-250), (TOP_MARGIN),200, 100);
        approved.setVisible(true);
        approved.setFont(new Font("Serif", Font.PLAIN, 30));
        approved.setForeground(Color.GREEN);

        //Denied Label
        JLabel denied = new JLabel("DENIED");
        denied.setBounds((WINDOW_LENGTH-250), (TOP_MARGIN),200, 100);
        denied.setVisible(true);
        denied.setFont(new Font("Serif", Font.PLAIN, 30));
        denied.setForeground(Color.RED);

        //ABS suspended Label
        JLabel absSuspend = new JLabel("ABS SUSPENDED");
        absSuspend.setBounds((WINDOW_LENGTH-50), (TOP_MARGIN),250, 100);
        absSuspend.setVisible(false); /*Starting hidden */
        absSuspend.setFont(new Font("Serif", Font.PLAIN, 30));
        absSuspend.setForeground(Color.ORANGE);
    
        //==ADDING TO FRAME (Order matters, first on top)==
        
        
        f.add(leftB);//adding left button in JFrame 
        f.add(rightB);//adding right button in JFrame 
        f.add(upB);//adding up button in JFrame 
        f.add(downB);//adding down button in JFrame 
        f.add(scanB) ; //adding scann button in JFrame
        f.add(avatar); //adding avatar moving across map
        f.add(map); //adding map image 
        f.add(absSuspend); //adding "ABS SUSPENDED" Label
        f.add(approved); //adding "APPROVED" Display Label
        f.add(denied); //adding "DENIED" Display Label
        
        
        //==SETTING FRAME==
        f.setSize(WINDOW_LENGTH,WINDOW_HEIGHT);//
        f.setLayout(null);//using no layout managers  
        f.setVisible(true);//making the frame visible  


        //====LOOP CODE====
        while(true){
            /*Delete later on - small code to see icon move */
    
            avatar.setBounds(Xvalue, Yvalue, 500, 300);
            System.out.printf("\n\nXvalue: %d | Yvalue: %d", Xvalue,Yvalue);

            //checking if in ABS region
            if(getZone() == "ABS"){ 
                /*Send Suspend signal to the sysj */
                System.out.println("ABS SUSPENDED: IN ABS REGION");
                absSuspend.setVisible(true); //show the message
            } else{
                absSuspend.setVisible(false);
            }

            
            try {
                Thread.sleep(500);
                //System.out.println("Running");   just to show its entering here
        

            }
            catch(InterruptedException ex)
            {
                ex.printStackTrace();
            }
        
        }

    }

    private static String getZone(){
        if((ABS_REGION_LEFT<Xvalue && Xvalue<ABS_REGION_RIGHT) && (ABS_REGION_TOP<Yvalue && Yvalue<ABS_REGION_BOTTOM)){
            return (String)"ABS";
        }else if((ZONE1_REGION_LEFT<Xvalue && Xvalue<ZONE1_REGION_RIGHT) && (ZONE1_REGION_TOP<Yvalue && Yvalue<ZONE1_REGION_BOTTOM)){
            return "Zone 1";
        }else if((ZONE2_REGION_LEFT<Xvalue && Xvalue<ZONE2_REGION_RIGHT) && (ZONE2_REGION_TOP<Yvalue && Yvalue<ZONE2_REGION_BOTTOM)){
            return "Zone 2";
        }else if((ZONE3_REGION_LEFT<Xvalue && Xvalue<ZONE3_REGION_RIGHT) && (ZONE3_REGION_TOP<Yvalue && Yvalue<ZONE3_REGION_BOTTOM)){
            return "Zone 3";
        }else if((ZONE4_REGION_LEFT<Xvalue && Xvalue<ZONE4_REGION_RIGHT) && (ZONE4_REGION_TOP<Yvalue && Yvalue<ZONE4_REGION_BOTTOM)){
            return "Zone 4";
        }else if((ZONE5_REGION_LEFT<Xvalue && Xvalue<ZONE5_REGION_RIGHT) && (ZONE5_REGION_TOP<Yvalue && Yvalue<ZONE5_REGION_BOTTOM)){
            return "Zone 5";
        }else if((ZONE6_REGION_LEFT<Xvalue && Xvalue<ZONE6_REGION_RIGHT) && (ZONE6_REGION_TOP<Yvalue && Yvalue<ZONE6_REGION_BOTTOM)){
            return "Zone 6";
        }else{
            return "OUTSIDE";
        }
    }

    //==LISTENERS==
    private static class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if (command.equals("Move Left")) {
                System.out.println("MOVE LEFT pressed");
                Xvalue -= 5;
            
            } else if (command.equals("Move Right")) {
                System.out.println("MOVE RIGHT pressed");
                Xvalue += 5;
        
            } else if (command.equals("Move Down")) {
                System.out.println("Move Down pressed");
                Yvalue += 5;
        
            } else if (command.equals("Move Up")) {
                System.out.println("Move Up pressed");
                Yvalue -= 5;
            
            } else if (command.equals("Scan")) {
                System.out.println("Scan pressed");
                //ScanID()
                //TODO: Implement ScanID() function

            } else if (command.equals("Reset")) {
                System.out.println("Reset pressed");
                /*
                 * Return avatar to zone 1
                 * Turn off all prompts
                 * restablish the connection of sockets (likely a function call)
                 */
                

            }
        }
    }

}

/*
 * CHECKLIST of ToDo
 */
//TODO:Implement ScanID()
    

