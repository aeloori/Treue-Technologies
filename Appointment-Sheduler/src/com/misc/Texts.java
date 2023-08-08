package com.misc;

public class Texts {
	public static final String table="test ";
	public static String selectAll="select * from ";
	public static String select ="select ";
	public static String where="where ";
	public static String insert="insert into ";
	public static String insertValues;
	
	public static void insertValue(String ans[],String column[],String table)
	{
		insertValues="insert into "+table+"(";
		for(int j=0;j<column.length-1;j++)
		{
			insertValues+=column[j]+",";
		}
		insertValues+=column[column.length-1]+") values(";
		
		
		for(int i=0;i<ans.length-1;i++)
		{
			insertValues+=ans[i]+",";
		}
		insertValues+=ans[ans.length-1]+")";
		System.out.println("query is " +insertValues);
	}
}
