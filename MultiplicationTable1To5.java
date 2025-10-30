package JavaInterviewQuestions;

public class MultiplicationTable1To5 {

	public static void main(String[] args) {
		
		
		for (int i=1; i<=5; i++) {          //Outer loop want to run table 1 to 5
			
			 System.out.println("Table of " +i);  //Just to clarify which table is printing
			
			for (int j=1; j<=10; j++) {     // Inner loop run from 1 to 10 and execute completely
				
				
				System.out.println(i+ " * " +j+ " = " +i*j);   // 1*1=1,then j increase to 2 so 1*2=2 and so on..
			}
			
			System.out.println();   // for next line
		}

	}

}
