package com.misc;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class Buttons extends JButton{
	public Buttons(int x,int y,int w,int h,String name)
	{
		this.setBounds(x, y, w, h);
		this.setText(name);
		this.setBackground(Color.decode("#219EBC"));
		this.setVisible(true);
		this.setBorder(BorderFactory.createEmptyBorder());
		this.setFont(new Font("Serif", Font.BOLD, 16));
		this.setFocusable(false);
		this.setFont(new Font("Serif", Font.BOLD, 16));
		this.setVerticalTextPosition(this.CENTER);
		this.setHorizontalTextPosition(this.CENTER);
		
	}
}
