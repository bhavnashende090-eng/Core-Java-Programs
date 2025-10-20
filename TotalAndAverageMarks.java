package com.growskillit.javafirstpackage;

public class TotalAndAverageMarks {

	public static void main(String[] args) {
		
//Store marks of 3 subjects: Math, Science, and English (use int data type).
		
		int bhavnaMathMarks = 92;
		int bhavnaScienceMarks = 88;
		int bhavnaEnglishMarks = 100;
		
//Calculate the total marks using arithmetic operators.
		
		int CalculateBhavnaTotalMarks = bhavnaMathMarks + bhavnaScienceMarks + bhavnaEnglishMarks;
		
		System.out.println("Total marks in the subjects Maths, Science, and English of student Bhavna : " + CalculateBhavnaTotalMarks );
		
// Calculate the average marks using a suitable data type.
		
		float avergaeMarks = CalculateBhavnaTotalMarks/3f;
		
		System.out.println("Average Marks of Bhavna : " +avergaeMarks);
		
// Change the data type of average variable and note the difference.
		
		int avergaeMarks1 = CalculateBhavnaTotalMarks/3;
		
		System.out.println("After changing the data type Average Marks of Bhavna : " +avergaeMarks1);

	}

}
