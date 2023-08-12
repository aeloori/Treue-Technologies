package com.Task_Manager.mainFrame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class MainFrame
{
//	components
	private static  JFrame frame;
	
	private static JButton addTaskBtn;
	
//	taskList
	private  static JPanel listPanel;
	private static DefaultListModel<String> task;
	private static JList<String> taskList;
	private static JScrollPane taskListScroll;
	
//	task name
	private static JLabel taskName;
	private static JTextField taskNameInput;
	private static JButton starBtn;

//	taskdesc
	private static JLabel taskDesc;
	private static JTextArea taskDescBox;
	
//	startdate
	private static JLabel startDate;
	private static JTextField startDateInput;
	
//	enddate
	private static JLabel endDate;
	private static JTextField endDateInput;
	
//	ringtone set
	private static JLabel ringtone;
	private static JTextField ringtoneInput;
	
//	set task
	private static JButton setTask;
	
	
	
	final private static Font font=new Font("Tahoma",Font.PLAIN,20);
	final private static Font fontM=new Font("Tahoma",Font.PLAIN,16);
	final private static Font fontB=new Font("Tahoma",Font.BOLD,20);
	
	public static void run()
	{
		initialize();
		add();
	}

	private static void add() {
		frame.add(addTaskBtn);
		listPanel.add(taskList);
		listPanel.add(taskListScroll);
		frame.add(listPanel);
		frame.add(taskName);
		frame.add(taskNameInput);
		frame.add(starBtn);
		frame.add(taskDesc);
		frame.add(taskDescBox);
		frame.add(startDate);
		frame.add(startDateInput);
		frame.add(endDate);
		frame.add(endDateInput);
		frame.add(ringtone);
		frame.add(ringtoneInput);
		frame.add(setTask);
	}

	private static void initialize() {
		UIManager.put("Button.select", "#219EBC");
		
		
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
		taskList.setFixedCellHeight(50);
		
//		scrollpane for tasklist
		taskListScroll=new JScrollPane(taskList);
		taskListScroll.setBounds(10,10, 387, 560);
		taskListScroll.setBorder(null);
		
//		task input box with label
		
		//label
		taskName =new JLabel();
		taskName.setBounds(492, 90, 105, 24);
		taskName.setText("Task Name");
		taskName.setFont(font);

		//box
		taskNameInput=new JTextField();
		taskNameInput.setBounds(492, 140, 326, 44);
		taskNameInput.setColumns(10);
		taskNameInput.setBackground(Color.decode("#D9D9D9"));
		taskNameInput.setFont(fontM);
		taskNameInput.setBorder(null);
		taskNameInput.addActionListener(e);
		
		//task flag
		starBtn=new JButton();
		starBtn.setBounds(851,140,44,44);
		starBtn.setBackground(Color.decode("#219EBC"));
		starBtn.setFocusable(false);
		starBtn.setBorder(null);
		
		
//		task description
		
		//label
		taskDesc =new JLabel();
		taskDesc.setBounds(492, 220, 101,24);
		taskDesc.setText("Task Name");
		taskDesc.setFont(font);
		
		//desc box
		taskDescBox=new	JTextArea();
		taskDescBox.setBounds(492, 280, 452, 101);
		taskDescBox.setBackground(Color.decode("#D9D9D9"));
		taskDescBox.setFont(fontM);
		taskDescBox.setBorder(null);
		
//		date of start
		
		//label
		startDate =new JLabel();
		startDate.setBounds(492,430, 122,24);
		startDate.setText("Date of start");
		startDate.setFont(font);
		
		//input
		startDateInput=new JTextField();
		startDateInput.setBounds(674,420, 326, 44);
		startDateInput.setColumns(16);
		startDateInput.setBackground(Color.decode("#D9D9D9"));
		startDateInput.setFont(fontM);
		startDateInput.setBorder(null);
		
//		date of end
		//label
		endDate =new JLabel();
		endDate.setBounds(492, 510, 122,24);
		endDate.setText("End date");
		endDate.setFont(font);
		
		//input
		endDateInput=new JTextField();
		endDateInput.setBounds(674,500, 326, 44);
		endDateInput.setColumns(16);
		endDateInput.setBackground(Color.decode("#D9D9D9"));
		endDateInput.setFont(fontM);
		endDateInput.setBorder(null);
		
//		Ringtone
		//label
		ringtone =new JLabel();
		ringtone.setBounds(492, 590, 87	,24);
		ringtone.setText("Ringtone");
		ringtone.setFont(font);
		
		//input
		ringtoneInput=new JTextField();
		ringtoneInput.setBounds(674,580, 326, 44);
		ringtoneInput.setColumns(16);
		ringtoneInput.setBackground(Color.decode("#D9D9D9"));
		ringtoneInput.setFont(fontM);
		ringtoneInput.setBorder(null);
		
//		set task button
		setTask=new JButton("SET TASK");
		setTask.setFont(fontB);
		setTask.setBackground(Color.decode("#219EBC"));
		setTask.setBounds(1060,576,163,51);
		setTask.setFocusable(false);
		setTask.setBorder(null);
	}
}