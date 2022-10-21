package origin;

import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

public class On_Trip_Udates {
	
	private String update_response;
	static int status = 0;
	
	public void messages() {
		

		File file = new File("On Trip Records");
		file.mkdir();	
		
	try {
			
		Formatter store = new Formatter("F:/Work and Projects/Women Ride Sharing Management System/On Trip Records/User - 1 Responses During The Trip.txt");
			
		Scanner input = new Scanner(System.in);
		
		String update_response = this.update_response;
		String response_1 = "Yes";
		String response_2 = "No";
		
		System.out.println("");
		
		System.out.print("Have You Reached Your Destination ['Yes' / 'No'] ?: ");
		this.update_response = input.nextLine();
		store.format("Destination Reached ?: "+this.update_response);
		
		System.out.println("");
		
		if(this.update_response.equalsIgnoreCase(response_1)) {
		
		do {
			Scanner input2 = new Scanner(System.in);
			
			String response;
		
			System.out.print("End Trip ['Yes' / 'No']  ? : ");
			response = input2.nextLine();
			store.format("\r\nEnded Trip ?: "+response);
			System.out.println("");
			
			switch(response) {
			
			case "Yes":
				
				System.out.println("\t------------------------------");
				System.out.println("\t*****YOUR TRIP HAS ENDED.*****");
				System.out.println("\t------------------------------");
				
				System.out.println("");
				
				System.out.println("\t----------------------------------------------------");
				System.out.println("\t*****PLEASE PAY AS PER INSTRUCTED IN THE MANUAL*****");
				System.out.println("\t----------------------------------------------------");
				
				status = 1;
				
			break;
		
			case "No":
			
			System.out.println("");
			System.out.println("\t----------------------------------------");
			System.out.println("\t*****PLEASE CONFIRM YES TO END TRIP*****");
			System.out.println("\t----------------------------------------");
			
			}
			
		}
			while(status == 0);
		
		}
	
			
			 if(this.update_response.equalsIgnoreCase(response_2)) {
			
			do {
				
				Scanner input3 = new Scanner(System.in);
				
				String response1;
				String destination;
				
				System.out.print("Change Destination ? ['Yes' / 'No']: ");
				response1 = input3.nextLine();
				store.format("\r\nChanged Destination ?: "+response1);
				System.out.println("");
				
				switch(response1) {
				
				case "Yes":
					
					System.out.println("\t*****Please Chose Within The Current Route You Are In*****");
					System.out.println("");
					System.out.print("Enter Another Destination: ");
					destination = input3.nextLine();
					store.format("\r\nUpdated Detination: "+destination);
					System.out.println("");
					System.out.println("\t-----------------------------");
					System.out.println("\t*****Destination Updated*****");
					System.out.println("\t-----------------------------");
					
					status = 1;
					
					break;
			
				case "No":
				
				System.out.println("\t--------------------------------------");
				System.out.println("\t*****Your Trip is being Continued*****");
				System.out.println("\t--------------------------------------");
				
					status = 2;
					
					break;
				
				default: 
					
					System.out.println("\t-----------------------");
					System.out.println("\t*****Invalid Reply*****");
					System.out.println("\t-----------------------");
				
				}
				
			}
			
			while(status == 0);
			
			 }
		
			 store.close();
		
	}
	
	catch(Exception e) {
		
		System.out.println("Error: "+e);
		
	}
}


	public void messages1() {
		

		File file = new File("On Trip Records");
		file.mkdir();	
		
	try {
			
		Formatter store = new Formatter("F:/Work and Projects/Women Ride Sharing Management System/On Trip Records/User - 2 Responses During The Trip.txt");
			
		Scanner input = new Scanner(System.in);
		
		String update_response = this.update_response;
		String response_1 = "Yes";
		String response_2 = "No";
		
		System.out.println("");
		
		System.out.print("Have You Reached Your Destination ['Yes' / 'No'] ?: ");
		this.update_response = input.nextLine();
		store.format("Destination Reached ?: "+this.update_response);
		
		System.out.println("");
		
		if(this.update_response.equalsIgnoreCase(response_1)) {
		
		do {
			Scanner input2 = new Scanner(System.in);
			
			String response;
		
			System.out.print("End Trip ['Yes' / 'No'] ?: ");
			response = input2.nextLine();
			store.format("\r\nEnded Trip ?: "+response);
			System.out.println("");
			
			switch(response) {
			
			case "Yes":
				
				System.out.println("\t------------------------------");
				System.out.println("\t*****YOUR TRIP HAS ENDED.*****");
				System.out.println("\t------------------------------");
				
				System.out.println("");
				
				System.out.println("\t----------------------------------------------------");
				System.out.println("\t*****PLEASE PAY AS PER INSTRUCTED IN THE MANUAL*****");
				System.out.println("\t----------------------------------------------------");
				
				status = 1;
				
			break;
		
			case "No":
			
			System.out.println("");	
			System.out.println("\t----------------------------------------");
			System.out.println("\t*****PLEASE CONFIRM YES TO END TRIP*****");
			System.out.println("\t----------------------------------------");
			
			}
			
		}
			while(status == 0);
		
		}
	
			
			 if(this.update_response.equalsIgnoreCase(response_2)) {
			
			do {
				
				Scanner input3 = new Scanner(System.in);
				
				String response1;
				String destination;
				
				System.out.print("Change Destination ['Yes' / 'No'] ?: ");
				response1 = input3.nextLine();
				store.format("\r\nChanged Destination ?: "+response1);
				System.out.println("");
				
				switch(response1) {
				
				case "Yes":
					
					System.out.println("\t*****Please Chose Within The Current Route You Are In*****");
					System.out.println("");
					System.out.print("Enter Another Destination: ");
					destination = input3.nextLine();
					store.format("\r\nUpdated Detination: "+destination);
					System.out.println("");
					System.out.println("\t-----------------------------");
					System.out.println("\t*****Destination Updated*****");
					System.out.println("\t-----------------------------");
					
					status = 1;
					
					break;
			
				case "No":
				
				System.out.println("\t--------------------------------------");
				System.out.println("\t*****Your Trip is being Continued*****");
				System.out.println("\t--------------------------------------");
				
					status = 2;
					
					break;
				
				default: 
					
					System.out.println("\t-----------------------");
					System.out.println("\t*****Invalid Reply*****");
					System.out.println("\t-----------------------");
				
				}
				
			}
			
			while(status == 0);
			
			 }
		
			 store.close();
		
	}
	
	catch(Exception e) {
		
		System.out.println("Error: "+e);
		
	}
}

	
	public void messages2() {
		

		File file = new File("On Trip Records");
		file.mkdir();	
		
	try {
			
		Formatter store = new Formatter("F:/Work and Projects/Women Ride Sharing Management System/On Trip Records/User - 3 Responses During The Trip.txt");
			
		Scanner input = new Scanner(System.in);
		
		String update_response = this.update_response;
		String response_1 = "Yes";
		String response_2 = "No";
		
		System.out.println("");
		
		System.out.print("Have You Reached Your Destination ['Yes' / 'No'] ?: ");
		this.update_response = input.nextLine();
		store.format("Destination Reached ?: "+this.update_response);
		
		System.out.println("");
		
		if(this.update_response.equalsIgnoreCase(response_1)) {
		
		do {
			Scanner input2 = new Scanner(System.in);
			
			String response;
		
			System.out.print("End Trip ['Yes' / 'No'] ?: ");
			response = input2.nextLine();
			store.format("\r\nEnded Trip ?: "+response);
			System.out.println("");
			
			switch(response) {
			
			case "Yes":
				
				System.out.println("\t------------------------------");
				System.out.println("\t*****YOUR TRIP HAS ENDED.*****");
				System.out.println("\t------------------------------");
				
				System.out.println("");
				
				System.out.println("\t----------------------------------------------------");
				System.out.println("\t*****PLEASE PAY AS PER INSTRUCTED IN THE MANUAL*****");
				System.out.println("\t----------------------------------------------------");
				
				status = 1;
				
			break;
		
			case "No":
			
			System.out.println("");	
			System.out.println("\t----------------------------------------");
			System.out.println("\t*****PLEASE CONFIRM YES TO END TRIP*****");
			System.out.println("\t----------------------------------------");
			
			}
			
		}
			while(status == 0);
		
		}
	
			
			 if(this.update_response.equalsIgnoreCase(response_2)) {
			
			do {
				
				Scanner input3 = new Scanner(System.in);
				
				String response1;
				String destination;
				
				System.out.print("Change Destination ['Yes' / 'No'] ?: ");
				response1 = input3.nextLine();
				store.format("\r\nChanged Destination ?: "+response1);
				System.out.println("");
				
				switch(response1) {
				
				case "Yes":
					
					System.out.println("\t*****Please Chose Within The Current Route You Are In*****");
					System.out.println("");
					System.out.print("Enter Another Destination: ");
					destination = input3.nextLine();
					store.format("\r\nUpdated Detination: "+destination);
					System.out.println("");
					System.out.println("\t-----------------------------");
					System.out.println("\t*****Destination Updated*****");
					System.out.println("\t-----------------------------");
					
					status = 1;
					
					break;
			
				case "No":
				
				System.out.println("\t--------------------------------------");
				System.out.println("\t*****Your Trip is being Continued*****");
				System.out.println("\t--------------------------------------");
				
					status = 2;
					
					break;
				
				default: 
					
					System.out.println("\t-----------------------");
					System.out.println("\t*****Invalid Reply*****");
					System.out.println("\t-----------------------");
				
				}
				
			}
			
			while(status == 0);
			
			 }
		
			 store.close();
		
	}
	
	catch(Exception e) {
		
		System.out.println("Error: "+e);
		
	}
			
	}
	}