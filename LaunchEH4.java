import java.util.Scanner;

   class Alpha{			
			public void calc() {
				
				  System.out.println("Alpha Connection Established");
		    	  
		    	  try {
				 
		   	Scanner sc=new Scanner(System.in);
		   	 System.out.println("Kindly enter the numerator for division");
		   	 int n= sc.nextInt();
		    	 
		   	System.out.println("Kindly enter the denominator for division");
		   	int d= sc.nextInt();
		    	 
		 int res=n/d;
		    	 
		   System.out.println("Result is"+res);
		    	 
		    	  
		 System.out.println("Alpha Connection Terminated");
		    	  }
		   catch (ArithmeticException e) {
					// TODO: handle exception
		    System.out.println("Enter non zero number for denominator");
				}
		    	  System.out.println("Connection Terminated");
			}
		}
   
   
	public class LaunchEH4 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
		

}
	}		
