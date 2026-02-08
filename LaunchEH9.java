import java.util.Scanner;


class UnderAgeException extends Exception
{
	 public UnderAgeException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
		
	}
}                                                    //Custom Exceptions
class OverAgeException extends Exception
{
	 public OverAgeException(String msg) {
			// TODO Auto-generated constructor stub
			super(msg);
			
		}
}

class Applicant{
	int age;
	
	public void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Kindly enter your age");
		age=sc.nextInt();	
	}
	public void verify() throws UnderAgeException, OverAgeException {
		if (age>=18 && age<=60) {
			System.out.println("Proceed with license application");
		} else if (age<18) {
			UnderAgeException uae=new UnderAgeException("Have Patience kiddo! Your time will come");
			System.out.println(uae.getMessage());
			throw uae;			
		} 
		else 
		{
     		OverAgeException oae=new OverAgeException("Your Time is near! Rest at home");
			System.out.println(oae.getMessage());
			throw oae;
		}	
	}
}
class RTO
{
	public void initiate() {
		Applicant app= new Applicant();
			
			try {
				app.input();
				app.verify();
			} catch (UnderAgeException | OverAgeException e) {
				// TODO Auto-generated catch block
				System.out.println("Try Again");
				try {
					app.input();
					app.verify();
				} catch (UnderAgeException | OverAgeException e1) {
					// TODO Auto-generated catch block
					System.out.println("You are blocked to apply for license due to age restrictions");
				}
			}
	}	
}


public class LaunchEH9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           System.out.println("License Application");
          RTO rto = new RTO();
          rto.initiate();
	}

}
