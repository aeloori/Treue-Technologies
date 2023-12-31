package com.Task_Manager.mainFrame;

import java.awt.Image;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.TrayIcon.MessageType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.LocalTime;
//import java.util.LinkedList;
import java.time.format.DateTimeFormatter;
import java.util.function.Function;

import javax.swing.JOptionPane;

import com.Task_Manager.Audioplayer.Music;

public class MultiThreadingthing  extends Thread{
	static Image image;
	static TrayIcon trayIcon;
	static int startIndex;
	static int endIndex;
	static String timeTxt;
//	static LocalDateTime time
	static boolean startTrip=false;
	static boolean endTrip=false;
	public static String time;
//	static LocalDate date;
	
	@Override
	public void run()
	{
		while(true)
		{
			try {
//			time=LocalDateTime.now();
			DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");  
	        time = LocalDateTime.now().format(format);
//	        System.out.println(time);
	        Thread.sleep(1000);
	        Music ring=new Music();
	        if(Functionality.startDates.contains(time)&&startTrip==false)
	        {
	        	System.out.println("Task started");
	        	SystemTray tray = SystemTray.getSystemTray();

	            Image image = Toolkit.getDefaultToolkit().createImage("some-icon.png");
	            //Image image = Toolkit.getDefaultToolkit().createImage(getClass().getResource("icon.png"));

	            TrayIcon trayIcon = new TrayIcon(image, "Java AWT Tray Demo");
	            trayIcon.setImageAutoSize(true);
	            trayIcon.setToolTip("System tray icon demo");
	            tray.add(trayIcon);
	            trayIcon.displayMessage("Reminder : Task "+Functionality.tasksNames.get(Functionality.startDates.indexOf(time)), Functionality.taskDescText.get(Functionality.startDates.indexOf(time)), MessageType.INFO);
	            startTrip=true;
	            if(Functionality.priorities.contains(time))
	            {
	            	
	            	ring.start();
	            }
	        }
	        if(Functionality.endDates.contains(time)&&endTrip==false)
	        {
	        	System.out.println("Task ended");
	        	SystemTray tray = SystemTray.getSystemTray();

	            Image image = Toolkit.getDefaultToolkit().createImage("some-icon.png");
	            //Image image = Toolkit.getDefaultToolkit().createImage(getClass().getResource("icon.png"));

	            TrayIcon trayIcon = new TrayIcon(image, "Java AWT Tray Demo");
	            trayIcon.setImageAutoSize(true);
	            trayIcon.setToolTip("System tray icon demo");
	            tray.add(trayIcon);
	            trayIcon.displayMessage("Reminder : Task Ended "+Functionality.tasksNames.get(Functionality.endDates.indexOf(time)), Functionality.taskDescText.get(Functionality.endDates.indexOf(time)), MessageType.INFO);
//	            ring.start("adventure.wav");
	            System.out.println("playing music");
//	            ring.interrupt();
	            endTrip=true;
	        }
	        else 
	        {
	        	continue;
	        }
	        
			}
			catch(Exception e)
			{
			}
	        
		}
	}
}
