import java.util.Scanner;

class InvalidCustomerException extends Exception
{
	
  public InvalidCustomerException(String msg) 
  {
		super(msg);
	}
	
}
class ATM1
{
	private int acc=4245;
	private int pw=1234;
	
	int accountNo;
	int password;
	
	public void input() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Kindly Enter the account no");
		accountNo=sc.nextInt();
		
		System.out.println("Kindly Enter the password");
		accountNo=sc.nextInt();
		}
	public void verify() throws InvalidCustomerException {
		if (acc==accountNo && pw==password) {
			System.out.println("Proceed to withdraw cash");
			
			
		} else {
			InvalidCustomerException ice =new InvalidCustomerException("Invalid Credentials");
			System.out.println(ice.getMessage());
			throw ice;
			
			//throw new InvalidCustomerException();
		}
		
	}
}

 class Bank1{
	 
	 public void initiate() {
		ATM1 atm=new ATM1();
		try {
			atm.input();
			atm.verify();
		} 
		catch (InvalidCustomerException ice) {
			// TODO: handle exception
			//System.out.println(ice);
			System.out.println("Try Again");
			try {
				atm.input();
				atm.verify();
			} catch (InvalidCustomerException ice2) {
				// TODO: handle exception
				System.out.println("Try Again");
				try {
					atm.input();
					atm.verify();
				} catch (InvalidCustomerException ice3) {
					// TODO: handle exception
					System.out.println("You are a legend cannot be give more chances");
				}
			}
		}
		}
 } 
public class LaunchEH8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Bank1 b = new Bank1();
        b.initiate();
	}
}
