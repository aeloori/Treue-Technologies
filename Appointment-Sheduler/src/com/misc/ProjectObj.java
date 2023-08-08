package com.misc;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.Icon;



public class ProjectObj{
	public static Connection conn; // sql connection
	public static Statement smt;//sql statement
	public static ResultSet ans;//sql result set for values info 
	
	public static final String url="jdbc:mysql://localhost:3306/appointmentsheduler";//mysql url
    public static final String user="root";//mysql username
    public static final String password ="root";//mysql password
    
    //admin page
    public static Frames frame;
    
    //buttons
    public static Buttons todaysApp;  		//button to download todays appointment
    public static Buttons tommorowsApp;		//button to download tomorrow's appointment list    
    public static Buttons fetchApp;			//button to fetch appointments according to the inputs
    
//    input fields
    public static Inputs docNameInput;
    public static Inputs patNameInput;
    public static Inputs dateOfApp;
    public static Inputs timeOfApp;
    
//    labels to the input field
    public static Labels docNameLabel;
    public static Labels patNameLabel;
    public static Labels dateOfLabel;
    public static Labels timeOfLabel;
    
//    imgurl
    public static URL appImageUrl;
    
//    ImageIcon
    public static Icon appImageIcon;
    
}
