package edu.wmich.cs1120.MaxChen.LA7;

public class Course implements ICourse{
	String coname;
	int conum;
	int max;

	public Course(String coname, int conum, int max) {
		// TODO Auto-generated constructor stub
		this.coname = coname;
		this.conum = conum;
		this.max = max;
		
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void addStudent(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printClassList() {
		// TODO Auto-generated method stub
		
	}

}
