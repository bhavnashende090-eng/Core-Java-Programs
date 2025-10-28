package understandingloops;

public class LoopPrograms {

	
	
	public static void main(String[] args) {
		
		// skip multiples of 5
		
		for( int i=1; i<=100; i++) 
		{
			if(i%5 == 0) {
				
				continue;
			}
			
			// Printing numbers from 1 to 100 but skipping multiples of 5
			
			System.out.println("No : " +i);
			
			
		}

	}

}
