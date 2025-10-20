package com.growskillit.javaconditionalstatement;

import java.util.Scanner;

public class ConditionalStatementJavaProgram {

	public static void main(String[] args) {
		
		String grade;
		String messageForStudent;
		
		Scanner sc = new Scanner(System.in);
		
//Accept marks for 3 subjects
		
		System.out.print("Enter marks in Maths: ");
		int maths = sc.nextInt();
		
		System.out.print("Enter marks in Science: ");
		int science = sc.nextInt();
		
		System.out.print("Enter marks in English: ");
		int english = sc.nextInt();
		
// Calculating the total marks to calculating average marks.		
		int totalMarks = maths + science + english;
		System.out.println("Total Marks : " +totalMarks);
		
// Calculates the average
		float averageMarks = totalMarks/3f;
		System.out.println("Average Marks of Bhavna : " +averageMarks);
		
//Based on the average, prints the grade-
		
		if (averageMarks >= 90 && averageMarks <=100 )
		{
			grade = "A+";
			messageForStudent = "Excellent performance!";
		}
		
		else if (averageMarks >= 75 && averageMarks <=89)
		{
			grade = "A";
			messageForStudent = "Excellent performance!";
		}
		else if (averageMarks >= 60 && averageMarks <=74)
		{
			 grade = "B";
			 messageForStudent = "Keep improving.";
		}
		
		else if (averageMarks >= 40 && averageMarks <=59)
		{
			grade = "C";
			messageForStudent = "Keep improving.";
		}
		
		else {
			 grade = "Fail";
			 messageForStudent = "Please work harder next time.";
		}
		
// Printing Grade and Custom message.
		System.out.println("Grade of Bhavna: " + grade);
        System.out.println("Message: " + messageForStudent);

// Bonus: Check if any subject mark is below 35 → print: “Failed due to low score in at least one subject.
        
        if (maths < 35 || science < 35 || english < 35) 
        {
            System.out.println("Failed due to low score in at least one subject.");
        }
	}

}
