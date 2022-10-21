package origin;

public abstract class Sign_In{
	
	protected String User_Name;
	protected String Password;
	protected static int status = 0;
	protected String confirm;
	protected String agree = "Yes";
	
	public abstract void login_information();
	public abstract void login_information1();
	public abstract void login_information2();
	
	public void no_confirmation_message() {
		
			
			System.out.println("");
			System.out.println("\t--------------------------------------------------------");
			System.out.println("\t*****Please confirm, to login*****");
			System.out.println("\t--------------------------------------------------------");
			System.out.println("");
			
			
	}

}
