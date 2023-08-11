package com.AdminSide;


import javax.swing.JLabel;

import com.misc.Buttons;
import com.misc.Frames;
import com.misc.Inputs;
import com.misc.Labels;
import com.misc.ProjectObj;

public class Run extends ProjectObj{
	public static void main()
	{
		initialize();
		addComp();
	}
	
	//add components
	public static void addComp()
	{
		frame.add(todaysApp);		//download todays appointment button added to the frame
		frame.add(tommorowsApp);	//download tomorrows appointment button added to the frame
		frame.add(fetchApp);		//fetch details buttton added to the frame
		
//		adding labels to frame
		frame.add(docNameLabel);
		frame.add(patNameLabel);
		frame.add(dateOfLabel);
		frame.add(timeOfLabel);

//		adding inputs field to frame
		frame.add(docNameInput);
		frame.add(patNameInput);
		frame.add(dateOfApp);
		frame.add(timeOfApp);
		frame.add(imgLabel);
		
		
		
		
		
		System.out.println("All components add to the frame succesfully");
	}
	
	//initialize components
	public static void initialize()
	{
		frame=new Frames(); 	//frame initalized
		
		//button initialization
		todaysApp=new Buttons(53,594,258,53,"Download Today’s Appointment");		//button for download todays appointment initalized
		tommorowsApp=new Buttons(339,594,292,53,"Download Tomorrow's Appointment");	//button for download tomorrow's appointment initalized
		fetchApp=new Buttons(567,496,176,54,"Fetch Appointmetns");					//button for fetch appoint ment initalized
		
		//label initialization
		docNameLabel=new Labels("Select Doctor Name *",571,62,165,19,16);
		patNameLabel=new Labels("Patient Name",571,168,103,19,16);
		dateOfLabel=new Labels("Date of Appointment *",571,274,170,19,16);
		timeOfLabel=new Labels("Time of Appointment",571,380, 159, 19,16);
		
		//Input field initialization
		docNameInput=new Inputs(571, 95, 244, 36);
		patNameInput=new Inputs(571,201,244,36);
		dateOfApp=new Inputs(571,307,244,36);
		timeOfApp=new Inputs(571,413,244,36);
		
//		appImageUrl=Run.class.getResource("NavBar_Logo.png");
		JLabel imgLabel=new JLabel(appImageIcon);

		System.out.println("Components initialized successfully");
	}
}
