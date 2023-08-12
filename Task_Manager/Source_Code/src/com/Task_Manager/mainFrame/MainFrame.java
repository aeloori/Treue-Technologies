package com.Task_Manager.mainFrame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
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
	
	private static JPanel leftPanel;
	
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
	
	public static void addTask()
	{
		addTaskBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				SwingUtilities.invokeLater(new Runnable() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						frame.add(leftPanel);
						frame.validate();
	                    frame.repaint();
					}
				});
			}
		});
		
		setTask.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				task.addElement(taskNameInput.getText());
				frame.remove(leftPanel);
				frame.validate();
				frame.repaint();
			}
		});
	}
	
	public static void run()
	{
		initialize();
		add();
		addTask();
	}

	private static void add() {
		frame.add(addTaskBtn);
		listPanel.add(taskList);
		listPanel.add(taskListScroll);
		frame.add(listPanel);
		
//		right side
		leftPanel.add(taskName);
		leftPanel.add(taskNameInput);
		leftPanel.add(starBtn);
		leftPanel.add(taskDesc);
		leftPanel.add(taskDescBox);
		leftPanel.add(startDate);
		leftPanel.add(startDateInput);
		leftPanel.add(endDate);
		leftPanel.add(endDateInput);
		leftPanel.add(ringtone);
		leftPanel.add(ringtoneInput);
		leftPanel.add(setTask);
//		frame.add(leftPanel);
	}

	private static void initialize() {
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
		taskList.setBounds(0,0,407,580);
		taskList.setFixedCellHeight(50);
		taskList.setBorder(BorderFactory.createLineBorder(Color.decode("#121212"),1, true));
		
//		scrollpane for tasklist
		taskListScroll=new JScrollPane(taskList);
		taskListScroll.setBounds(10,10, 387, 560);
		taskListScroll.setBorder(null);
		
//		left side panel
		leftPanel=new JPanel();
		leftPanel.setBorder(null);
		leftPanel.setBounds(459, 32, 796, 628);
		leftPanel.setBackground(Color.white);
		leftPanel.setLayout(null);
		
		
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
	}
}