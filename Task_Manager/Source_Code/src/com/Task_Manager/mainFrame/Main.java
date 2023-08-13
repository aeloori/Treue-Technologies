package com.Task_Manager.mainFrame;

import java.awt.EventQueue;

public class Main {

	public static void main(String[] args) throws Exception 
	{
   	 EventQueue.invokeLater(new Runnable() {
			
			@Override
		public void run() 
		{
				MainFrame.run();
				Functionality.main();
		}});
	}
}
