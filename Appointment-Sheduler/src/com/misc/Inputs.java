package com.misc;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Inputs extends JTextField{
	public Inputs(int x,int y, int w, int h)
	{	
		// this.setColumns(10);
		this.setText("");
		this.setBounds(x, y, w, h);
		this.setBackground(Color.decode("#D9D9D9"));
		this.setBorder(BorderFactory.createEmptyBorder());
		this.setFont(new Font("Serif", Font.BOLD, 16));
		this.setHorizontalAlignment(SwingConstants.CENTER);
	}
}
