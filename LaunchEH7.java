import java.util.Scanner;

class ATM
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
	public void verify() {
		if (acc==accountNo && pw==password) {
			System.out.println("Proceed to withdraw cash");
			
			
		} else {
			System.out.println("Ohho! seems like legend? whats the matter");
			input();
			verify();     //Never Ending Loop.
		}
		
	}
}
 class Bank{
	 
	 public void initiate() {
		ATM atm=new ATM();
		atm.input();
		atm.verify();
	}
 }

public class LaunchEH7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               Bank b = new Bank();
               b.initiate();
	}

}

