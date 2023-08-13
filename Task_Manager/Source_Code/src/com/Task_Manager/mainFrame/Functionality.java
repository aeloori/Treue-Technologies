package com.Task_Manager.mainFrame;

import java.awt.SystemTray;
import java.awt.TrayIcon.MessageType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedList;

public class Functionality extends MainFrame{
	public static LinkedList<String> tasksNames;
	static LinkedList<String> taskDescText;
	public static  LinkedList<String> startDates;
	static LinkedList<String> endDates;
	static LinkedList<String> ringtones;
	static LinkedList<Integer> priorities;
	static int index=0;
	static int selected;
	static String tempTaskName;
	static String tempTaskDesc;
	static String tempStartDate;
	static String tempEndDate;
	static String tempRingtone;
	
	static int temps;
	
	public static void main()
	{
		initiateList();
		btnAddTask();
		listFunction();
//		delFunction();
//		updateFunction();
	}
	
	private static void updateFunction() {
		updateTask.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(tempTaskName!=taskNameInput.getText() || tempTaskName!=taskDescBox.getText()||tempStartDate!=startDateInput.getText()||tempEndDate!=endDateInput.getText()||tempRingtone!=ringtoneInput.getText())
				{
					updateValues();
					temps=selected;
					System.out.println("\n updated data is ");
					System.out.println("\ntaskName saved at index "+index+" is : "+tasksNames.get(temps));
					System.out.println("task Description saved at index "+index+" is : "+taskDescText.get(temps));
					System.out.println("Start date saved at index "+index+" is : "+startDates.get(temps));
					System.out.println("End date saved at index "+index+" is : "+endDates.get(temps));
					System.out.println("ringtones saved at index "+index+" is : "+ringtones.get(temps));
					System.out.println();
				}
			}
		});
	}

	protected static void updateValues() {
		tasksNames.set(selected,taskNameInput.getText());
		task.set(selected, taskNameInput.getText());
		taskDescText.set(selected, taskDescBox.getText());
		startDates.set(selected,startDateInput.getText());
		endDates.set(selected, endDateInput.getText());
		ringtones.set(selected, ringtoneInput.getText());
	}

	private static void delFunction() {
		deleteTask.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tasksNames.remove(selected);
				taskDescText.remove(selected);
				startDates.remove(selected);
				endDates.remove(selected);
				ringtones.remove(selected);
				
				task.remove(selected);
				System.out.println("\n list item Replaced with "+tasksNames.get(selected));
			}
		});
	}

	private static void listFunction() {
		
		taskList.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e)
			{
				selected = taskList.getSelectedIndex();
				System.out.println("the index which is selected is "+selected);
	             System.out.println("Selected list items is "+selected); 
	             frame.add(leftPanel1);
	             frame.validate();
	             frame.repaint();
	             setInputFields(taskList.getSelectedIndex());
	             updateFunction();
	             delFunction();
			}
			
		});
		
		 
	}

	private static void initiateList() {
		tasksNames=new LinkedList<String>();
		taskDescText=new LinkedList<String>();
		startDates=new LinkedList<String>();
		endDates=new LinkedList<String>();
		ringtones=new LinkedList<String>();
		priorities=new LinkedList<Integer>();
	}

	public static void btnAddTask()
		{
			setTask.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
						task.addElement(taskNameInput.getText());
						frame.remove(leftPanel1);
						frame.validate();
						frame.repaint();
						setTask.setVisible(false);
						setTask.setEnabled(false);
						deleteTask.setVisible(true);
						deleteTask.setEnabled(true);
						
						updateTask.setVisible(true);
						updateTask.setEnabled(true);
						saveDetailsList();
						setInputFields();
						taskList.setEnabled(true);
						System.out.println(taskName.getText().length());
				}
			});
		}

	static void setInputFields() {
		// TODO Auto-generated method stub
		taskNameInput.setText("");
		taskDescBox.setText("");
		startDateInput.setText(null);
		endDateInput.setText(null);
		ringtoneInput.setText(null);
	}
	
	protected static void setInputFields(int i) {
		// TODO Auto-generated method stub
		taskNameInput.setText(tasksNames.get(i));
		tempTaskName=tasksNames.get(i);
		
		taskDescBox.setText(taskDescText.get(i));
		tempTaskName=tasksNames.get(i);
		
		startDateInput.setText(startDates.get(i));
		tempTaskName=tasksNames.get(i);
		
		endDateInput.setText(endDates.get(i));
		tempTaskName=tasksNames.get(i);
		
		ringtoneInput.setText(ringtones.get(i));
		tempTaskName=tasksNames.get(i);
	}

	protected static void saveDetailsList() {
		
		tasksNames.add(taskNameInput.getText());
		taskDescText.add(taskDescBox.getText());
		startDates.add(startDateInput.getText());
		endDates.add(endDateInput.getText());
		ringtones.add(ringtoneInput.getText());
			
		
			System.out.println("\ntaskName saved at index "+index+" is : "+tasksNames.get(index));
			System.out.println("task Description saved at index "+index+" is : "+taskDescText.get(index));
			System.out.println("Start date saved at index "+index+" is : "+startDates.get(index));
			System.out.println("End date saved at index "+index+" is : "+endDates.get(index));
			System.out.println("ringtones saved at index "+index+" is : "+ringtones.get(index));
			System.out.println();
			index++;
	}
}
