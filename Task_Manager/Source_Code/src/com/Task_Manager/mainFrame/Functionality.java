package com.Task_Manager.mainFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedList;

public class Functionality extends MainFrame{
	static LinkedList<String> tasksNames;
	static LinkedList<String> taskDescText;
	static LinkedList<String> startDates;
	static LinkedList<String> endDates;
	static LinkedList<String> ringtones;
	static LinkedList<Integer> priorities;
	static int index=0;
	
	public static void main()
	{
		initiateList();
		btnAddTask();
		listFunction();
	}
	
	private static void listFunction() {
		
		taskList.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e)
			{
				String selected="";
				 if (taskList.getSelectedIndex() != -1) {                       
		             selected = taskList.getSelectedValue();   
		             System.out.println("Selected list items is "+selected); 
		             frame.add(leftPanel1);
		             frame.validate();
		             frame.repaint();
		             setInputFields(taskList.getSelectedIndex());
		          } 
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
		taskDescBox.setText(taskDescText.get(i));
		startDateInput.setText(startDates.get(i));
		endDateInput.setText(endDates.get(i));
		ringtoneInput.setText(ringtones.get(i));
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
