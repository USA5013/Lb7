package edu.wmich.cs1120.MaxChen.LA7;

import java.io.*;
import java.util.ArrayList;

public class Controller implements IController {
	BufferedReader fileIn;
	BufferedReader fileIn1;
	ArrayList<Course> courses;
	private PriorityQueue<Request> requestQueue;

	public Controller(PriorityQueue<Request> requestQueue, ArrayList<Course> courses, BufferedReader fileIn, BufferedReader fileIn1) {
		this.requestQueue = requestQueue;
		this.courses = courses;
		this.fileIn = fileIn;
		this.fileIn1 = fileIn1;
	}

	@Override
	/**
	 * @throws IOException 
	 * read the coursesfile and store it into the courses arraylist and pass to courses class
	 */
	public void readCourseFile() throws Exception {
		// TODO Auto-generated method stub
		// String[] CD = new String[2];
		// int[] CN = new int[2];
		// int[] max = new int[2];
		int index = 0;
		String[] field = new String[3];
		String[] line = new String[3];
		while ((line[index] = fileIn.readLine()) != null) {
			index++;
		}
		for (int i = 0; i < line.length; i++) {
			// System.out.println(line[i]);
			if (line[i] != null) {
				field = line[i].split(",");

				// CD[i]=field[0];
				// CN[i]=Integer.parseInt(field[1]);
				// max[i]=Integer.parseInt(field[2]);
				courses.add(new Course(field[0], Integer.parseInt(field[1]), Integer.parseInt(field[2])));
				
			}
		}

	}
	
	@SuppressWarnings("unchecked")
	@Override
	/**
	 * @throws IOException 
	 * read the requestfile and store it into the enqueue and pass to request class
	 */
	public void readRequestFile() throws IOException {
		// TODO Auto-generated method stub
		// String[] name = new String[8];
		// String[] level = new String[8];
		// String[] major = new String[8];
		// String[] CD = new String[8];
		// int[] CN = new int[8];
		//
		int index = 0;
		String[] field = new String[5];
		String[] line = new String[9];
		while ((line[index] = fileIn1.readLine()) != null) {
			
			index++;
			
		}
		for (int i = 0; i < line.length; i++) {
			// System.out.println(line[i]);
			if (line[i] != null) {
				field = line[i].split(",");

				// name[i]=field[0];
				// level[i]=field[1];
				// major[i]=field[2];
				// CD[i]=field[3];
				// CN[i]=Integer.parseInt(field[4]);
				//
				addRequest(new Request(field[0], field[1], field[2], field[3], Integer.parseInt(field[4])));
			}
		}

	}
	

	/**
	 * @param request from student
	 * @return the enqueued request
	 * pass request to enqueue
	 */
	public void addRequest(Request req) {
		// TODO Auto-generated method stub
		requestQueue.enqueue(req);
	}

	@Override
	/**
	 * dequeue the request and print the result 
	 * 
	 */
	public void processRequests() {
		// TODO Auto-generated method stub
//		Request request =(Request) requestQueue.dequeue();
//		System.out.println(request.studentName);
		while (!requestQueue.isEmpty()) {
		Request request =(Request) requestQueue.dequeue();
		Course course = getCourse(request.courseDept,request.courseNumber);
		
		System.out.println(request+ " procesed");
		
		if (course.isFull() == true) {
			System.out.println(request.studentName+" didn't get in the course "+request.courseDept+" "+request.courseNumber);
		}
		else {
			course.addStudent(request.studentName);
			
			System.out.println(request.toString(true));
			
		}
		
		}
		
	}

	@Override
	/**
	 * @param the dept and the number of the course
	 * @return the object course
	 * get the course base on the number and dept of the course
	 */
	public Course getCourse(String courseDept, int courseNumber) {
		// TODO Auto-generated method stub
		for(int i = 0; i < courses.size(); i++) {
			if (courses.get(i).getname().equalsIgnoreCase(courseDept)&& courses.get(i).getnum() == courseNumber) {
				return courses.get(i);
			}
//			else {
//				System.out.println("no couurses there!");
//				return null;
//			}
		}
		return null;
	}

	/**
	 * print the student’s name in each of the class
	 */
	public void printClassList() {
		System.out.println();
		// TODO Auto-generated method stub
		System.out.println("Class List for CS "+courses.get(0).conum);
		for (int i = 0; i < courses.get(0).students.size(); i++) {
		System.out.println(courses.get(0).students.get(i));
		}
		System.out.println();
		System.out.println("Class List for CS "+courses.get(1).conum);
		for (int i = 0; i < courses.get(1).students.size(); i++) {
		System.out.println(courses.get(1).students.get(i));
		}
	
	}

}
