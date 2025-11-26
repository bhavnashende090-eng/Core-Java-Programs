package methodsandvariablesandstrings;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the word");
		String s1= sc.nextLine();
		
		String reverse = "";
		
		for (int i= s1.length()-1; i>=0; i--) {
			
			reverse = reverse + s1.charAt(i);
		}	
		
		if (s1.equals(reverse)) {
			
			System.out.println(s1 + " : is palindrome ");
		}
		else {
			
			System.out.println(s1 + " : is not palindrome ");
		}
		
		
		
		

	}

}
