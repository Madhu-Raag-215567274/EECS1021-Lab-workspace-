package model;
import model.Student;


public class StudentManagementSystem {
	
	int nos;
	public final int MAX_NUM_STUDENTS= 100;
	
	public Student[] sms;
	CourseRecord[] s;
	
	
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

		String result ="Student management system currently stores "+ this.nos+" students: \n";
		if (this.nos>0  ) {		
			for(int i =0 ; i<this.nos; i++) {
				result +=  sms[i].getDescription()+ "\n";				
			}			
		}
		else  {
			result = "Student management system currently stores no students.";
			
		}
		return result;		

	}
	public int getMarks(String s, String t) {
		
//		this.s= new CourseRecord(t);
//		
//		return this.s.getMarks();
		int result = -1;
		for (int i = 0 ; i< sms.length;i++) {
			if (s.equals(sms[i].name)) {
			
				result = sms[i].getMarks(t);
				
			}
		}
				
		return result;		

	}
	
	public void setMarks(String name, String t,int marks) {
			
		for (int i = 0; i<sms.length;i++) {
			if (name.equals(sms[i].name)) {
				sms[i].setMarks(t, marks);
			}
		}
	}

	public double getGPA(String string) {
		
		double s = 0;
		for (int i = 0; i < sms.length ; i++) {
			if (string.equals(sms[i].name)) {
				s= sms[i].getGPA();
			}
		}

		return s;
	}

	public void addStudent(String s) {
		Student [] sms1 = new Student[nos+1];
		for(int i = 0 ; i<this.nos;i++) {
			sms1[i]= this.sms[i];
		}
		sms1[nos]= new Student(s);
		this.sms= sms1;
		nos++;	

		
	}

	public void addCourse(String s, CourseRecord cr) {
		
		for(int i = 0 ; i<this.nos;i++) {
		if (s.equals(sms[i].name)) {
			sms[i].addCourse(cr);
			}
		}
		
	}	


}