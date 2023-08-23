package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import gui.States;

public class Canvas extends JPanel {
	BufferedImage conveyorHex;
	
	public Canvas(){
		try {
			conveyorHex = ImageIO.read(new File("res/conveyorHex.png"));
			
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);;
		}
	}
	
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawImage(conveyorHex, 0, 0, null);
		
		if(States.CON_1_ON) {
			g.setColor(Color.GREEN);
			g.fillRect(0, 260, 100, 20);
		} else {
			g.drawRect(0, 260, 100, 20);
		}
		
		if(States.CON_5_ON) {
			g.setColor(Color.GREEN);
			g.fillRect(260, 260, 100, 20);
		} else {
			g.drawRect(260, 260, 100, 20);
		}


		if (States.BOTTLE_ON_CON_1) {
			g.setColor(Color.BLACK);
			g.fillOval(70, 220, 20, 20);
		}
		
		if (States.BOTTLE_ON_CON_5) {
			g.setColor(Color.BLACK);
			g.fillOval(270, 220, 20, 20);
		}
		
		if (States.BOTTLE_1_EXIST) {
			g.setColor(Color.BLACK);
			g.fillOval(120, 190, 20, 20);
		}

		if (States.BOTTLE_2_EXIST) {
			g.setColor(Color.BLACK);
			g.fillOval(120, 120, 20, 20);
		}

		if (States.BOTTLE_3_EXIST) {
			g.setColor(Color.BLACK);
			g.fillOval(170, 90, 20, 20);
		}

		if (States.BOTTLE_4_EXIST) {
			g.setColor(Color.BLACK);
			g.fillOval(220, 120, 20, 20);
		}

		if (States.BOTTLE_5_EXIST) {
			g.setColor(Color.BLACK);
			g.fillOval(220, 190, 20, 20);
		}

		if (States.BOTTLE_6_EXIST) {
			g.setColor(Color.BLACK);
			g.fillOval(170, 220, 20, 20);
		}
		
			
			
	
	}
}
