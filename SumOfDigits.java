package JavaInterviewQuestions;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the digits");
		int num = sc.nextInt();
		int sum=0;
		
		while(num!=0) {
			
			int digit= num%10;  //12345 %10 =5, 4
			num = num/10;      //1234  //123
			sum = sum+digit;   // 0+5=5,  5+4+3+2+1
			
		}
		
		System.out.println(sum);   //sumofdigits 
		

	}

}
