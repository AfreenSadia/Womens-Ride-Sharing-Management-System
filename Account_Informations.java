package origin;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;

public class Account_Informations implements General_Account_Registration, Driver_Account_Registration {
	

	public void general_user_info() {
		
		File [] files = {new File("F:/Work and Projects/Women Ride Sharing Management System/General Registration/General Information.txt")};
		
		for(File file : files) {
			
			if(file.isFile()) {
				
				BufferedReader inputStream = null;
				
				String line;
				
		try {
			
			inputStream = new BufferedReader(new FileReader(file));
			
			while((line = inputStream.readLine()) != null) {
				
				System.out.println(line);
	
			}
		}
			catch(Exception e) {
				
				System.out.println("Error: "+e);
				
				}
			}
		}
		
	}
	
	
			//General User Part - 1
	
	public void general_user_after_login_info() {
		
		File [] files = {new File("F:/Work and Projects/Women Ride Sharing Management System/General Signing In Informations/General User Signing In Information - 1.txt"),
				
				new File("F:/Work and Projects/Women Ride Sharing Management System/Vehicle Informations/Vehicle Selection Details - 1.txt"),
				
				new File("F:/Work and Projects/Women Ride Sharing Management System/Route Selection/Route Details - 1.txt"), 
				
				new File("F:/Work and Projects/Women Ride Sharing Management System/On Trip Records/User - 1 Responses During The Trip.txt")}; 
		
		for(File file : files) {
			
			if(file.isFile()) {
				
				BufferedReader inputStream = null;
				
				String line;
				
		try {
			
			inputStream = new BufferedReader(new FileReader(file));
			
			while((line = inputStream.readLine()) != null) {
				
				
				System.out.println(line);
				
			}
		}
			catch(Exception e) {
				
				System.out.println("Error: "+e);
				
				}
			}
		}
		
	}

	public void general_user_after_login_info_1() {
		
		File [] files = {new File("F:/Work and Projects/Women Ride Sharing Management System/General Signing In Informations/General User Signing In Information - 2.txt"),
				
				new File("F:/Work and Projects/Women Ride Sharing Management System/Vehicle Informations/Vehicle Selection Details - 2.txt"),
				
				new File("F:/Work and Projects/Women Ride Sharing Management System/Route Selection/Route Details - 2.txt"), 
				
				new File("F:/Work and Projects/Women Ride Sharing Management System/On Trip Records/User - 2 Responses During The Trip.txt")}; 
		
		for(File file : files) {
			
			if(file.isFile()) {
				
				BufferedReader inputStream = null;
				
				String line;
				
		try {
			
			inputStream = new BufferedReader(new FileReader(file));
			
			while((line = inputStream.readLine()) != null) {
				
				System.out.println(line);
				
			}
		}
			catch(Exception e) {
				
				System.out.println("Error: "+e);
				
				}
			}
		}
		
	}
	
	
	public void general_user_after_login_info_2() {
		
		File [] files = {new File("F:/Work and Projects/Women Ride Sharing Management System/General Signing In Informations/General User Signing In Information - 3.txt"),
				
				new File("F:/Work and Projects/Women Ride Sharing Management System/Vehicle Informations/Vehicle Selection Details - 3.txt"),
				
				new File("F:/Work and Projects/Women Ride Sharing Management System/Route Selection/Route Details - 3.txt"), 
				
				new File("F:/Work and Projects/Women Ride Sharing Management System/On Trip Records/User - 3 Responses During The Trip.txt")}; 
		
		for(File file : files) {
			
			if(file.isFile()) {
				
				BufferedReader inputStream = null;
				
				String line;
				
		try {
			
			inputStream = new BufferedReader(new FileReader(file));
			
			while((line = inputStream.readLine()) != null) {
				
				System.out.println(line);
				
			}
		}
			catch(Exception e) {
				
				System.out.println("Error: "+e);
				
				}
			}
		}
		
	}

	
	//DRIVER PART 

	
	public void driver_user_info() {
		
		File [] files = {new File("F:/Work and Projects/Women Ride Sharing Management System/Driver Registration/Driver Information.txt")};
		
		for(File file : files) {
			
			if(file.isFile()) {
				
				BufferedReader inputStream = null;
				
				String line;
				
		try {
			
			inputStream = new BufferedReader(new FileReader(file));
			
			while((line = inputStream.readLine()) != null) {
				
				System.out.println(line);
	
			}
		}
			catch(Exception e) {
				
				System.out.println("Error: "+e);
				
				}
			}
		}
		
	}
	
	
	public void driver_user_after_login_info() {
		
		File [] files = {new File("F:/Work and Projects/Women Ride Sharing Management System/Driver Signing In Informations/Driver User Signing In Information - 1.txt"), 
						new File("F:/Work and Projects/Women Ride Sharing Management System/Vehicle Informations/Vehicle Selection Details - 1.txt")}; 
		
		for(File file : files) {
			
			if(file.isFile()) {
				
				BufferedReader inputStream = null;
				
				String line;
				
		try {
			
			inputStream = new BufferedReader(new FileReader(file));
			
			while((line = inputStream.readLine()) != null) {
				
				System.out.println(line);
				
			}
		}
			catch(Exception e) {
				
				System.out.println("Error: "+e);
				
				}
			}
		}
	}
	
	public void driver_user_after_login_info_1() {
		
		File [] files = {new File("F:/Work and Projects/Women Ride Sharing Management System/Driver Signing In Informations/Driver User Signing In Information - 2.txt"), 
						new File("F:/Work and Projects/Women Ride Sharing Management System/Vehicle Informations/Vehicle Selection Details - 2.txt")}; 
		
		for(File file : files) {
			
			if(file.isFile()) {
				
				BufferedReader inputStream = null;
				
				String line;
				
		try {
			
			inputStream = new BufferedReader(new FileReader(file));
			
			while((line = inputStream.readLine()) != null) {
				
				System.out.println(line);
				
			}
		}
			catch(Exception e) {
				
				System.out.println("Error: "+e);
				
				}
			}
		}
	}
	
	public void driver_user_after_login_info_2() {
		
		File [] files = {new File("F:/Work and Projects/Women Ride Sharing Management System/Driver Signing In Informations/Driver User Signing In Information - 3.txt"), 
						new File("F:/Work and Projects/Women Ride Sharing Management System/Vehicle Informations/Vehicle Selection Details - 3.txt")}; 
		
		for(File file : files) {
			
			if(file.isFile()) {
				
				BufferedReader inputStream = null;
				
				String line;
				
		try {
			
			inputStream = new BufferedReader(new FileReader(file));
			
			while((line = inputStream.readLine()) != null) {
				
				System.out.println(line);
				
			}
		}
			catch(Exception e) {
				
				System.out.println("Error: "+e);
				
				}
			}
		}
	}
	

}
