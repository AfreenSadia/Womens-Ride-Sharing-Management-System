package origin;

import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

public class Vehicles extends Vehicle_Selection {
	
	protected String vehicle_name;
	protected String city_metro;
	protected String number_plate;
	
	static int status = 0;
	
	@Override
	public void Select_Vehicle() {
		
		File file = new File("Vehicle Informations");
		file.mkdir();	
	
	do {
		
		try {
			
		Formatter store = new Formatter("F:/Work and Projects/Women Ride Sharing Management System/Vehicle Informations/Vehicle Selection Details - 1.txt");

			
		Scanner input = new Scanner(System.in);
		
		String vehicle_name = this.vehicle_name;
		String city_metro = this.city_metro;
		String number_plate = this.number_plate;
		String confirm = super.confirm;
		String agree = super.agree = "Yes";
		
		System.out.print("Enter Vehicle Name: ");
		this.vehicle_name = input.nextLine();
		store.format("Vehicle Name: "+this.vehicle_name);
		
		System.out.print("Enter Metro: ");
		this.city_metro = input.nextLine();
		store.format("\r\nMetro Name: "+this.city_metro);
		
		System.out.print("Enter Vehicle Number Plate: ");
		this.number_plate = input.nextLine();
		store.format("\r\nNumber Plate: "+this.number_plate);
		
		System.out.println("");
		
		System.out.print("Confirm ['Yes' / 'No'] ?: = ");
		super.confirm = input.nextLine();
		store.format("\r\nConfirmed: "+super.confirm);
		
		store.close();
		
		}
		
		catch(Exception e) {
			
			System.out.println("Error: "+e);
		}
		
		finally {
		
		if(this.vehicle_name.equalsIgnoreCase("Hino Express") && this.city_metro.equalsIgnoreCase("Dhaka Metro - Chaw") && this.number_plate.equalsIgnoreCase("13-5755") && super.confirm.equalsIgnoreCase(super.agree)) {
			
			System.out.println("");
			System.out.println("\t------------------------------------------------------");
			System.out.println("\t\t  *****Vehicle Matched*****");
			System.out.println("\t\t*****STARTED RIDE SHARING*****");
			System.out.println("\t------------------------------------------------------");
			System.out.println("");
			
			status = 1;
		}
		
		else if(this.vehicle_name != "Hino Express" || this.city_metro != "Dhaka Metro - Chaw" || this.number_plate != "13-5755" && super.confirm.equalsIgnoreCase(super.agree)) {
			
			System.out.println("");
			System.out.println("\t------------------------------------------------------");
			System.out.println("\t\t  *****Vehicle Missmatched*****");
			System.out.println("\t\t*****RIDE SHARING FAILED*****");
			System.out.println("\t------------------------------------------------------");
			System.out.println("");

	}
		
		}
		
} 
	
	while(status == 0);
	
	}
	
	
	@Override
	public void Select_Vehicle1() {
		
		File file = new File("Vehicle Informations");
		file.mkdir();	
	
	do {
		
		try {
			
		Formatter store = new Formatter("F:/Work and Projects/Women Ride Sharing Management System/Vehicle Informations/Vehicle Information - 2.txt");

			
		Scanner input = new Scanner(System.in);
		
		String vehicle_name = this.vehicle_name;
		String city_metro = this.city_metro;
		String number_plate = this.number_plate;
		String confirm = super.confirm;
		
		System.out.print("Enter Vehicle Name: ");
		this.vehicle_name = input.nextLine();
		store.format("Vehicle Name: "+this.vehicle_name);
		
		System.out.print("Enter Metro: ");
		this.city_metro = input.nextLine();
		store.format("\r\nMetro Name: "+this.city_metro);
		
		System.out.print("Enter Vehicle Number Plate: ");
		this.number_plate = input.nextLine();
		store.format("\r\nNumber Plate: "+this.number_plate);
		
		System.out.println("");
		
		System.out.print("Confirm = ");
		super.confirm = input.nextLine();
		store.format("\r\nConfirmed: "+super.confirm);
		
		store.close();
		
		}
		
		catch(Exception e) {
			
			System.out.println("Error: "+e);
		}
		
		finally {
		
		if(this.vehicle_name.equalsIgnoreCase("Ena City Service") && this.city_metro.equalsIgnoreCase("Dhaka Metro - Chaw") && this.number_plate.equalsIgnoreCase("14-5755")) {
			
			System.out.println("");
			System.out.println("\t------------------------------------------------------");
			System.out.println("\t\t  *****Vehicle Matched*****");
			System.out.println("\t\t*****STARTED RIDE SHARING*****");
			System.out.println("\t------------------------------------------------------");
			System.out.println("");
			
			status = 1;
		}
		
		else if(this.vehicle_name != "Ena City Service" || this.city_metro != "Dhaka Metro - Chaw" || this.number_plate != "14-5755") {
			
			System.out.println("");
			System.out.println("\t------------------------------------------------------");
			System.out.println("\t\t  *****Vehicle Missmatched*****");
			System.out.println("\t\t*****RIDE SHARING FAILED*****");
			System.out.println("\t------------------------------------------------------");
			System.out.println("");

	}
		
		}
		
} 
	
	while(status == 0);
	
	}
		
	@Override
	public void Select_Vehicle2() {
		
		File file = new File("Vehicle Informations");
		file.mkdir();	
	
	do {
		
		try {
			
		Formatter store = new Formatter("F:/Work and Projects/Women Ride Sharing Management System/Vehicle Informations/Vehicle Information - 3.txt");
			
		Scanner input = new Scanner(System.in);
		
		String vehicle_name = this.vehicle_name;
		String city_metro = this.city_metro;
		String number_plate = this.number_plate;
		String confirm = super.confirm;
		
		System.out.print("Enter Vehicle Name: ");
		this.vehicle_name = input.nextLine();
		store.format("Vehicle Name: "+this.vehicle_name);
		
		System.out.print("Enter Metro: ");
		this.city_metro = input.nextLine();
		store.format("\r\nMetro Name: "+this.city_metro);
		
		System.out.print("Enter Vehicle Number Plate: ");
		this.number_plate = input.nextLine();
		store.format("\r\nNumber Plate: "+this.number_plate);
		
		System.out.println("");
		
		System.out.print("Confirm = ");
		super.confirm = input.nextLine();
		store.format("Confirmed: "+super.confirm);
		
		store.close();
		
		}
		
		catch(Exception e) {
			
			System.out.println("Error: "+e);
		}
		
		finally {
		
		if(this.vehicle_name.equalsIgnoreCase("Green Line") && this.city_metro.equalsIgnoreCase("Dhaka Metro - Chaw") && this.number_plate.equalsIgnoreCase("15-5755")) {
			
			System.out.println("");
			System.out.println("\t------------------------------------------------------");
			System.out.println("\t\t  *****Vehicle Matched*****");
			System.out.println("\t\t*****STARTED RIDE SHARING*****");
			System.out.println("\t------------------------------------------------------");
			System.out.println("");
			
			status = 1;
		}
		
		else if(this.vehicle_name != "Green Line" || this.city_metro != "Dhaka Metro - Chaw" || this.number_plate != "15-5755") {
			
			System.out.println("");
			System.out.println("\t------------------------------------------------------");
			System.out.println("\t\t  *****Vehicle Missmatched*****");
			System.out.println("\t\t*****RIDE SHARING FAILED*****");
			System.out.println("\t------------------------------------------------------");
			System.out.println("");

	}
		
		}
		
} 
	
	while(status == 0);
	
	}

}
