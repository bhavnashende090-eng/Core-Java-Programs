package JavaInterviewQuestions;

import java.util.Scanner;

public class CountDigitNumbers {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the digits");
		int num= sc.nextInt();
		int count=0;
		
		while(num !=0)   // 89977 !=0
		{
			num= num/10;  // 89977/10 = 8997
			count++;      // 1, 2.....
		}
		
		
		System.out.println(count);

	}
	

}
