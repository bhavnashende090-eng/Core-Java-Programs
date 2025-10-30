package JavaInterviewQuestions;

public class RectanglePattern {

	public static void main(String[] args) {
		
		//outer loop decides how much time the rows get execute so its 3 times
		for(int i=1; i<=3; i++) {
			
			// Inner Loop decides how much time the columns get execute its 4 times.
			
			for (int j=1; j<=4; j++) {
				
				System.out.print("*");  // inner loop executes fully so 4 times * get print in a same line as printing print not println.
			}
			System.out.println(); //This is for new line
		}
	}

}
