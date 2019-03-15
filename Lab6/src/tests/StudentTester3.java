package tests;

import model.CourseRecord;
import model.Student;

public class StudentTester3 {

	public static void main(String[] args) {
		Student s1 = new Student ("Heeyeon");
		// use of version 1 of addCourse(CourseRecord)
		CourseRecord cr= new CourseRecord ("1021");
		s1.addCourse(cr);
		System.out.println(s1.getDescription());
		
		// use of version 2 of addCourse (string)
		s1.addCourse("2030");
		System.out.println(s1.getDescription());
		
		cr.setMarks(79); // as if : s1.course[0].setMarks(60) because: cr == s1.courses[0]
		s1.courses[1].setMarks(60);
		
		System.out.println(s1.getDescription());

	}

}
