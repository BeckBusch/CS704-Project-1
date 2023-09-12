import javax.swing.*; 
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font; 

public class acsDraftGUI{

    //constants
    static int WINDOW_LENGTH = 800; //will be used for reactive window making
    static int WINDOW_HEIGHT = 700;
    static int TOP_MARGIN = 100;

    public static void main(String[] args) {  
        JFrame f=new JFrame();//creating instance of JFrame  
        //
        //==BUTTONS==

        //Left Button 
                 //TODO make these strings into icons for quality points
        JButton leftB=new JButton("left");//creating instance of JButton
        leftB.setBounds(12,(TOP_MARGIN+100),100, 40);//x axis(from left), y axis(from top), width, height 

        //Right Button 
        JButton rightB=new JButton("right");//creating instance of JButton  
        rightB.setBounds(250,(TOP_MARGIN+100),100, 40);//x axis(from left), y axis(from top), width, height 

        //Up Button 
        JButton upB=new JButton("up");//creating instance of JButton  
        upB.setBounds(131,TOP_MARGIN,100, 40);//x axis(from left), y axis(from top), width, height 

        //Down Button 
        JButton downB=new JButton("down");//creating instance of JButton  
        downB.setBounds(131,(TOP_MARGIN+200),100, 40);//x axis(from left), y axis(from top), width, height

        //Scan Button
        JButton scanB=new JButton("scan");//creating instance of JButton  
        scanB.setBounds(131,(TOP_MARGIN+100),100, 40);//x axis(from left), y axis(from top), width, height

        //==LABELS AND IMAGES==

        //Map Image
        JLabel map = new JLabel( new ImageIcon("map.png"));
        map.setBounds((WINDOW_LENGTH/2), (TOP_MARGIN+200), 500, 300);
        map.setVisible(true);
        
        //Avatar Image
        JLabel avatar = new JLabel( new ImageIcon("avatar.png"));
        avatar.setBounds((WINDOW_LENGTH/2), (TOP_MARGIN+50), 500, 300);
        avatar.setVisible(true);

        //Approved Label
        JLabel approved = new JLabel("APPROVED");
        approved.setBounds((WINDOW_LENGTH/2), (TOP_MARGIN),200, 100);
        approved.setVisible(true);
        approved.setFont(new Font("Serif", Font.PLAIN, 30));
        approved.setForeground(Color.GREEN);

        //Denied Label
        JLabel denied = new JLabel("DENIED");
        denied.setBounds((WINDOW_LENGTH/2), (TOP_MARGIN),200, 100);
        denied.setVisible(true);
        denied.setFont(new Font("Serif", Font.PLAIN, 30));
        denied.setForeground(Color.RED);

        //ABS suspended Label
        JLabel absSuspend = new JLabel("ABS SUSPENDED");
        absSuspend.setBounds((WINDOW_LENGTH/2), (TOP_MARGIN),250, 100);
        absSuspend.setVisible(true);
        absSuspend.setFont(new Font("Serif", Font.PLAIN, 30));
        absSuspend.setForeground(Color.ORANGE);


        //==ADDING TO FRAME (Order matters, first on top)==
        
        
        f.add(leftB);//adding left button in JFrame 
        f.add(rightB);//adding right button in JFrame 
        f.add(upB);//adding up button in JFrame 
        f.add(downB);//adding down button in JFrame 
        f.add(scanB) ; //adding scann button in JFrame
        f.add(avatar);
        f.add(map); //adding map image 
        f.add(absSuspend); //adding "ABS SUSPENDED" Label
        f.add(approved); //adding "APPROVED" Display Label
        f.add(denied); //adding "DENIED" Display Label
        
        
        //==SETTING FRAME==
        f.setSize(WINDOW_LENGTH,WINDOW_HEIGHT);//
        f.setLayout(null);//using no layout managers  
        f.setVisible(true);//making the frame visible  

        }


/*
 * CHECKLIST of TODO: 
 */
//TODO:Explore the need for a JLayerPane for image and avatar to move over the top
    
}
