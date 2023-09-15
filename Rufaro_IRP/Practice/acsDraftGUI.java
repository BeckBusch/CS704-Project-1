import javax.swing.*; 
//import javax.swing.event.ChangeEvent;
//import javax.swing.event.ChangeListener;

import java.awt.Color;
//import java.awt.Dimension;
import java.awt.Font; 
import java.awt.event.*;  
//import java.util.*;
//import java.util.Date; 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
//import java.util.Arrays;

//import javax.net.ServerSocketFactory;


public class ACS_GUI{

    //==GLOBAL CONSTANTS==
    static int WINDOW_LENGTH = 800; //will be used for reactive window making
    static int WINDOW_HEIGHT = 700;
    static int TOP_MARGIN = 100;
    static int AVATAR_ID = 0;

    static int ABS_REGION_BOTTOM = 205;
    static int ABS_REGION_LEFT = 591;
    static int ABS_REGION_RIGHT = 680;
    static int ABS_REGION_TOP = 125;

    static int ZONE1_REGION_BOTTOM = 415;
    static int ZONE1_REGION_LEFT = 315;
    static int ZONE1_REGION_RIGHT = 485;
    static int ZONE1_REGION_TOP = 275;

    static int ZONE2_REGION_BOTTOM = 415;
    static int ZONE2_REGION_LEFT = 495;
    static int ZONE2_REGION_RIGHT = 635;
    static int ZONE2_REGION_TOP = 275;

    static int ZONE3_REGION_BOTTOM = 415;
    static int ZONE3_REGION_LEFT = 640;
    static int ZONE3_REGION_RIGHT = 800;
    static int ZONE3_REGION_TOP = 275;

    static int ZONE4_REGION_BOTTOM = 265;
    static int ZONE4_REGION_LEFT = 725;
    static int ZONE4_REGION_RIGHT = 800;
    static int ZONE4_REGION_TOP = 130;

    static int ZONE5_REGION_BOTTOM = 265;
    static int ZONE5_REGION_LEFT = 565;
    static int ZONE5_REGION_RIGHT = 715;
    static int ZONE5_REGION_TOP = 130;

    static int ZONE6_REGION_BOTTOM = 265;
    static int ZONE6_REGION_LEFT = 495;
    static int ZONE6_REGION_RIGHT = 560;
    static int ZONE6_REGION_TOP = 130;
    
    public static int ZONE7_REGION_BOTTOM = 260;
    public static int ZONE7_REGION_LEFT = 315;
    public static int ZONE7_REGION_RIGHT = 485;
    public static int ZONE7_REGION_TOP = 130;


    static int FRONT_DOOR_REGION_BOTTOM = 365;
    static int FRONT_DOOR_REGION_LEFT = 300;
    static int FRONT_DOOR_REGION_RIGHT = 325;
    static int FRONT_DOOR_REGION_TOP = 310;

    static int OFFICE_DOOR_REGION_BOTTOM = 280;
    static int OFFICE_DOOR_REGION_LEFT = 360;
    static int OFFICE_DOOR_REGION_RIGHT = 420;
    static int OFFICE_DOOR_REGION_TOP = 265;

    static int MANUFACTURE_DOOR_REGION_BOTTOM = 300;
    static int MANUFACTURE_DOOR_REGION_LEFT = 600;
    static int MANUFACTURE_DOOR_REGION_RIGHT = 675;
    static int MANUFACTURE_DOOR_REGION_TOP = 260;
    

    static int PORT_NO = 4031;

    //==GLOBAL CLASS VARIABLES==
    static int Xvalue = WINDOW_LENGTH/2;
    static int Yvalue = TOP_MARGIN+50;


    public static void main(String[] args) throws IOException {  
        JFrame f=new JFrame();//creating instance of JFrame  
        //
        //==BUTTONS==

        //Left Button 
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
        approved.setBounds((WINDOW_LENGTH-350), (TOP_MARGIN),200, 100);
        approved.setVisible(true);
        approved.setFont(new Font("Serif", Font.PLAIN, 30));
        approved.setForeground(Color.GREEN);
        map.setVisible(false);

        //Denied Label
        JLabel denied = new JLabel("DENIED");
        denied.setBounds((WINDOW_LENGTH-150), (TOP_MARGIN),200, 100);
        denied.setVisible(true);
        denied.setFont(new Font("Serif", Font.PLAIN, 30));
        denied.setForeground(Color.RED);
        map.setVisible(true);

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

        //==SETTING UP CONNECTION==
        EchoServer server = new EchoServer(PORT_NO);
        server.start(); /*starts connection thread for connecting to SysJ*/

        //====LOOP CODE====
        while(true){
    
            avatar.setBounds(Xvalue, Yvalue, 500, 300);
            //\nSystem.out.printf("\n\nXvalue: %d | Yvalue: %d", Xvalue,Yvalue);

            //checking if in ABS region
            if(getZone(Xvalue,Yvalue) == "ABS"){ 
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

    //==SENDID()-HELPER-FUNCTION==
    static void sendID(){

        acsSignalSender sender = new acsSignalSender(PORT_NO);
        sender.setOutgoingID(AVATAR_ID);
        sender.setOutgoingZone(getZone(Xvalue,Yvalue));
        sender.start();
    }

    private static class acsSignalSender extends Thread {
        ObjectOutputStream outputStream;
        int outgoingID;
        String outgoingZone;
        String[] outgoingArray = new String[2];
        

        acsSignalSender(int port) {
            try {
                outputStream = new ObjectOutputStream(new Socket("127.0.0.1", port).getOutputStream());
            } catch (IOException err) {
                System.out.println(err.getMessage());
            }
        }

        void setOutgoingID(int number) {
            this.outgoingID = number;
        }

        void setOutgoingZone(String zone) {
            this.outgoingZone = getZone(Xvalue,Yvalue);
        }

        @Override
        public void run() {
            try {
                outgoingArray[0] = String.valueOf(outgoingID);
                outgoingArray[1] = outgoingZone;
                System.out.printf("[%s,%s]",outgoingZone, outgoingID);
                outputStream.writeObject(new Object[] { true, outgoingArray });
                Thread.sleep(100);
                outputStream.writeObject(new Object[] { false, outgoingArray });
            } catch (IOException | InterruptedException aa) {
                System.out.println(aa.getMessage());
            }
        }
}



    //==GET_ZONE-HELPER-FUNCTION==
    private static String getZone(int Xvalue, int Yvalue){ //If/Else statement in order of priority (Abs, doors, then zones)
        if((ABS_REGION_LEFT<Xvalue && Xvalue<ABS_REGION_RIGHT) && (ABS_REGION_TOP<Yvalue && Yvalue<ABS_REGION_BOTTOM)){
            return (String)"ABS";
        }else if((OFFICE_DOOR_REGION_LEFT<Xvalue && Xvalue<OFFICE_DOOR_REGION_RIGHT) && (OFFICE_DOOR_REGION_TOP<Yvalue && Yvalue<OFFICE_DOOR_REGION_BOTTOM)){
            return "Office Door";
        }else if((MANUFACTURE_DOOR_REGION_LEFT<Xvalue && Xvalue<MANUFACTURE_DOOR_REGION_RIGHT) && (MANUFACTURE_DOOR_REGION_TOP<Yvalue && Yvalue<MANUFACTURE_DOOR_REGION_BOTTOM)){
            return "Manufacture Door";
        }else if((FRONT_DOOR_REGION_LEFT<Xvalue && Xvalue<FRONT_DOOR_REGION_RIGHT) && (FRONT_DOOR_REGION_TOP<Yvalue && Yvalue<FRONT_DOOR_REGION_BOTTOM)){
            return "Front Door";
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
        }else if((ZONE7_REGION_LEFT<Xvalue && Xvalue<ZONE7_REGION_RIGHT) && (ZONE7_REGION_TOP<Yvalue && Yvalue<ZONE7_REGION_BOTTOM)){
            return "Zone 7";
        }else{
            return "OUTSIDE";
        }
    }

    //==LISTENERS==
    private static class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if (command.equals("Move Left")) {
                System.out.println("\nMOVE LEFT pressed");
                Xvalue -= 5;
            
            } else if (command.equals("Move Right")) {
                System.out.println("\nMOVE RIGHT pressed");
                Xvalue += 5;
        
            } else if (command.equals("Move Down")) {
                System.out.println("\nMove Down pressed");
                Yvalue += 5;
        
            } else if (command.equals("Move Up")) {
                System.out.println("\nMove Up pressed");
                Yvalue -= 5;
            
            } else if (command.equals("Scan")) {
                System.out.println("\nScan pressed");
                sendID();

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

    //TCP/IP CLASS
    public static class EchoServer extends Thread{
        private ServerSocket serverSocket;
        private Socket clientSocket;
        private PrintWriter out;
        private BufferedReader in;

        EchoServer(int port)throws IOException{ //will need to specify the port number
            serverSocket = new ServerSocket(port);
        }

        @Override
        public void run() { //call start() in main code

            try {

                clientSocket = serverSocket.accept();
                System.out.println("connection made!");
                out = new PrintWriter(clientSocket.getOutputStream(), true);
                in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            String inputLine;
            try{
                while ((inputLine = in.readLine()) != null) {
                if ("TERMINATE".equals(inputLine)) {
                    out.println("good bye");
                    break;
                }
                out.println(inputLine);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}


/*
 * CHECKLIST of ToDo
 */
    

