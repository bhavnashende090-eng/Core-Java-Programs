package JavaInterviewQuestions;

import java.util.Scanner;

public class PrintTable {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);  //taking input
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		// Executing the number from 1 to 10
		for(int i=1; i<11; i++) {
			
			int table = num * i;   // 7*1=7, 14, 21
			System.out.println(num+ " * " +i+ " = " +table);
			
		}
		

	}

}
