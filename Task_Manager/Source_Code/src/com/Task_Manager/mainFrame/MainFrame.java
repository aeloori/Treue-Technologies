package com.Task_Manager.mainFrame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.net.URI;
import java.net.URL;

//import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
//import javax.swing.UIManager;

public class MainFrame
{
//	this classs object
	static MainFrame startCal;
	static MainFrame endCal;
	
//	components
	protected static  JFrame frame;
	
	protected static JButton addTaskBtn;
	
//	taskList
	protected  static JPanel listPanel;
	protected static DefaultListModel<String> task;
	protected static JList<String> taskList;
	protected static JScrollPane taskListScroll;
	
	protected static JPanel leftPanel1;
	
//	task name
	protected static JLabel taskName;
	protected static JTextField taskNameInput;
	protected static JButton starBtn;

//	taskdesc
	protected static JLabel taskDesc;
	protected static JTextArea taskDescBox;
	
//	startdate
	protected static JLabel startDate;
	protected JComboBox<String> monthsList;
	protected JComboBox<String> datesList;
	protected JComboBox<String> yearsList;
	
	protected JComboBox<String> hourList;
	protected JComboBox<String> minutesList;
	
//	enddate
	protected static JLabel endDate;
	protected static JTextField endDateInput;
	
//	ringtone set
	protected static JLabel ringtone;
	protected static JComboBox<String> ringtoneInput;
//	set task
	protected static JButton setTask;
	protected static JButton updateTask;
	protected static JButton deleteTask;
	
	public static URL whiteIcon;
	public static URL blackIcon;
	public static Icon whiteIconImage;
	public static Icon BlackIconImage;
	
	final protected static String[] monthsArry= {"Months","January","Febuary","March","April","May","June","July","August","September","October","November","December"};
	final protected static String[] dateArry= {"date","01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
	final protected static String[] yearArry= {"Year","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023","2024","2025","2026","2027","2028","2029","2030","2031"};
	final protected static String[] hourArry= {"Hour","01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","00"};
	final protected static String[] minutesArray= {"Minutes","01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32","33","34","35","36","37","38","39","40","41","42","43","44","45","46","47","48","49","50","51","52","53","54","55","56","57","58","59","60"};
	final protected static String[] ringtoneArray= {"Ringtone","adventure.wav","Chime.wav","DynuTz.wav","NCS.wav","Pill.wav"};
	
	final private static Font font=new Font("Tahoma",Font.PLAIN,20);
	final private static Font fontS=new Font("Tahoma",Font.PLAIN,14);
	final private static Font fontM=new Font("Tahoma",Font.PLAIN,16);
	final private static Font fontB=new Font("Tahoma",Font.BOLD,20);
	public static boolean starFlag;
	
	final private static void addTask()
	{
		addTaskBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				SwingUtilities.invokeLater(new Runnable() {
					
					@Override
					public void run() {
//						Functionality.flag=false;
						
						taskList.clearSelection();
						taskList.setEnabled(false);
//						Functionality.setInputFields();
						setTask.setVisible(true);
						setTask.setEnabled(true);
						deleteTask.setVisible(false);
						deleteTask.setEnabled(false);
						updateTask.setVisible(false);
						updateTask.setEnabled(false);
//						starBtn.setIcon(whiteIconImage);
						frame.add(leftPanel1);
						toggleStar();
						frame.validate();
						frame.repaint();
						
//						Functionality.getPriority();
						
//						taskList.setEnabled(true);
					}

					private void toggleStar() {
						// TODO Auto-generated method stub
						starFlag=false;
						starBtn.setIcon(whiteIconImage);
						starBtn.addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {
								
								if(starFlag==false)
								{
									starBtn.setIcon(BlackIconImage);
									starFlag=true;
									System.out.println("prority button flag set to "+starFlag);
									Functionality.onFlag=true;
								}
								else
								{
									starBtn.setIcon(whiteIconImage);
									starFlag=false;
									System.out.println("prority button flag set to "+starFlag);
									Functionality.onFlag=false;
								}
							}
						});
						starBtn.validate();
						starBtn.repaint();
					}
				});
			}
		});
		
//		taskList.setEnabled(true);
	}
	
	final public static void run()
	{
		initialize();
		add();
		addTask();
	}

	final private static void add() {
		frame.add(addTaskBtn);
		listPanel.add(taskList);
		listPanel.add(taskListScroll);
		frame.add(listPanel);
		
//		right side
		//panel for add task
		leftPanel1.add(taskName);
		leftPanel1.add(taskNameInput);
		leftPanel1.add(starBtn);
		leftPanel1.add(taskDesc);
		leftPanel1.add(taskDescBox);
		leftPanel1.add(startDate);
		
//		calender day components for start 
		leftPanel1.add(startCal.datesList);
		leftPanel1.add(startCal.monthsList);
		leftPanel1.add(startCal.yearsList);
		
//		time components for start
		leftPanel1.add(startCal.hourList);
		leftPanel1.add(startCal.minutesList);
		
//		calender day components for end 
		leftPanel1.add(endCal.datesList);
		leftPanel1.add(endCal.monthsList);
		leftPanel1.add(endCal.yearsList);
		
//		time components for start
		leftPanel1.add(endCal.hourList);
		leftPanel1.add(endCal.minutesList);
		
		leftPanel1.add(endDate);
		leftPanel1.add(ringtone);
		leftPanel1.add(ringtoneInput);
		leftPanel1.add(setTask);
		leftPanel1.add(updateTask);
		leftPanel1.add(deleteTask);
		
	}

	
	public static void initialize() {
//		UIManager.put("Button.select", "#219EBC");
		startCal=new MainFrame();
		endCal=new MainFrame();
		
//		initialize Main frame
		frame=new JFrame("Task Manager");
		frame.setSize(1280, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.white);
		frame.setLayout(null);
		
//		initialize add task button
		addTaskBtn=new JButton("ADD TASK");
		addTaskBtn.setFont(font);
		addTaskBtn.setBackground(Color.decode("#219EBC"));
		addTaskBtn.setBounds(25,32,407,43);
		addTaskBtn.setFocusable(false);
		addTaskBtn.setBorder(null);
		
//		panel for list and scroll
		listPanel=new JPanel();
		listPanel.setLayout(null);
		listPanel.setBounds(25,90,407,580);
		
//		list
		task=new DefaultListModel<>(); 
		
		taskList = new JList<>(task);
//		taskList.setPreferredSize(new Dimension(200,200));
		taskList.setBackground(Color.decode("#a2d2ff"));
		taskList.setForeground(Color.black);
		taskList.setSelectionBackground(Color.decode("#264653"));
		taskList.setSelectionForeground(Color.white);
//		taskList.setBorder(null);
		taskList.setBounds(0,0,407,580);
		taskList.setFixedCellHeight(50);
		taskList.setFocusable(false);
//		taskList.setBorder(BorderFactory.createLineBorder(Color.decode("#121212"),1, true));
		
//		scrollpane for tasklist
		taskListScroll=new JScrollPane(taskList);
		taskListScroll.setBounds(10,10, 387, 560);
		taskListScroll.setBorder(null);
		
//		left side panel
		//left panel for adding task
		leftPanel1=new JPanel();
		leftPanel1.setBorder(null);
		leftPanel1.setBounds(459, 32, 796, 628);
		leftPanel1.setBackground(Color.white);
		leftPanel1.setLayout(null);
		
//		task input box with label
		
		//label
		taskName =new JLabel();
		taskName.setBounds(33, 57, 105, 24);
		taskName.setText("Task Name");
		taskName.setFont(font);

		//box
		taskNameInput=new JTextField();
		taskNameInput.setBounds(33, 107, 326, 44);
		taskNameInput.setColumns(10);
		taskNameInput.setBackground(Color.decode("#D9D9D9"));
		taskNameInput.setFont(fontM);
		taskNameInput.setBorder(null);
		
		//task flag
		starBtn=new JButton();
		starBtn.setBounds(392,107,44,44);
		starBtn.setBackground(Color.decode("#219EBC"));
		starBtn.setFocusable(false);
		starBtn.setBorder(null);
		
		
		
//		task description
		
		//label
		taskDesc =new JLabel();
		taskDesc.setBounds(33, 187, 150,24);
		taskDesc.setText("Task Discription");
		taskDesc.setFont(font);
		
		//desc box
		taskDescBox=new	JTextArea();
		taskDescBox.setBounds(33, 247, 452, 101);
		taskDescBox.setBackground(Color.decode("#D9D9D9"));
		taskDescBox.setFont(fontM);
		taskDescBox.setBorder(null);
		
		//label
		startDate =new JLabel();
		startDate.setBounds(33,397, 122,24);
		startDate.setText("Date of start");
		startDate.setFont(font);
				
		//datelist for combo box
		startCal.datesList=new JComboBox<String>(dateArry);
		startCal.datesList.setBounds(174, 398,73, 22);
		startCal.datesList.setFont(fontS);
		
		//monthsList 
		startCal.monthsList=new JComboBox<String>(monthsArry);
		startCal.monthsList.setBounds(255, 398,73, 22);
		startCal.monthsList.setFont(fontS);
		
		//yearlist for combo box
		startCal.yearsList=new JComboBox<String>(yearArry);
		startCal.yearsList.setBounds(336, 398,73, 22);
		startCal.yearsList.setFont(fontS);
		
//		time
		//hour combo box
		startCal.hourList=new JComboBox<String>(hourArry);
		startCal.hourList.setBounds(417, 398,73, 22);
		startCal.hourList.setFont(fontS);
		
		//minute combo box
		startCal.minutesList=new JComboBox<String>(minutesArray);
		startCal.minutesList.setBounds(499, 398,73, 22);
		startCal.minutesList.setFont(fontS);
		
//		date of end
		//label
		endDate =new JLabel();
		endDate.setBounds(33, 477, 122,24);
		endDate.setText("End date");
		endDate.setFont(font);
		
//		date of end
				
		//datelist for combo box
		endCal.datesList=new JComboBox<String>(dateArry);
		endCal.datesList.setBounds(174, 478,73, 22);
		endCal.datesList.setFont(fontS);
		
		//monthsList 
		endCal.monthsList=new JComboBox<String>(monthsArry);
		endCal.monthsList.setBounds(255, 478,73, 22);
		endCal.monthsList.setFont(fontS);
		
		//yearlist for combo box
		endCal.yearsList=new JComboBox<String>(yearArry);
		endCal.yearsList.setBounds(336, 478,73, 22);
		endCal.yearsList.setFont(fontS);
		
//		time
		//hour combo box
		endCal.hourList=new JComboBox<String>(hourArry);
		endCal.hourList.setBounds(417, 478,73, 22);
		endCal.hourList.setFont(fontS);
		
		//minute combo box
		endCal.minutesList=new JComboBox<String>(minutesArray);
		endCal.minutesList.setBounds(499, 478,73, 22);
		endCal.minutesList.setFont(fontS);
		
//		Ringtone
		//label
		ringtone =new JLabel();
		ringtone.setBounds(33, 557, 87	,24);
		ringtone.setText("Ringtone");
		ringtone.setFont(font);
		
		//input
		ringtoneInput=new JComboBox<String>(ringtoneArray);
		ringtoneInput.setBounds(215, 547, 326, 44);
		ringtoneInput.setFont(fontB);
		
//		set task button
		setTask=new JButton("SET TASK");
		setTask.setFont(fontB);
		setTask.setBackground(Color.decode("#219EBC"));
		setTask.setBounds(601,543,163,51);
		setTask.setFocusable(false);
		setTask.setBorder(null);
		
//		upate button
		updateTask=new JButton("Update Task");
		updateTask.setFont(fontB);
		updateTask.setBackground(Color.decode("#219EBC"));
		updateTask.setBounds(601,543,163,51);
		updateTask.setFocusable(false);
		updateTask.setBorder(null);
		
//		delete button
		deleteTask=new JButton("Delete Task");
		deleteTask.setFont(fontB);
		deleteTask.setBackground(Color.decode("#219EBC"));
		deleteTask.setBounds(601,473,163,51);
		deleteTask.setFocusable(false);
		deleteTask.setBorder(null);
	}
}