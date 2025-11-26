package methodsandvariablesandstrings;

import java.util.Scanner;

public class CountofChars {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the word");
		String str= sc.nextLine();            // storing the word in str
		
		System.out.println("Enter the character you want to count");
		
		char ch = sc.next().charAt(0);    // takes the first char of the word which user enter
		
		int charcount=0;                   // charcount variable will store how many times the character is found.
		
		for (int i=0; i<=str.length()-1; i++) {        //suppose for bhavna word loop will run for 6 times
			
			
			if(str.charAt(i) == ch) {                  // gets each character one by one and Compares the character with ch.
				
				charcount++;                           // if both are same increase the count
		}
	}
		
		System.out.println(charcount);

}
}
