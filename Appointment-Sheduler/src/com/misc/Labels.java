package com.misc;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class Labels extends JLabel
{
	public Labels(String text,int x,int y, int w, int h)
	{
		this.setText(text);
		this.setFont(new Font("Serif", Font.BOLD, 20));
		this.setSize(w,h);
		this.setLocation(x,y);
		this.setForeground(Color.black);
		
	}
	
	public Labels(String text,int x,int y, int w, int h,int s)
	{
		this.setText(text);
		this.setFont(new Font("Serif", Font.BOLD, s));
		this.setSize(w,h);
		this.setLocation(x,y);
		this.setForeground(Color.black);
		
	}
}
