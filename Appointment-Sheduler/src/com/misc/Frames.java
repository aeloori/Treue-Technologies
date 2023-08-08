package com.misc;

import javax.swing.JFrame;

public class Frames extends JFrame {
	public Frames()
	{
		this.setSize(1280,720);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);
		this.setTitle("Appointments");
		this.setLayout(null);
	}
	
	public Frames(int width,int height)
	{
		this.setSize(width,height);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);
		this.setTitle("Appointments");
		this.setLayout(null);
	}
	
	public Frames(boolean pack)
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setTitle("Appointments");
		this.pack();
//		this.setLayout(null);
	}
}
