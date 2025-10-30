package JavaInterviewQuestions;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		for(int i=2; i<=100; i++) {   //1 is not prime number so starting loop from 2 to 100
			int count=0;
			
			for(int j=1; j<=i; j++) {    
				
				if(i%j==0) {        
					
					count++;      
				}
				
			}
			
			if(count ==2) {      //
				
				System.out.println(i);
			}
			

			}
		}

	}


