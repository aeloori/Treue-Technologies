package com.Task_Manager.mainFrame;

import java.awt.EventQueue;

import javax.swing.ImageIcon;

public class Main {

	public static void main(String[] args) throws Exception 
	{
		
		
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
		MainFrame.whiteFlag=Main.class.getResource("whiteStar.png");
		MainFrame.white=new ImageIcon(MainFrame.whiteFlag);
		MainFrame.blackFlag=Main.class.getResource("blackStar.png");
		MainFrame.black=new ImageIcon(MainFrame.blackFlag);
	}
}
