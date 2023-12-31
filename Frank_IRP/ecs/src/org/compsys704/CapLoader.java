package org.compsys704;

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

public class CapLoader extends JFrame {
	private JPanel panel;
	
	public CapLoader() {
//		this.setPreferredSize(new Dimension(200, 300));
		panel = new Canvas();
		panel.setPreferredSize(new Dimension(1000, 600));
		panel.setBackground(Color.WHITE);
		
		/*
		JButton enable = new JButton("enable");
		enable.addActionListener(new SignalClient(Ports.PORT_LOADER_PLANT, Ports.ENABLE_SIGNAL));
		JButton request = new JButton("request");
		request.addActionListener(new SignalClient(Ports.PORT_LOADER_CONTROLLER, Ports.REQUEST_SIGNAL));
		JButton refill = new JButton("refill");
		refill.addActionListener(new SignalClient(Ports.PORT_LOADER_PLANT, Ports.REFILL_SIGNAL));
		JPanel ss = new JPanel();
		ss.add(enable);
		ss.add(request);
		ss.add(refill);
		
		*/
		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 0;
		this.add(panel,c);
		c.gridx = 0;
		c.gridy = 1;
		
		// this.add(ss,c);
		
		// Radio buttons
		SignalRadioClient src = new SignalRadioClient(Ports.PORT_LOADER_PLANT, Ports.SIGNAL_Mode);
		JRadioButton fr = new JRadioButton("Fire Temp");
		fr.setActionCommand("3");
		fr.addActionListener(src);
		JRadioButton h = new JRadioButton("High");
		h.setActionCommand("2");
		h.addActionListener(src);
		JRadioButton mmode = new JRadioButton("Normal");
		mmode.setActionCommand("1");
		mmode.addActionListener(src);
		JRadioButton amode = new JRadioButton("Low");
		amode.setActionCommand("0");
		amode.addActionListener(src);
		mmode.setSelected(true);
		ButtonGroup bg = new ButtonGroup();
		bg.add(fr);
		bg.add(h);
		bg.add(mmode);
		bg.add(amode);
		
		JPanel pan = new JPanel(new GridLayout(1, 0));
		pan.add(fr);
		pan.add(h);
		pan.add(mmode);
		pan.add(amode);
		c.gridx = 0;
		c.gridy = 2;
		pan.setBorder(BorderFactory.createTitledBorder("Temp selector"));

		// Checkboxes
		JCheckBox pe = new JCheckBox("Humidity");
		pe.setEnabled(true);
		pe.addItemListener(new SignalCheckBoxClient(Ports.PORT_LOADER_PLANT, Ports.SIGNAL_PUSHER_EXTEND));
//		JCheckBox pr = new JCheckBox("vacOff");
//		pr.setEnabled(false);
//		pr.addItemListener(new SignalCheckBoxClient(Ports.PORT_LOADER_CONTROLLER, Ports.SIGNAL_VACOFF));
		JCheckBox vo = new JCheckBox("Occupancy");
		vo.setEnabled(true);
		vo.addItemListener(new SignalCheckBoxClient(Ports.PORT_LOADER_PLANT, Ports.SIGNAL_VACON));
		JCheckBox as = new JCheckBox("Smoke");
		as.setEnabled(true);
		as.addItemListener(new SignalCheckBoxClient(Ports.PORT_LOADER_PLANT, Ports.SIGNAL_ARM_SOURCE));
		JCheckBox ad = new JCheckBox("Working Hours");
		ad.setEnabled(true);
		ad.addItemListener(new SignalCheckBoxClient(Ports.PORT_LOADER_PLANT, Ports.SIGNAL_ARM_DEST));

		JPanel pan2 = new JPanel(new GridLayout(2, 2));
		pan2.add(pe);
//		pan2.add(pr);
		pan2.add(vo);
		pan2.add(as);
		pan2.add(ad);
		pan2.setBorder(BorderFactory.createTitledBorder("Other Signals"));
		src.setCheckBoxComponent(pan2);

		JPanel pan3 = new JPanel(new GridLayout(0, 2));
		pan3.add(pan);
		pan3.add(pan2);
		c.gridx = 0;
		c.gridy = 2;
		this.add(pan3,c);
		
		this.setTitle("ECS GUI");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
	}

	public static void main(String[] args) {
		CapLoader cl = new CapLoader();
		cl.pack();
		cl.setVisible(true);
		
		SignalServer<LoaderVizWorker> server = new SignalServer<LoaderVizWorker>(Ports.PORT_LOADER_VIZ, LoaderVizWorker.class);
		new Thread(server).start();
		while(true){
			try {
				cl.repaint();
				Thread.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
