package com.Task_Manager.Audioplayer;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class OptBox extends Thread {
	public static int i=10;
	public void run()
	{
		JFrame frame=new JFrame();
		frame.setVisible(false);
		frame.setAlwaysOnTop(true);
		i=JOptionPane.showConfirmDialog(frame,"Is The Task started performed?");
		System.out.println(i);
	}
}
