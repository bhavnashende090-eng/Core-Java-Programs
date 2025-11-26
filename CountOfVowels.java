package methodsandvariablesandstrings;

public class CountOfVowels {
	
	static int vowelCount(String cs) {  // A new variable cs is created and receives the same string value from str.text now = "Bhavna AEIOU."
		
		int count=0;  // This will store the number of vowels found.
		
		cs=cs.toLowerCase();   // Converts the entire string to lowercase (so that 'A' and 'a' are treated equally).
		
		for(int i=0; i<cs.length();i++) {  // The loop starts at i = 0 (first character).It will continue until i is less than text.length() (the total length of the string).
			
			int p= cs.charAt(i);   // This picks one character from the string at position i.
			
			if (p=='a' || p=='e' || p== 'i' || p=='o' || p=='u') {    // If the character is a vowel, it runs:
				
				count++;    // This adds 1 to the count. The loop repeats for every character in the strings
			}
			
			else {
				
				count++;
			}
		}
		
		return count;   // The total number of vowels found (e.g., 8) is sent back to the main() method.
			 
	}
	
	// When  run this program, the Java Virtual Machine (JVM) looks for a method with this exact signature
	
	public static void main (String[] args) {
		
		String str = "Bhavna AEIOU";   // A variable str is created in memory.It stores the given sentence (the string literal). This will be our input text.
		
		
		// The returned value is stored in the variable result.
		int result = vowelCount(str); // The JVM now calls the method vowelCount() and passes the string str as an argument.
		
		System.out.println("Count of vowel : " + result);   //Outcome printed
		
	}

}
