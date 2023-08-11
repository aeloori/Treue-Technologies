package com.misc;

import java.awt.Color;

import javax.swing.JLabel;

public class Panels extends JLabel {
	public Panels(int xPos,int yPos,int width,int height)
	{
		this.setBounds(xPos, yPos,width,height);
		this.setLayout(null);
	}
	public Panels(int xPos,int yPos,int width,int height,String color)
	{
		this.setBounds(xPos, yPos,width,height);
		this.setBackground(Color.decode(color));
		this.setLayout(null);
	}
}
