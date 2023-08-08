package com.AdminSide;

import com.misc.Buttons;
import com.misc.Frames;
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
		ProjectObj.frame.add(ProjectObj.todaysApp);
	}
	
	//initialize components
	public static void initialize()
	{
		ProjectObj.frame=new Frames();
		ProjectObj.todaysApp=new Buttons(53,594,258,53,"Download Today’s Appointment");
	}
}
