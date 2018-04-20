package edu.wmich.cs1120.MaxChen.LA7;

import java.io.*;
import java.util.*;

public class main {
	/**
	 * @param args for main class
	 * @throws IOException 

	 * Use controller�s readCourseFile, readRequestFile, processRequests, printClassList
	*/
	public static void main(String[] args) throws Exception {
		PriorityQueue<Request> requestQueue = new PriorityQueue<Request>();
		ArrayList<Course> courses = new ArrayList<Course>();
		BufferedReader fileIn = new BufferedReader(new FileReader("course.txt"));
		BufferedReader fileIn1 = new BufferedReader(new FileReader("request.txt"));
		IController control = new Controller(requestQueue, courses, fileIn, fileIn1);
		control.readCourseFile();
		control.readRequestFile();
		control.processRequests();
		control.printClassList();
		
	}

}
