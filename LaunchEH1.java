import java.util.Scanner;

public class LaunchEH1 {
	
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
//       catch (Exception e) {
//		 System.out.println("Please enter non zero denominator");
//    	   // TODO: handle exception
//		}
    	  System.out.println("Connenction Terminated");
 	  
    	  
	}
}
