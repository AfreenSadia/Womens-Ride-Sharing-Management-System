package origin;

import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

public class Routes implements Locations_Destinations, Bus_Descriptions {
	
	protected String location;
	protected String destination;
	static int status = 0;
	protected String confirm;
	protected String agree;
	protected String disagree;
	
	public void show_available_routes() {
		
		System.out.println("\t-----------------");
		System.out.println("\tRoutes Available");
		System.out.println("\t-----------------");
		
		System.out.println("");
		
		System.out.println("Route - 1: Uttara -> Mirpur");
		
		System.out.println("Route - 2: Uttara -> Shabhagh");
		
		System.out.println("Route - 3: Uttara -> Jatrabari");
		
		System.out.println("");
		
	}
	
	@Override
	public void select_routes() {
		
		File file = new File("Route Selection");
		file.mkdir();
		
	do {
			
	try {
		
		Formatter store = new Formatter("F:/Work and Projects/Women Ride Sharing Management System/Route Selection/Route Details - 1.txt");
			
		Scanner input = new Scanner(System.in);
		
		String location = this.location;
		String destination = this.destination;
		
		String confirm = this.confirm;
		String agree = this.agree = "Yes";
		String disagree = this.disagree = "No";
	
		System.out.print("Enter Current Location: ");
		this.location = input.nextLine();
		store.format("Cureent Location: "+this.location);
		
		System.out.print("Enter Trip Destination: ");
		this.destination = input.nextLine();
		store.format("\r\nTrip Destination: "+this.destination);
		System.out.println("");
		
		System.out.print("Confirm ['Yes' / 'No'] ?: ");
		this.confirm = input.nextLine();
		store.format("\r\nConfirmed ?:"+this.confirm);
		System.out.println("");
		
		store.close();
		
		}
		
		catch(Exception e) {
			
			System.out.println("Error: "+e);
		}
		
		finally {
		
		if(this.confirm.equalsIgnoreCase(this.agree)) {
			
			System.out.println("\t***TRIP CONFIRMED***");
			System.out.println("");
			System.out.println("\t-----------------------------------");
			System.out.println("\t*****SEARCHING AVAILABLE BUSES*****");
			System.out.println("\t-----------------------------------");
			System.out.println("");
			
			status = 1;
			
		}
		
		else if(this.confirm.equalsIgnoreCase(this.disagree)) {
			
			System.out.println("\t---------------------------------------");
			System.out.println("\t*****Please Confirm, To Start Trip*****");
			System.out.println("\t---------------------------------------");
		}
		
		}
		
		}
		
		while(status == 0);
    } 
	
	public void select_routes_1() {
		
		File file = new File("Route Selection");
		file.mkdir();
		
	do {
			
	try {
		
		Formatter store = new Formatter("F:/Work and Projects/Women Ride Sharing Management System/Route Selection/Route Details - 2.txt");
			
		Scanner input = new Scanner(System.in);
		
		String location = this.location;
		String destination = this.destination;
		
		String confirm = this.confirm;
		String agree = this.agree = "Yes";
		String disagree = this.disagree = "No";
	
		System.out.print("Enter Current Location: ");
		this.location = input.nextLine();
		store.format("Cureent Location: "+this.location);
		
		System.out.print("Enter Trip Destination: ");
		this.destination = input.nextLine();
		store.format("\r\nTrip Destination: "+this.destination);
		System.out.println("");
		
		System.out.print("Confirm ['Yes' / 'No'] ?: ");
		this.confirm = input.nextLine();
		store.format("\r\nConfirmed ?:"+this.confirm);
		System.out.println("");
		
		store.close();
		
		}
		
		catch(Exception e) {
			
			System.out.println("Error: "+e);
		}
		
		finally {
		
		if(this.confirm.equalsIgnoreCase(this.agree)) {
			
			System.out.println("\t***TRIP CONFIRMED***");
			System.out.println("");
			System.out.println("\t-----------------------------------");
			System.out.println("\t*****SEARCHING AVAILABLE BUSES*****");
			System.out.println("\t-----------------------------------");
			System.out.println("");
			
			status = 1;
			
		}
		
		else if(this.confirm.equalsIgnoreCase(this.disagree)) {
			
			System.out.println("\t---------------------------------------");
			System.out.println("\t*****Please Confirm, To Start Trip*****");
			System.out.println("\t---------------------------------------");
		}
		
		}
		
		}
		
		while(status == 0);
    } 
	

	public void select_routes_2() {
	
	File file = new File("Route Selection");
	file.mkdir();
	
	do {
		
	try {
	
	Formatter store = new Formatter("F:/Work and Projects/Women Ride Sharing Management System/Route Selection/Route Details - 3.txt");
		
	Scanner input = new Scanner(System.in);
	
	String location = this.location;
	String destination = this.destination;
	
	String confirm = this.confirm;
	String agree = this.agree = "Yes";
	String disagree = this.disagree = "No";

	System.out.print("Enter Current Location: ");
	this.location = input.nextLine();
	store.format("Cureent Location: "+this.location);
	
	System.out.print("Enter Trip Destination: ");
	this.destination = input.nextLine();
	store.format("\r\nTrip Destination: "+this.destination);
	System.out.println("");
	
	System.out.print("Confirm ['Yes' / 'No'] ?: ");
	this.confirm = input.nextLine();
	store.format("\r\nConfirmed ?:"+this.confirm);
	System.out.println("");
	
	store.close();
	
	}
	
	catch(Exception e) {
		
		System.out.println("Error: "+e);
	}
	
	finally {
	
	if(this.confirm.equalsIgnoreCase(this.agree)) {
		
		System.out.println("\t***TRIP CONFIRMED***");
		System.out.println("");
		System.out.println("\t-----------------------------------");
		System.out.println("\t*****SEARCHING AVAILABLE BUSES*****");
		System.out.println("\t-----------------------------------");
		System.out.println("");
		
		status = 1;
		
	}
	
	else if(this.confirm.equalsIgnoreCase(this.disagree)) {
		
		System.out.println("\t---------------------------------------");
		System.out.println("\t*****Please Confirm, To Start Trip*****");
		System.out.println("\t---------------------------------------");
	}
	
	}
	
	}
	
	while(status == 0);
} 
	
	@Override
	public void bus_details() {
		
		String bus_name = "Hino Express";
		String metro = "Dhaka Metro - Chaw";
		String numer_plate = "13-5755";
		
		System.out.println("\t***BUS FOUND***");
		System.out.println("");
		System.out.println("\t-----------------");
		System.out.println("\t***BUS Details***");
		System.out.println("\t-----------------");
		System.out.println("");
		
		System.out.println("Bus Name: "+bus_name);
		System.out.println("Metro: "+metro);
		System.out.println("Number Plate: "+numer_plate);
		
	}
	
	@Override
	public void bus_details1() {
		
		String bus_name = "Ena City Service";
		String metro = "Dhaka Metro - Chaw";
		String numer_plate = "14-5755";
		
		System.out.println("\t***BUS FOUND***");
		System.out.println("");
		System.out.println("\t-----------------");
		System.out.println("\t***BUS Details***");
		System.out.println("\t-----------------");
		System.out.println("");
		
		System.out.println("Bus Name: "+bus_name);
		System.out.println("Metro: "+metro);
		System.out.println("Number Plate: "+numer_plate);
		
	}
	
	@Override
	public void bus_details2() {
		
		String bus_name = "Green Line";
		String metro = "Dhaka Metro - Chaw";
		String numer_plate = "15-5755";
		
		System.out.println("\t***BUS FOUND***");
		System.out.println("");
		System.out.println("\t-----------------");
		System.out.println("\t***BUS Details***");
		System.out.println("\t-----------------");
		System.out.println("");
		
		System.out.println("Bus Name: "+bus_name);
		System.out.println("Metro: "+metro);
		System.out.println("Number Plate: "+numer_plate);
		
	}
	

}
	
		
		
		
	