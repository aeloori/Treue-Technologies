package com.sqlUsage;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.misc.ProjectObj;
import com.misc.Texts;

public class RunQuery {
	
	public static void runQuery() throws SQLException {
		
	    
	    ProjectObj.conn=DriverManager.getConnection(ProjectObj.url,ProjectObj.user,ProjectObj.password);
	    ProjectObj.smt=ProjectObj.conn.createStatement();
	    String query="select * from test";
	    ProjectObj.ans=ProjectObj.smt.executeQuery(query);
	    while(ProjectObj.ans.next())
	    {
	    	String userName=ProjectObj.ans.getString("userName");
	    	String userPassword=ProjectObj.ans.getString("userPassword");
	    	System.out.println(userName);
	    	System.out.println(userPassword);
	    }
	    ProjectObj.ans.close();
	    ProjectObj.smt.close();
	    ProjectObj.conn.close();
	}
	
	public static void runQuery(String[] query) throws SQLException {
	    
	    Texts.insertValues="values(";
	    for(int i=0;i<query.length-1;i++)
	    {
	    	Texts.insertValues+="'"+query[i]+"'"+",";
	    }
	    Texts.insertValues+="'"+query[query.length-1]+"')";
//	    System.out.println(Texts.insertValues);
	    ProjectObj.conn=DriverManager.getConnection(ProjectObj.url,ProjectObj.user,ProjectObj.password);
	    ProjectObj.smt=ProjectObj.conn.createStatement();
	    ProjectObj.smt.executeUpdate(Texts.insert+Texts.table+Texts.insertValues);
	    System.out.println("Values inserted successfully");
	    System.out.println("Executed query is "+Texts.insert+Texts.table+Texts.insertValues);
	    
	}
}
