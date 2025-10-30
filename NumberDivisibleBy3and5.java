package JavaInterviewQuestions;

public class NumberDivisibleBy3and5 {

	public static void main(String[] args) {
		
		
		for(int i=1; i<=100; i++) {  //need to check between 1 to 100 so using loop
			
				if (i%3 ==0 && i % 5 ==0) { //check if i is divisble by 3 and 5
					
					System.out.println(i);
				}
				
			}
			
		}

	}


