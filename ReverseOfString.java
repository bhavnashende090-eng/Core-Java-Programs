package methodsandvariablesandstrings;

public class ReverseOfString {

	public static void main(String[] args) {
		
		String S1= "Bhavna";
		String reversed =" ";
		
		for(int i = S1.length()-1; i>=0; i--) {
			
			reversed= reversed + S1.charAt(i);
		}
		
		System.out.println(" String : " + S1);
		System.out.print(" Reversed Str : " +reversed);

	}

}
