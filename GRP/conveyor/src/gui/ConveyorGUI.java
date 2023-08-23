package gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class ConveyorGUI extends JFrame {
	private JPanel panel;
	
	public ConveyorGUI() {

		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
//		this.setPreferredSize(new Dimension(200, 300));
		panel = new Canvas();
		panel.setPreferredSize(new Dimension(360, 350));
		panel.setBackground(Color.WHITE);
		
		c.gridx = 0;
		c.gridy = 0;
		this.add(panel,c);
		
		
		
		JButton enable = new JButton("enable");
		//enable.setMultiClickThreshhold(500);
		enable.addActionListener(new SignalClient(Ports.PORT_LOADER_PLANT, Ports.ENABLE_SIGNAL));
		JButton spawn = new JButton("spawn bottle");
		//spawn.setMultiClickThreshhold(500);
		spawn.addActionListener(new SignalClient(Ports.PORT_LOADER_PLANT, Ports.SPAWN_SIGNAL));
		JButton rotate = new JButton("rotate");
		//rotate.setMultiClickThreshhold(500);
		rotate.addActionListener(new SignalClient(Ports.PORT_LOADER_PLANT, Ports.ROTATE_SIGNAL));
		JPanel ss = new JPanel();
		ss.add(enable);
		ss.add(spawn);
		ss.add(rotate);
		c.gridx = 0;
		c.gridy = 1;
		this.add(ss,c);
		
		/*
		
		// Radio buttons
		SignalRadioClient src = new SignalRadioClient(Ports.PORT_LOADER_CONTROLLER, Ports.SIGNAL_Mode);
		JRadioButton mmode = new JRadioButton("Manual");
		mmode.setActionCommand("1");
		mmode.addActionListener(src);
		JRadioButton amode = new JRadioButton("Auto");
		amode.setActionCommand("0");
		amode.addActionListener(src);
		amode.setSelected(true);
		ButtonGroup bg = new ButtonGroup();
		bg.add(mmode);
		bg.add(amode);
		
		JPanel pan = new JPanel(new GridLayout(1, 0));
		pan.add(amode);
		pan.add(mmode);
		c.gridx = 0;
		c.gridy = 2;
		pan.setBorder(BorderFactory.createTitledBorder("Mode selector"));

		// Checkboxes
		JCheckBox pe = new JCheckBox("pusherExtend");
		pe.setEnabled(false);
		pe.addItemListener(new SignalCheckBoxClient(Ports.PORT_LOADER_CONTROLLER, Ports.SIGNAL_PUSHER_EXTEND));
//		JCheckBox pr = new JCheckBox("vacOff");
//		pr.setEnabled(false);
//		pr.addItemListener(new SignalCheckBoxClient(Ports.PORT_LOADER_CONTROLLER, Ports.SIGNAL_VACOFF));
		JCheckBox vo = new JCheckBox("vacOn");
		vo.setEnabled(false);
		vo.addItemListener(new SignalCheckBoxClient(Ports.PORT_LOADER_CONTROLLER, Ports.SIGNAL_VACON));
		JCheckBox as = new JCheckBox("armSource");
		as.setEnabled(false);
		as.addItemListener(new SignalCheckBoxClient(Ports.PORT_LOADER_CONTROLLER, Ports.SIGNAL_ARM_SOURCE));
		JCheckBox ad = new JCheckBox("armDest");
		ad.setEnabled(false);
		ad.addItemListener(new SignalCheckBoxClient(Ports.PORT_LOADER_CONTROLLER, Ports.SIGNAL_ARM_DEST));

		JPanel pan2 = new JPanel(new GridLayout(2, 2));
		pan2.add(pe);
//		pan2.add(pr);
		pan2.add(vo);
		pan2.add(as);
		pan2.add(ad);
		pan2.setBorder(BorderFactory.createTitledBorder("Manual control"));
		src.setCheckBoxComponent(pan2);

		JPanel pan3 = new JPanel(new GridLayout(0, 2));
		pan3.add(pan);
		pan3.add(pan2);
		c.gridx = 0;
		c.gridy = 2;
		this.add(pan3,c);
		
		*/
		
		this.setTitle("conveyor");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
	}

	public static void main(String[] args) {
		ConveyorGUI cl = new ConveyorGUI();
		cl.pack();
		cl.setVisible(true);
		
		SignalServer<LoaderVizWorker> server = new SignalServer<LoaderVizWorker>(Ports.PORT_LOADER_VIZ, LoaderVizWorker.class);
		new Thread(server).start();
		while(true){
			try {
				cl.repaint();
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
