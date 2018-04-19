package edu.wmich.cs1120.MaxChen.LA7;

public class Request implements Comparable<Request>{
	String studentName;
	String studentMajor;
	String studentLevel;
	String courseDept;
	int courseNumber;
	// Constructor
	public Request(String studentName, String studentLevel, String studentMajor, String courseDept, int courseNumber) {
		this.studentName = studentName;
		this.studentLevel = studentLevel;
		this.studentMajor = studentMajor;
		this.courseDept = courseDept;
		this.courseNumber = courseNumber;
		yearsFromGraduation(studentLevel);
		
	}
	// Returns number of years to graduation (0 for seniors, 1 for juniors etc.). This is determined from the 
	// student’s level – senior, junior, etc.
	public int yearsFromGraduation(String level) {
//		switch(level) {
//		case "senior":
//			return 0;
////			break;
//		case "juniors":
//			return 1;
////			break;
//		case "sophomore":
//			return 2;
////			break;
//		case "freshman" :
//			return 3;
////			break;
//		default:
//			return 4;
////		break;
//		
//		}
		if (level == "senior")
			return 0;
		else if (level == "juniors")
			return 1;
		else if (level == "sophomore")
			return 2;
		else 
			return 3;
	}
	
	public int Major(String major) {
		if (major == "CS")
			return 0;
			else
			return 1;
	}
	public int compareTo(Request o) {
		// TODO Auto-generated method stub
		if (this.Major(studentMajor) > o.Major(studentMajor)) 
			return -1;
		else if (this.Major(studentMajor) < o.Major(studentMajor))
			return 1;
		else {
			if(this.yearsFromGraduation(studentLevel) > o.yearsFromGraduation(studentLevel))
			return -1;
			else if(this.yearsFromGraduation(studentLevel) < o.yearsFromGraduation(studentLevel))
			return 1;
		}
		return -1;
			
	}
	public String toString(boolean torf) {
		
		return studentName + " successfully registered";
	}

}
