import java.util.Scanner;

public class GradeReport {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("What is your name?");
		String name = input.next();
		 
		System.out.println(name+", What is your score for quiz 1 (out of 100)?");
		int quiz1 = input.nextInt();
		
		System.out.println(name+", What is your score for quiz 2 (out of 100)?");
		int quiz2 = input.nextInt();
		
		System.out.println(name+", What is your score for quiz 3 (out of 100)?");
		int quiz3 = input.nextInt();
		
		System.out.println(name+", What is your score for quiz 4 (out of 100)?");
		int quiz4 = input.nextInt();
		
		System.out.println(name+", What is your score for quiz 5 (out of 100)?");
		int quiz5 = input.nextInt();
		
		System.out.println(name+", What is your score for quiz 6 (out of 100)?");
		int quiz6 = input.nextInt();
		
		System.out.println(name+", What is your score for quiz 7 (out of 100)?");
		int quiz7 = input.nextInt();
		
		System.out.println(name+", What is your score for quiz 8 (out of 100)?");
		int quiz8 = input.nextInt();
		
		System.out.println(name+", What is your score for quiz 9 (out of 100)?");
		int quiz9 = input.nextInt();
		
		System.out.println(name+", What is your score for Assignment 1 (out of 100)?");
		int assignment1 = input.nextInt();
		
		System.out.println(name+", What is your score for Assignment 2 (out of 100)?");
		int assignment2 = input.nextInt();
		
		System.out.println(name+", What is your score for Assignment 3 (out of 100)?");
		int assignment3 = input.nextInt();
		
		System.out.println(name+", What is your score for Assignment 4 (out of 100)?");
		int assignment4 = input.nextInt();
		
		System.out.println(name+", What is your score for Assignment 5 (out of 100)?");
		int assignment5 = input.nextInt();
		
		System.out.println(name+", What is your score for Assignment 6 (out of 100)?");
		int assignment6 = input.nextInt();
		
		System.out.println(name+", What is your score for Assignment 7 (out of 100)?");
		int assignment7 = input.nextInt();
		
		System.out.println(name+", What is your score for Assignment 8 (out of 100)?");
		int assignment8 = input.nextInt();
		
		System.out.println(name+", What is your score for Assignment 9 (out of 100)?");
		int assignment9 = input.nextInt();
		
		System.out.println(name+", What is your score for Assignment 10 (out of 100)?");
		int assignment10 = input.nextInt();
		
		
		System.out.println(name+", What is your score for Lab Test 1 (out of 100)?");
		int labTest1 = input.nextInt();
		
		System.out.println(name+", What is your score for Lab Test 2 (out of 100)?");
		int labTest2 = input.nextInt();
		
		System.out.println(name+", What is your score for Lab Test 3 (out of 100)?");
		int labTest3 = input.nextInt();
		
		
		System.out.println(name+", What is your  midterm score (out of 100)?");
		int midterm = input.nextInt();
		
		System.out.println(name+", What is your final exam score (out of 100)?");
		int finalExam = input.nextInt();
		
		System.out.println(name+", which course are u talking about?");
		String course = input.next();
		
		
		System.out.println(name+ ", here is your grading report for "+ course);
		
		System.out.println("--------------------------------------");
		
		System.out.println("Quiz 1: "+ quiz1);
		System.out.println("Quiz 2: "+ quiz2);
		System.out.println("Quiz 3: "+ quiz3);
		System.out.println("Quiz 4: "+ quiz4);
		System.out.println("Quiz 5: "+ quiz5);
		System.out.println("Quiz 6: "+ quiz6);
		System.out.println("Quiz 7: "+ quiz7);
		System.out.println("Quiz 8: "+ quiz8);
		System.out.println("Quiz 9: "+ quiz9);
		
		System.out.println("--------------------------------------");
		
		System.out.println("Assignment 1: "+ assignment1);
		System.out.println("Assignment 2: "+ assignment2);
		System.out.println("Assignment 3: "+ assignment3);
		System.out.println("Assignment 4: "+ assignment4);
		System.out.println("Assignment 5: "+ assignment5);
		System.out.println("Assignment 6: "+ assignment6);
		System.out.println("Assignment 7: "+ assignment7);
		System.out.println("Assignment 8: "+ assignment8);
		System.out.println("Assignment 9: "+ assignment9);
		System.out.println("Assignment 10: "+ assignment10);
		
		System.out.println("--------------------------------------");
           
		System.out.println("Lab Test 1: " + labTest1);
		System.out.println("Lab Test 2: " + labTest2);
		System.out.println("Lab Test 3: " + labTest3);
		
		System.out.println("--------------------------------------");

		System.out.println("Midterm Test: " + midterm );
		
		System.out.println("Final Exam: " + finalExam);
		
		System.out.println("--------------------------------------");
 
		double averageQuizzes = (quiz1+quiz2+quiz3+quiz4+quiz5+quiz6+quiz7+quiz8+quiz9)/9;
		double quizzes = (quiz1+quiz2+quiz3+quiz4+quiz5+quiz6+quiz7+quiz8+quiz9);

		double averageAssignments= (assignment1+assignment2+assignment3+assignment4+assignment5+assignment6+assignment7+assignment8+assignment9+assignment10)/10;
		double assignments= (assignment1+assignment2+assignment3+assignment4+assignment5+assignment6+assignment7+assignment8+assignment9+assignment10);

		double averageLabTest = (labTest1+labTest2+labTest3)/3;
		double labTest = (labTest1+labTest2+labTest3);

		System.out.println("Average of quizzes: "+ averageQuizzes );
		System.out.println("Average of Assignments: "+ averageAssignments );
		System.out.println("Average of lab test: "+ averageLabTest);
        System.out.print("Final raw marks: ");
        System.out.println(quizzes*0.02 + assignments*0.02+labTest*0.04+ midterm*0.15+ finalExam*0.35);

		
		input.close();
		
		
		
		
		
		
		
		
		
		
	

	}

}
