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
		if (level.equals("Senior"))
			return 0;
		else if (level.equals("Junior"))
			return 1;
		else if (level.equals("Sophomore"))
			return 2;
		else 
			return 3;
	}
	
	
	public int compareTo(Request o) {
		// TODO Auto-generated method stub
		if ((this.studentMajor.equals("CS"))&&(!o.studentMajor.equals("CS"))) 
			return -1;
		else if ((!this.studentMajor.equals("CS"))&&(o.studentMajor.equals("CS")))
			return 1;
		else {
			if(this.yearsFromGraduation(this.studentLevel) > o.yearsFromGraduation(o.studentLevel)) {
				
			return 1;
			}
		}
		return -1;
//		if((this.studentMajor.equals("CS"))&&(!o.studentMajor.equals("CS"))) {
//			return 1;
//			
//		}
//		else if((!this.studentMajor.equals("CS"))&&(o.studentMajor.equals("CS"))) {
//			return -1;
//		}
//		else {
//			if(o.yearsFromGraduation(o.studentLevel) > this.yearsFromGraduation(this.studentLevel)) {
//				return 1;
//			}
//		}
//		return -1;
	}
	public String toString(boolean torf) {
		
		return studentName + " successfully registered" + " "+courseDept +" "+ courseNumber;
	}

}
