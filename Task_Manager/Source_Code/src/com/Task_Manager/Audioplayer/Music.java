package com.Task_Manager.Audioplayer;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

import com.Task_Manager.mainFrame.Functionality;
import com.Task_Manager.mainFrame.MultiThreadingthing;

public class Music extends Thread {
	static String ringtone;
	static int option;
	
	public void run()  {
//		Scanner sc=new Scanner(System.in);
		OptBox opt=new OptBox();
			int i=getIndex();
			if(Functionality.ringtones.get(i)!="Ringtone")
			{
				ringtone=Functionality.ringtones.get(i);
				System.out.println("ringtone is : "+ringtone);
				
			}
			else
			{
				ringtone="adventure.wav";
				System.out.println("ringtone is : "+ringtone);
			}
			File audioFile=new File(ringtone);
			try
			{
				AudioInputStream audio=AudioSystem.getAudioInputStream(audioFile); 
				Clip audioClip=AudioSystem.getClip();
				audioClip.open(audio);
				opt.start();
				while(OptBox.i!=JOptionPane.YES_OPTION || OptBox.i!=JOptionPane.NO_OPTION || OptBox.i!=JOptionPane.CANCEL_OPTION)
				{
					audioClip.start();
				}
				audioClip.stop();
				audioClip.close();
			}
			catch (Exception  e) {
			}
	}


	private int getIndex() {
		int i=Functionality.startDates.indexOf(MultiThreadingthing.time);
		return i;
	}
}
