	import java.util.Scanner;

public class LaunchEH2 {
		
	      public static void main(String[] args) {
	    	  
	    	  
	    	  System.out.println("Connection Established");
	    	  
	    	  try {
			 
	    	 Scanner sc = new Scanner(System.in); 
	    	 System.out.println("Kindly enter the numerator for division");
	    	 int n= sc.nextInt();
	    	 
	    	 System.out.println("Kindly enter the denominator for division");
	    	 int d= sc.nextInt();
	    	 
	    	 int res=n/d;
	    	 
	    	 System.out.println("Result is"+res);
	    	  }
	    	  
	    	
	       
	    	  catch (ArithmeticException e) {
				// TODO: handle exception
	    		  System.out.println("Please enter non zero number");
			}
	    	  try {
	 	    	 
	 	    	 System.out.println("Kindly enter the size of array : ");
	 	    	 int size= sc.nextInt();
	 	    	 int ar[]=new int[size];
	 	    	 
	 	    	 System.out.println("Kindly enter element to be inserted in an array");
	 	    	 int elem= sc.nextInt();
	 	    	 
	 	    	 System.out.println("Kindly enter position at which element to be inserted");
	 	    	 int index=sc.nextInt();
	 	    	 ar[index]=elem;
	 	    	 
	 	    	 System.out.println("Data inserted in an array is "+ ar[index]);
	 	    	 
	 	      }
	    	  catch (NegativeArraySizeException e) {
				System.out.println("Please don't be negative");
	    		  // TODO: handle exception
			}
	    	  
	    	  catch (ArrayIndexOutOfBoundsException e) {
				  System.out.println("Be within your limits don't cross boundaries");
				 
	    		  // TODO: handle exception
			}
	    	  
	    	  catch (Exception e) {
				System.out.println("Some Problem");
	    	   // TODO: handle exception
	    	  }
				
	      }
}
				
				
	

