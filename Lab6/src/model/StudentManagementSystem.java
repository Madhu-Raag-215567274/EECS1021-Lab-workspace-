package model;
import model.Student;


public class StudentManagementSystem {
	
	public Student [] des; 

	
		int nos=0 ;
	public final int MAX_NUM_STUDENTS= 100;

		

	public Student[] sms = new Student[MAX_NUM_STUDENTS];
	
	public StudentManagementSystem(){
		
	this.sms = new Student[MAX_NUM_STUDENTS];
	this.nos = 0;
	}
	
	public Student[] getStudents() {
		this.sms = new Student [this.nos];
			
		return sms ;
	}
	
	public void addStudent(Student a) {
		
		this.sms [this.nos] = a;
		this.nos ++;		
		
	}


	public String getDescription() {
		String result ="";
		if (this.nos>0  ) {		
			for(int i =0 ; i<this.nos; i++) {
				//result = "Student management system currently stores "+ this.nos+" students: \n ";
			result = des[i].getDescription();			
				
			}
			
		}
		else  {
			result = "Student management system currently stores no students.";
			
		}
	
		return result;

		

	}


}
