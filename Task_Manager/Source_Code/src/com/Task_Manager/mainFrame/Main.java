package com.Task_Manager.mainFrame;

import java.awt.EventQueue;

import javax.swing.ImageIcon;

import com.Task_Manager.Audioplayer.Music;

public class Main {

	public static void main(String[] args) throws Exception 
	{
		MainFrame.whiteIcon=Main.class.getResource("whiteStar.png");
		MainFrame.whiteIconImage=new ImageIcon("whiteStar.png");
		
		MainFrame.blackIcon=Main.class.getResource("blackStar.png");
		MainFrame.BlackIconImage=new ImageIcon("blackStar.png");
		
		MultiThreadingthing clock =new MultiThreadingthing();
		
		
//		Thread clock= new Thread(new MultiThreadingthing());
		clock.start();
		EventQueue.invokeLater(new Runnable() {
			
			@Override
		public void run() 
		{
				
				MainFrame.run();
				Functionality.main();
		}});
		
	}
}
