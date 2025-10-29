package JavaInterviewQuestions;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		//1010970
		//790101
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int reversenumber = 0;
		
		while(num !=0) {    //1010970 !=0   // 101097 !=0
			
		int n = num %10;     // 1010970%10 =0  //7
		num= num/10; // 101097 /10    //10109
		
		reversenumber = reversenumber*10 + n;    //0*10 + 0=0  // 0+7=7  //7*10 + 9=79
			
		}	


		System.out.println(reversenumber);
	}

}
