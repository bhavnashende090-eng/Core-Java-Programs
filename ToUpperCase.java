package methodsandvariablesandstrings;

public class ToUpperCase {

	public static void main(String[] args) {
		
		String s1= "my name is bhavna. and I belong from Indore";
		
		
		for (int i=0; i<s1.length(); i++) {                   //loop goes till end of length
			
			char ch = s1.charAt(i);                           // storing the char at index[i]
			
			if(i == 0) {                                     // condition apply if i=0 convert the letter to upper case
				
				System.out.print(Character.toUpperCase(ch));  // converting j to J.
			}
				
				else if (s1.charAt(i-1)  == ' ') {            // checking if previous char has space if yes print to UC
					
					System.out.print(Character.toUpperCase(ch));
				}
				else {
					System.out.print(ch);                    // Otherwise print normally
				}
			}
		}

	}


