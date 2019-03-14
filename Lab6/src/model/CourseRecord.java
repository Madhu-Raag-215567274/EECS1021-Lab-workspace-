package model;
/*
 * Each course record is characterized by the title, marks,instructor. 
 */

public class CourseRecord {
	String title;// notice that String is not a primitive type, it is a reference type.
	int marks; /* Final raw marks out of 100*/
	// Reminder: when declaring the type of an attribute, you may use the name of an existing class.
	Faculty instructor;/* stores the address of some Faculty object*/

	public CourseRecord() {
		// version 1: no attributes will be initialized using input values.
		// Instead, each attribute will be initialized by its DEFAULT VALUE.
		// int:0;
		// double:0.0
		// boolean : False
		// reference type: null(no address)
		// note. if the attribute is of type String, if without being initialized, its default value is null.
	}
	public CourseRecord(String title) {
		this.title =title;
		// Only title attribute is initialized with input 'title'.
		// All other attributes (marks and instructor) will have their default values.
	}
	public CourseRecord(String title, int marks ) {
		this.title = title;
		this.marks = marks;
		// only title and marks attributes are initialized with inputs ' title' and 'marks'.
		// Attribute instructor will have its default value.
	}
	public String getTitle() {
		return title;
	}
	public int getMarks() {
		return marks;
	}
	public Faculty getInstructor() {
		return instructor;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public void setInstructor(Faculty instructor) {
		this.instructor = instructor;
	}
	public String getDescription() {
		// Version 1: this.instructor will give you the address of the Faculty object
		//return "Course "+ this.title + "( raw marks: " + this.marks + ") has instructor " + this.instructor;
        
		// version 2: this.instructor.getDescription() will give you the description of the faculty object 
		String desc="";
		if(this.instructor==null) {
			desc=  "Course "+ this.title + "( raw marks: " + this.marks + ") has no instructor ";

		}
		else {
			desc=  "Course "+ this.title + "( raw marks: " + this.marks + ") has instructor (" + this.instructor.getDescription()+")";

		}
		return desc; 
	}
}
