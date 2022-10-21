package origin;


import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

public class General extends Registration {
	
	protected String name;
	protected int age;
	protected String date_of_birth;
	protected long phone_number;
	protected String email;
	protected String password;
	protected String rpassword;
	protected String confirm;
	protected String agree;
	
	static int status = 0;
	
	@Override
	
	public void information() {
	
		File file = new File("General Registration");
		file.mkdir();
		
	do {
		
	
	try {
		Formatter store = new Formatter("F:/Work and Projects/Women Ride Sharing Management System/General Registration/General Information.txt");

		System.out.println("");
		System.out.println("\t------------------------------------------------------");
		System.out.println("\t\t*****WELCOME TO GENERAL REGISTRATION*****");
		System.out.println("\t------------------------------------------------------");
		System.out.println("");
		
		Scanner input = new Scanner(System.in);
		
		String name = this.name;
		int age = this.age;
		String date_of_birth = this.date_of_birth;
		long phone_number = this.phone_number;
		String email = this.email;
		String password = this.password;
		String rpassword = this.rpassword;
		String confirm = this.confirm;
		String agree = this.agree = "Yes";
		
		System.out.print("Enter Your Name: ");
		this.name = input.nextLine();
		store.format("Name: "+this.name);
		
		System.out.print("Enter Your age: ");
		this.age = input.nextInt();
		store.format("\r\nAge: "+this.age);
		input.nextLine();
		
		System.out.print("Enter Your Date of Birth: ");
		this.date_of_birth = input.nextLine();
		store.format("\r\nDate of Birth: "+this.date_of_birth);
		
		System.out.print("Enter Your Phone Number: ");
		this.phone_number = input.nextLong();
		store.format("\r\nPhone Number: "+this.phone_number);
		input.nextLine();
		
		System.out.print("Enter Your Email Address: ");
		this.email = input.nextLine();
		store.format("\r\nEmail Address: "+this.email);
		
		System.out.print("Enter Your Password: ");
		this.password = input.nextLine();
		store.format("\r\nPassword: "+this.password);
		
		System.out.print("Re-enter Your Password: ");
		this.rpassword = input.nextLine();
		store.format("\r\nRe-entered Password: "+this.rpassword);
		
		System.out.println("");
	
		System.out.print("Confirm ['Yes' / 'No'] ?: = ");
		this.confirm = input.nextLine();
		store.format("\r\nCofirmed ?: "+this.confirm);
		System.out.println("");
		
		store.close();
		
	}
	
	catch(Exception e) {
		
		System.out.println("Error : "+e);
		
	}
		
	finally {
		if(this.password.equals(this.rpassword) && this.confirm.equalsIgnoreCase(this.agree)) {
			  
			System.out.println("");
			System.out.println("\t--------------------------------------------------");
			System.out.println("\t\t  *****PASSWORD MATCHED*****");
			System.out.println("\tCongratulations ! Your account has been created.");
			System.out.println("\t--------------------------------------------------");
			System.out.println("");
			
			status = 1;
		}
		
		
		
		else if(this.password != this.rpassword && this.confirm.equalsIgnoreCase(this.agree)) {
			
			System.out.println("");
			System.out.println("\t--------------------------------------------------");
			System.out.println("\t\t   *****PASSWORD MISMATCHED*****");
			System.out.println("		Please check user credentials.");
			System.out.println("\t--------------------------------------------------");
			System.out.println("");
		}
		
		
	
		
	}
		

			
	}
	
	while(status == 0);
	
	

}
	}