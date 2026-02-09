class Gamma{
	public int disp() {
		
		try {
			System.out.println("Display method of alpha");
			return 10;
		}
		
		finally {
			// TODO: handle finally clause
			System.out.println("Finally block of Gamma");
			//return 44;
		}
	}		
}

public class LaunchEH5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gamma g = new Gamma();
		System.out.println(g.disp());
		
	}
}
