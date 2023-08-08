package com.misc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;



public class ProjectObj {
	public static Connection conn; // sql connection
	public static Statement smt;//sql statement
	public static ResultSet ans;//sql result set for values info 
	
	public static final String url="jdbc:mysql://localhost:3306/appointmentsheduler";//mysql url
    public static final String user="root";//mysql username
    public static final String password ="root";//mysql password
    
    //admin page
    public static Frames frame;
    
    //buttons
    public static Buttons todaysApp;
    public static Buttons tommorowsApp;
    public static Buttons fetchApp;
}
