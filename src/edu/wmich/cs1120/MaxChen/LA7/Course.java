package edu.wmich.cs1120.MaxChen.LA7;

import java.util.*;

public class Course implements ICourse{
	public String coname;
	public int conum;
	public int max;
	public List <String> students;
	public Course(String coname, int conum, int max) {
		// TODO Auto-generated constructor stub
		this.coname = coname;
		this.conum = conum;
		this.max = max;
		this.students = new ArrayList<String>();
		System.out.println(coname+ ", " + conum+", " + max);
	}
	
	@Override
	/**
	 * @return if the course is full
	 * see if the course is full or not
	 */
	public boolean isFull() {
		// TODO Auto-generated method stub
		if (this.students.size() >= this.max) {
			return true;
		}
		else {
		return false;
		}
	}

	@Override
/**
 * @param
 * add student in to the students list
 */
	public void addStudent(String name) {
		// TODO Auto-generated method stub
		if(isFull() == false) {
			this.students.add(name);
		}
		
	}
	public String getname() {
		return coname;
	}
	public int getnum() {
		return conum;
	}

	public void printClassList() {
		// TODO Auto-generated method stub
		System.out.println("Class List for CS 1040");
		for (int i = 0; i < students.size(); i++)
		System.out.println(students.get(i));
	}

}
