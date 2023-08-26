package com.Task_Manager.mainFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedList;

import javax.swing.SwingUtilities;

public class Functionality extends MainFrame{
	
	
	public static LinkedList<String> tasksNames;
	static LinkedList<String> taskDescText;
	public static  LinkedList<String> startDates;
	static LinkedList<String> endDates;
	public static LinkedList<String> ringtones;
	public static LinkedList<String> priorities;
	static boolean flag;
	static int index=0;
	static int selected;
	static String tempTaskName;
	static String tempTaskDesc;
	static String tempStartDate;
	static String tempEndDate;
	static String tempRingtone;
	static String startDate;
	static String endDate;
	static String temp1;
	static String temp2;
	
	static int temps;
	public static boolean onFlag;
	
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
				if(tempTaskName!=taskNameInput.getText() || tempTaskName!=taskDescBox.getText()||tempStartDate!=startDate||tempEndDate!=endDate||tempRingtone!=ringtoneInput.getItemAt(ringtoneInput.getSelectedIndex()))
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
//		startDates.set(selected,startDateInput.getText());
//		endDates.set(selected, endDateInput.getText());
		ringtones.set(selected, ringtoneInput.getItemAt(ringtoneInput.getSelectedIndex()));
	}

	private static void delFunction() {
		deleteTask.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(taskList.getSelectedIndex()!=-1)
				{
					tasksNames.remove(taskList.getSelectedIndex());
					taskDescText.remove(taskList.getSelectedIndex());
					startDates.remove(taskList.getSelectedIndex());
					endDates.remove(taskList.getSelectedIndex());
					ringtones.remove(taskList.getSelectedIndex());
					
					task.remove(taskList.getSelectedIndex());
				}
				else
				{
					System.out.println("Index out of bound "+taskList.getSelectedIndex());
					System.out.println("Items in linkd list is "+taskDescText.size());
				}
//				System.out.println("\n list item Replaced with "+tasksNames.get(selected));
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
		priorities=new LinkedList<String>();
	}
	
	public static void dateFun() {
		temp1=getMonthNumber(startCal.monthsList.getSelectedIndex());
		temp2=getMonthNumber(endCal.monthsList.getSelectedIndex());
		startDate=startCal.datesList.getItemAt(startCal.datesList.getSelectedIndex())+"-"+temp1+"-"+
				startCal.yearsList.getItemAt(startCal.yearsList.getSelectedIndex())+" "+startCal.hourList.getItemAt(startCal.hourList.getSelectedIndex())
				+":"+startCal.minutesList.getItemAt(startCal.minutesList.getSelectedIndex());
		
		
		
		endDate=endCal.datesList.getItemAt(endCal.datesList.getSelectedIndex())+"-"+temp2+"-"+
				endCal.yearsList.getItemAt(endCal.yearsList.getSelectedIndex())+" "+endCal.hourList.getItemAt(endCal.hourList.getSelectedIndex())
				+":"+endCal.minutesList.getItemAt(endCal.minutesList.getSelectedIndex());
	}
	
	private static String getMonthNumber(int selectedIndex) {
		String temp="";
		if((selectedIndex+"").length()==1)
		{
			temp+="0"+selectedIndex;
		}
		else
		{
			temp+=selectedIndex;
		}
		return temp;
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
						dateFun();
						saveDetailsList();
						flagFun();
						setInputFields();
						taskList.setEnabled(true);
						System.out.println(taskName.getText().length());
				}

				
			});
		}

	static void setInputFields() {
		taskNameInput.setText("");
		taskDescBox.setText("");
		ringtoneInput.setSelectedItem(0);
	}
	
	protected static void setInputFields(int i) {
		taskNameInput.setText(tasksNames.get(i));
		tempTaskName=tasksNames.get(i);
		
		taskDescBox.setText(taskDescText.get(i));
		tempTaskName=tasksNames.get(i);
		
		tempTaskName=tasksNames.get(i);
		
		tempTaskName=tasksNames.get(i);
		
//		ringtoneInput.setitem(ringtones.get(i));
		tempTaskName=tasksNames.get(i);
		if(priorities.contains(startDates.get(i)))
		{
			starBtn.setIcon(BlackIconImage);
		}
		else
		{
			starBtn.setIcon(whiteIconImage);
		}
	}

	protected static void saveDetailsList() {
		
		tasksNames.add(taskNameInput.getText());
		taskDescText.add(taskDescBox.getText());
//		startDates.add(startDateInput.getText());
		startDates.add(startDate);
		endDates.add(endDate);
		ringtones.add(ringtoneInput.getItemAt(ringtoneInput.getSelectedIndex()));
			
		
			System.out.println("\ntaskName saved at index "+index+" is : "+tasksNames.get(index));
			System.out.println("task Description saved at index "+index+" is : "+taskDescText.get(index));
			System.out.println("Start date saved at index "+index+" is : "+startDates.get(index));
			System.out.println("End date saved at index "+index+" is : "+endDates.get(index));
			System.out.println("ringtones saved at index "+index+" is : "+ringtones.get(index));
			System.out.println();
			index++;
	}

	public static String getStartDates() {
		// TODO Auto-generated method stub
		String temp;
		if(startCal.monthsList.getSelectedIndex()<=9)
		{
			temp=startCal.datesList.getItemAt(startCal.datesList.getSelectedIndex())+"-"+"0"+startCal.monthsList.getSelectedIndex()+"-"+
					startCal.yearsList.getItemAt(startCal.yearsList.getSelectedIndex())+" "+startCal.hourList.getItemAt(startCal.hourList.getSelectedIndex())
					+":"+startCal.minutesList.getItemAt(startCal.minutesList.getSelectedIndex());
		}
		else
		{
			temp=startCal.datesList.getItemAt(startCal.datesList.getSelectedIndex())+"-"+startCal.monthsList.getSelectedIndex()+"-"+
					startCal.yearsList.getItemAt(startCal.yearsList.getSelectedIndex())+" "+startCal.hourList.getItemAt(startCal.hourList.getSelectedIndex())
					+":"+startCal.minutesList.getItemAt(startCal.minutesList.getSelectedIndex());
		}
		return temp;
	}

	public static void flagFun()
	{	String temp=getStartDates();
		if(onFlag==true)
		{
			starBtn.setIcon(BlackIconImage);
			Functionality.priorities.add(temp);
			if(Functionality.priorities.contains(temp))
			{
				System.out.println("added successfully");
				System.out.println(temp);
			}
		}
		else
		{
			starBtn.setIcon(whiteIconImage);
			Functionality.priorities.remove(temp);
			if(Functionality.priorities.contains(temp)==false)
			{
				System.out.println("removed successfully");
				System.out.println(temp);
			}
		}
	}
}
