package model;
/*
 * Each student may be registered in up to 5 courses. 
 */
public class Student {
	String name;
	final int MAX_NUM_COURSES= 5;
	// each element (e.g., course[0],..., course[course.length-1])in the array stores
	//the address of some CourseRecord object.
		
	CourseRecord[] courses; 
	// 1. value of noc represents the number of CourseRecord objects stored in the courses array.
	// 2. value of noc denotes where in the array 'courses' is the next CouseRecord object to be stored.

	int noc;
	
	public Student(String name) {
		this.name =name;
		this.courses = new CourseRecord[MAX_NUM_COURSES];
		this.noc =0; // so far zero courses register; the next courses is to be stored at index 0 
		
	}
	public void addCourse(CourseRecord c) {
		this.courses[this.noc]=c;
		this.noc ++;
	}
	public String getDescription() {
		String result = "";
		
		//Version 1: print out the addresses of the course array elements (which might be null) 
//		result += "Student "+ this.name + " has registered " + this.noc + " courses: ";
//		for(int i =0 ; i< this.courses.length;i++) {
//			result += this.courses[i] + "\n"; 
//		}
		
		
		// version 2: print out the description of courses array elements (by calling getDescription from CoureRecord)
		// This version may cause NullPointerEcception
		result += "Student "+ this.name + " has registered " + this.noc + " courses: ";
//		for(int i =0 ; i< this.courses.length;i++) {
//			result += this.courses[i].getDescription() + "\n"; 
//		}
		
		// version 3 
		result += "Student "+ this.name + " has registered " + this.noc + " courses: ";
		for(int i =0 ; i< this.noc;i++) {
			result += this.courses[i].getDescription() + "\n"; 
		}
		return result;
	}
}
