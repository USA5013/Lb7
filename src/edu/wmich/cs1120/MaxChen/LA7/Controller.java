package edu.wmich.cs1120.MaxChen.LA7;

import java.io.*;
import java.util.ArrayList;



public class Controller implements IController{
	BufferedReader fileIn;
	BufferedReader fileIn1;
	ArrayList<Course> courses;
	PriorityQueue<Request> requestQueue;
	
	public Controller(PriorityQueue<Request> requestQueue, ArrayList<Course> courses, BufferedReader fileIn, BufferedReader fileIn1) {
		this.requestQueue = requestQueue;
		this.courses = courses;
		this.fileIn = fileIn;
		this.fileIn1 = fileIn1;
	}

	@Override
	public void readCourseFile() throws Exception {
		// TODO Auto-generated method stub
//		String[] CD = new String[2];
//		int[] CN = new int[2];
//		int[] max = new int[2];
		int index = 0;
		String[] field = new String[3];
		String[] line = new String[3];
		while ((line[index] = fileIn.readLine()) != null) {
		index++;
		}
		for (int i = 0; i < line.length; i++) {
//			System.out.println(line[i]);
			if (line[i] != null) {
			field = line[i].split(",");
			
//			 CD[i]=field[0];
//			 CN[i]=Integer.parseInt(field[1]);
//			 max[i]=Integer.parseInt(field[2]);
			 courses.add(new Course(field[0],Integer.parseInt(field[1]),Integer.parseInt(field[2])));
		}
		}
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public void readRequestFile() throws IOException {
		// TODO Auto-generated method stub
//		String[] name = new String[8];
//		String[] level = new String[8];
//		String[] major = new String[8];
//		String[] CD = new String[8];
//		int[] CN = new int[8];
//		
		int index = 0;
		String[] field = new String[5];
		String[] line = new String[9];
		while ((line[index] = fileIn1.readLine()) != null) {
		index++;
		}
		for (int i = 0; i < line.length; i++) {
//			System.out.println(line[i]);
			if (line[i] != null) {
			field = line[i].split(",");
			
//			name[i]=field[0];
//			level[i]=field[1];
//			major[i]=field[2];
//			CD[i]=field[3];
//			CN[i]=Integer.parseInt(field[4]);
//			
			requestQueue.add(new Request(field[0],field[1],field[2],field[3],Integer.parseInt(field[4])));
		}
		}
		
	}

	@Override
	public void addRequest(Request req) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processRequests() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Course getCourse(String courseDept, int courseNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void printClassList() {
		// TODO Auto-generated method stub
		
	}

}
