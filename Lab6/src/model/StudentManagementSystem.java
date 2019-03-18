package model;
import model.Student;


public class StudentManagementSystem {
	
	public Student[] des; 
	int nos;
	public final int MAX_NUM_STUDENTS= 100;
	
	public Student[] sms;
	CourseRecord s;
	
	
	public StudentManagementSystem(){
		
	this.sms = new Student[nos];
	this.nos = 0;
	}
	
	public Student[] getStudents() {
		return sms ;
	}
	
	public void addStudent(Student a) {
		Student [] sms1 = new Student[nos+1];
		for(int i = 0 ; i<this.nos;i++) {
			sms1[i]= this.sms[i];
		}
		sms1[nos]= a;
		this.sms= sms1;
		nos++;
		
	}

	public String getDescription() {
		this.des= this.sms;
		String result ="Student management system currently stores "+ this.nos+" students:";
		if (this.nos>0  ) {		
			for(int i =0 ; i<this.nos; i++) {
				result +=  des[i].getDescription();				
			}			
		}
		else  {
			result = "Student management system currently stores no students.";
			
		}
		return result;		

	}
	public int getMarks(String s, String t) {
		
		this.s= new CourseRecord(t);
		
		return this.s.getMarks();
	}
	
	public void setMarks(String name, String t,int marks) {
			
		
	}

	
	


}
