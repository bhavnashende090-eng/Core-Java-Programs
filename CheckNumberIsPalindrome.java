package JavaInterviewQuestions;

import java.util.Scanner;

public class CheckNumberIsPalindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);   // creating scannner object
		
		System.out.println("Enter a number");
		
		int num = sc.nextInt(); //read input type int
		
		int num2 = num; // User given number store in num2 variable
		int rev =0;
		
		while (num !=0) 
		{
			
			int modulus = num%10;   // getting last digit ---12121 %10 =1 , 2, 1, 2, 1
			num  = num/10;       //get remaining digits----  1212, 121, 12, 1, 0
			rev = rev*10+modulus;    //reverse to check digit--- 0*10 + 1=1, 1*10+2= 12, 12*10+1 =120+1=121 and so on...
		}
         // using if else condition
		if(num2 == rev) 
		{
			
			System.out.println("Numbefr is palindrome");
		}
		
		else 
		{
			System.out.println("Number is not palindrome");
		}
	}

}
