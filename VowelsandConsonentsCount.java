package methodsandvariablesandstrings;

public class VowelsandConsonentsCount {

	public static void main(String[] args) {
		
		String s  = "Bhavna Shende";
		String s1 = s.toUpperCase();
		int vowel=0;
		int consonant =0;
		
		for(int i=0; i<s1.length();i++) {  // The loop starts at i = 0 (first character).It will continue until i is less than text.length() (the total length of the string).
			
		char ch = s1.charAt(i); 
		
		 if (ch >= 'A' && ch <= 'Z') {

             // check vowel
			 
             if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            	 
                 vowel++;
             } 
             // constant
             else {
                 consonant++;
             }
		}
               
		}
		
		System.out.println("Vowels : " + vowel  + " Consonents : " + consonant);
		
		
		
	}
	
}


