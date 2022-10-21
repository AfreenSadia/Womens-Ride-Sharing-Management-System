package origin;

import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

public class Admin extends Driver {
	
	protected String Employee_Id;
	
	@Override
	public void information() {
		
		File file = new File("Admin Registration");
		file.mkdir();
		
	do {
		
	
	try {
		Formatter store = new Formatter("F:/Work and Projects/Women Ride Sharing Management System/Admin Registration/Admin Information.txt");
		
		
		Scanner input = new Scanner(System.in);
		
		String name = super.name;
		int age = super.age;
		String date_of_birth = super.date_of_birth;
		long phone_number = super.phone_number;
		String email = super.email;
		long nid = super.nid;
		String password = super.password;
		String rpassword = super.rpassword;
		String confirm = super.confirm;
		String agree = super.agree = "Yes";
		String Employee_Id = this.Employee_Id;
		
		System.out.println("");
		System.out.println("\t----------------------------------------------------------");
		System.out.println("\t\t*****WELCOME TO ADMIN REGISTRATION*****");
		System.out.println("\t----------------------------------------------------------");
		System.out.println("");
		
		System.out.print("Enter Your Name: ");
		super.name = input.nextLine();
		store.format("Name: "+super.name);
		
		System.out.print("Enter Your Employee ID: ");
		this.Employee_Id = input.nextLine();
		store.format("Employee ID: "+this.Employee_Id);
		
		System.out.print("Enter Your NID Number: ");
		this.nid = input.nextLong();
		store.format("\r\nNID Number: "+this.nid);
		
		System.out.print("Enter Your age: ");
		super.age = input.nextInt();
		store.format("\r\nAge: "+super.age);
		input.nextLine();
		
		System.out.print("Enter Your Date of Birth: ");
		super.date_of_birth = input.nextLine();
		store.format("\r\nDate of Birth: "+super.date_of_birth);
		
		System.out.print("Enter Your Phone Number: ");
		super.phone_number = input.nextLong();
		store.format("\r\nPhone Number: "+super.phone_number);
		input.nextLine();
		
		System.out.print("Enter Your Email Address: ");
		super.email = input.nextLine();
		store.format("\r\nEmail Address: "+super.email);
		
		System.out.print("Enter Your Password: ");
		super.password = input.nextLine();
		store.format("\r\nPassword: "+super.password);
		
		System.out.print("Re-enter Your Password: ");
		super.rpassword = input.nextLine();
		store.format("\r\nRe-entered Password: "+super.rpassword);
		
		System.out.println("");
	
		System.out.print("Confirm ['Yes' / 'No'] ?: = ");
		super.confirm = input.nextLine();
		store.format("\r\nConfirmed: "+super.confirm);
		
		store.close();
	}
	
	catch(Exception e){
		
		System.out.println("Error : "+e);
	}
		
	finally {
	
		if(this.password.equals(super.rpassword) && super.confirm.equalsIgnoreCase(super.agree)) {
			  
			System.out.println("");
			System.out.println("\t--------------------------------------------------");
			System.out.println("\t\t  *****PASSWORD MATCHED*****");
			System.out.println("\tCongratulations ! Your account has been created.");
			System.out.println("\t--------------------------------------------------");
			System.out.println("");
			
			status = 1;
		}
		
		
		
		else if(super.password != super.rpassword && super.confirm.equalsIgnoreCase(super.agree)) {
			
			System.out.println("");
			System.out.println("\t--------------------------------------------------");
			System.out.println("\t\t  *****PASSWORD MISMATCHED*****");
			System.out.println("		Please check user credentials.");
			System.out.println("\t--------------------------------------------------");
			System.out.println("");
		}
	
			
		}
		
	}
	
	while(status == 0);
			
}

}
