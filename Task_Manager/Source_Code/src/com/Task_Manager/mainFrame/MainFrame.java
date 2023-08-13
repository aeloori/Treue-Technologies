package com.Task_Manager.mainFrame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
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
//	components
	protected static  JFrame frame;
	
	protected static JButton addTaskBtn;
	
//	taskList
	protected  static JPanel listPanel;
	protected static DefaultListModel<String> task;
	protected static JList<String> taskList;
	protected static JScrollPane taskListScroll;
	
	protected static JPanel leftPanel1;
//	protected static JPanel leftPanel2;
	
//	task name
	protected static JLabel taskName;
	protected static JTextField taskNameInput;
	protected static JButton starBtn;

//	taskdesc
	protected static JLabel taskDesc;
	protected static JTextArea taskDescBox;
	
//	startdate
	protected static JLabel startDate;
	protected static JTextField startDateInput;
	
//	enddate
	protected static JLabel endDate;
	protected static JTextField endDateInput;
	
//	ringtone set
	protected static JLabel ringtone;
	protected static JTextField ringtoneInput;
	
//	set task
	protected static JButton setTask;
	protected static JButton updateTask;
	protected static JButton deleteTask;
	
	
	
	final private static Font font=new Font("Tahoma",Font.PLAIN,20);
	final private static Font fontM=new Font("Tahoma",Font.PLAIN,16);
	final private static Font fontB=new Font("Tahoma",Font.BOLD,20);
	
	final private static void addTask()
	{
		addTaskBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				SwingUtilities.invokeLater(new Runnable() {
					
					@Override
					public void run() {
						taskList.clearSelection();
						taskList.setEnabled(false);
						Functionality.setInputFields();
						setTask.setVisible(true);
						setTask.setEnabled(true);
						deleteTask.setVisible(false);
						deleteTask.setEnabled(false);
						updateTask.setVisible(false);
						updateTask.setEnabled(false);
						frame.add(leftPanel1);
						frame.validate();
						frame.repaint();
//						taskList.setEnabled(true);
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
		leftPanel1.add(startDateInput);
		leftPanel1.add(endDate);
		leftPanel1.add(endDateInput);
		leftPanel1.add(ringtone);
		leftPanel1.add(ringtoneInput);
		leftPanel1.add(setTask);
		leftPanel1.add(updateTask);
		leftPanel1.add(deleteTask);
		
		//panel for existing task
//		leftPanel2.add(taskName);
//		leftPanel2.add(taskNameInput);
//		leftPanel2.add(starBtn);
//		leftPanel2.add(taskDesc);
//		leftPanel2.add(taskDescBox);
//		leftPanel2.add(startDate);
//		leftPanel2.add(startDateInput);
//		leftPanel2.add(endDate);
//		leftPanel2.add(endDateInput);
//		leftPanel2.add(ringtone);
//		leftPanel2.add(ringtoneInput);
//		leftPanel2.add(deleteTask);
//		leftPanel2.add(updateTask);
		
		
	}

	final private static void initialize() {
//		UIManager.put("Button.select", "#219EBC");
		
		
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
		
		//left panel for existing task edit
//		leftPanel2=new JPanel();
//		leftPanel2.setBorder(null);
//		leftPanel2.setBounds(459, 32, 796, 628);
//		leftPanel2.setBackground(Color.white);
//		leftPanel2.setLayout(null);
		
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
		
//		date of start
		
		//label
		startDate =new JLabel();
		startDate.setBounds(33,397, 122,24);
		startDate.setText("Date of start");
		startDate.setFont(font);
		
		//input
		startDateInput=new JTextField();
		startDateInput.setBounds(215,387, 326, 44);
		startDateInput.setColumns(16);
		startDateInput.setBackground(Color.decode("#D9D9D9"));
		startDateInput.setFont(fontM);
		startDateInput.setBorder(null);
		
//		date of end
		//label
		endDate =new JLabel();
		endDate.setBounds(33, 477, 122,24);
		endDate.setText("End date");
		endDate.setFont(font);
		
		//input
		endDateInput=new JTextField();
		endDateInput.setBounds(215,467, 326, 44);
		endDateInput.setColumns(16);
		endDateInput.setBackground(Color.decode("#D9D9D9"));
		endDateInput.setFont(fontM);
		endDateInput.setBorder(null);
		
//		Ringtone
		//label
		ringtone =new JLabel();
		ringtone.setBounds(33, 557, 87	,24);
		ringtone.setText("Ringtone");
		ringtone.setFont(font);
		
		//input
		ringtoneInput=new JTextField();
		ringtoneInput.setBounds(215,547, 326, 44);
		ringtoneInput.setColumns(16);
		ringtoneInput.setBackground(Color.decode("#D9D9D9"));
		ringtoneInput.setFont(fontM);
		ringtoneInput.setBorder(null);
		
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