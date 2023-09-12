import javax.swing.*;  
public class javaSwingBasic {
    public static void main(String[] args) {  
        JFrame f=new JFrame();//creating instance of JFrame  
                  
        JButton b=new JButton("click");//creating instance of JButton  
        b.setBounds(13,5,100, 40);//x axis(from left), y axis(from top), width, height  
                  
        f.add(b);//adding button in JFrame  
                  
        f.setSize(400,500);//400 width and 500 height  
        f.setLayout(null);//using no layout managers  
        f.setVisible(true);//making the frame visible  
        }  
    
}
