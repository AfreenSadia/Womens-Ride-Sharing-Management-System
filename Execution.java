package origin;

import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

public class Execution {

	static int status = 0;
	static int status1 = 0;
	static int status2 = 0;
	static int status3 = 0;
	static int status4 = 0;
	static int status5 = 0;
	static int status6 = 0;
	static int status7 = 0;
	static int status8 = 0;
	static int status9 = 0;
	static int status10 = 0;
	static int status11 = 0;
	static int status12 = 0;
	static int status13 = 0;
	static int status14 = 0;
	static int status15 = 0;
	static int status16 = 0;
	static int status17 = 0;
	static int status18 = 0;
	static int status19 = 0;
	static int status20 = 0;
	
	static int status21 = 0;
	
	
	public static void main(String[] args) {
	
		do {
			
		
		Scanner input50 = new Scanner(System.in);
		
		String s;
		
		System.out.println("\t-------------------------------------------------");
		System.out.println("\t\t\tE U P H O R I A");
		System.out.println("\t-------------------------------------------------");
		System.out.println("");
		
		System.out.print("Please Choose ['About Us'/'Begin'] ?: ");
		s = input50.nextLine();
		System.out.println("");
		
		switch(s) {
		
		case "About Us":
			
			System.out.println("\t------------------------------------------------------");
			System.out.println("\t\t\tDeveloped by,");
			System.out.println("\t\t\t1. Syed Golam Abid");
			System.out.println("\t\t\t2. Sadia Afrin");
			System.out.println("\t------------------------------------------------------");
			
			System.out.println("\t------------------------------------------------------");
			System.out.println("\t\t\tInstructed and Directed by,");
			System.out.println("\t\t\tMD. Ismail Hossen");
			System.out.println("\t------------------------------------------------------");
			
			status21 = 1;
			
			break;
			
		case "Begin":
			
		File file = new File("Program Runtime Records");
		file.mkdir();
		
		try {
			
			Formatter store = new Formatter("F:/Work and Projects/Women Ride Sharing Management System/Program Runtime Records/Overall Records.txt");
			
			System.out.println("\t------------------------------------------------------");
			System.out.println("\t\t\t*****WELCOME*****");
			System.out.println("\t------------------------------------------------------");
			
			System.out.println("");
		
		do {
		
		Scanner input2 = new Scanner(System.in);
		
		String response;
		
		System.out.print("Do You Want to Sign Up or Sign In ['Sign Up' / 'Sign In'] ?: ");
		response = input2.nextLine();
		store.format("Wanted To [Sign Up / Sign In] ?: "+response);
		
		System.out.println("");
		
		if(response.equalsIgnoreCase("Sign Up")) {
			
			System.out.println("\t------------------------------------------------------");
			System.out.println("\t\t\t*****Sign Up*****");
			System.out.println("\t------------------------------------------------------");
			System.out.println("");
			
		do {
		
		Scanner input = new Scanner(System.in);
		
		String resgistration_response;
		
		System.out.print("Please Select Between General and Driver Registration ['General' / 'Driver' / 'Admin'] ?: ");
		resgistration_response = input.nextLine();
		store.format("\r\nChose [General / Driver] Resgistrattion ?: "+resgistration_response);
		
		if(resgistration_response.equalsIgnoreCase("General")) {
				
			Registration obj = new General(); 
			
			obj.information();
			
			status1 = 1;
			
		}
		
		else if(resgistration_response.equalsIgnoreCase("Driver")) {
				
				Registration obj1 = new Driver();
				
				obj1.information();
				
				status1 = 1;

		}
		
		else if(resgistration_response.equalsIgnoreCase("Admin")) {
			
			Registration obj10 = new Admin();
			
			obj10.information();
			
			status1 = 1;

		}
	
		else if(resgistration_response != "General" || resgistration_response != "Driver" || resgistration_response != "Admin") {
					
				System.out.println("");
				System.out.println("\t------------");
				System.out.println("\tInvalid User");
				System.out.println("\t------------");
				System.out.println("");
					
					
			}
		
		status = 1;
		
		}
		
		while(status1 == 0);
		
		}

		
		else if(response.equalsIgnoreCase("Sign In")) {
			
			System.out.println("\t------------------------------------------------------");
			System.out.println("\t\t\t*****Sign In*****");
			System.out.println("\t------------------------------------------------------");
			System.out.println("");
				
			do {
				
			Scanner input3 = new Scanner(System.in);
			
			int user;
			String login_response;
			System.out.print("Please Select Between General and Driver Sign In ['General' / 'Driver' / 'Admin']: ");
			login_response = input3.nextLine();
			store.format("\r\nChose [General / Driver] Sign In ?: "+login_response);
			
			System.out.println("");
			
			if (login_response.equalsIgnoreCase("General")) {
				
				System.out.println("\t------------------------------------------------------");
				System.out.println("\t\t    *****General Login*****");
				System.out.println("\t------------------------------------------------------");
				
				System.out.println("");
				
				status2 = 1;
				
				do {
					
				System.out.print("\t\tPlease Select User [1/2/3]?: ");
				user = input3.nextInt();
				store.format("\r\nGeneral User Number Selected ?: "+user);
				
				System.out.println("");
				
				System.out.println("");
			
				
			switch(user) {
				
				case 1:
					
					Sign_In obj2 = new Login_General();
					
					obj2.login_information();
					
					Routes obj5 = new Routes();
					
					obj5.show_available_routes();
					obj5.select_routes();
					obj5.bus_details();
					
					On_Trip_Udates obj8 = new On_Trip_Udates();
					
					obj8.messages();
					
					status3 = 1;
					
					break;
					
					
				case 2:
					
					Sign_In obj3 = new Login_General();
					
					obj3.login_information1();
					
					Routes obj6 = new Routes();
					
					obj6.show_available_routes();
					obj6.select_routes_1();
					obj6.bus_details1();
					
					On_Trip_Udates obj9 = new On_Trip_Udates();
					
					obj9.messages1();
					
					status3 = 1;
					
					break;
					
				case 3: 
					
					Sign_In obj4 = new Login_General();
					
					obj4.login_information2();
					
					Routes obj7 = new Routes();
					
					obj7.show_available_routes();
					obj7.select_routes_2();
					obj7.bus_details2();
					
					On_Trip_Udates obj10 = new On_Trip_Udates();
					
					obj10.messages2();
					
					status3 = 1;
						
					break;
					
					default:
						
						System.out.println("\t------------");
						System.out.println("\tInvalid User");
						System.out.println("\t------------");
						System.out.println("");
						
			}
		}
				
			while(status3 == 0);
				
			}
			
			
		else if	(login_response.equalsIgnoreCase("Driver")) {
		
			System.out.println("\t------------------------------------------------------");
			System.out.println("\t\t    *****Driver Login*****");
			System.out.println("\t------------------------------------------------------");
				
			System.out.println("");
			
			status2 = 1;
			
			do {
			
			System.out.print("Please Select User [1/2/3]?: ");
			user = input3.nextInt();
			store.format("\r\nDriver User Number Selected ?: "+user);
			
			System.out.println("");
				
			switch(user) {
				
				case 1:
					
					Sign_In obj2 = new Login_Driver();
					
					obj2.login_information();
					
					Vehicle_Selection vs1 = new Vehicles();
					
					System.out.print("\t\t\tPlease Provide Vehicle Description");
					
					System.out.println("");
					System.out.println("");
					
					vs1.Select_Vehicle();
					
					status4 = 1;
					
					
					break;
					
				case 2:
					
					Sign_In obj3 = new Login_Driver();
					
					obj3.login_information1();
					
					System.out.print("\t\t\tPlease Provide Vehicle Description");
					
					System.out.println("");
					System.out.println("");
					
					Vehicle_Selection vs2 = new Vehicles();
					
					vs2.Select_Vehicle1();
					
					status4 = 1;
					
					break;
					
				case 3: 
					
					Sign_In obj4 = new Login_Driver();
					
					obj4.login_information2();
					
					System.out.print("\t\t***Please Provide Vehicle Description***");
					
					System.out.println("");
					System.out.println("");
					
					Vehicle_Selection vs3 = new Vehicles();
					
					vs3.Select_Vehicle2();
					
					status4 = 1;
					
					break;
					
					default:
						
						System.out.println("\t------------");
						System.out.println("\tInvalid User");
						System.out.println("\t------------");
						System.out.println("");
						
						
					}
			
		}
			
			while(status4 == 0);
			
		}
		
			
		else if (login_response.equalsIgnoreCase("Admin")) {
			
			System.out.println("\t------------------------------------------------------");
			System.out.println("\t\t    *****Admin Login*****");
			System.out.println("\t------------------------------------------------------");
				
			System.out.println("");
			
			status2 = 1;
			
			do {
				
			System.out.print("Please Select User [1/2/3]?: ");
			user = input3.nextInt();
			store.format("\r\nDriver User Number Selected ?: "+user);
			
			System.out.println("");
			
			switch(user) {
			
				case 1:
					
					Sign_In obj11 = new Login_Admin();
					
					obj11.login_information();
			do {
				
			
					Scanner input = new Scanner(System.in);
					
					String read;
					
					System.out.println("");
					System.out.println("---------------------------------------------------------------------");
					System.out.print("Please Select Which Account You Want To View ['General' / 'Driver'] ?: ");
					read = input.nextLine();
					System.out.println("---------------------------------------------------------------------");
					System.out.println("");
					
					
					if(read.equalsIgnoreCase("General")) {
						
						System.out.println("\t-----------------------");
						System.out.println("\t*****General Account***");
						System.out.println("\t-----------------------");
						System.out.println("");
						
						status6 = 1;
						
					do {
						
					Scanner input5 = new Scanner(System.in);
					
					String reply;
					
					System.out.println("");
					System.out.println("---------------------------------------------------------------------");
					System.out.print("Please Select Which Category You Want To View ['New' / 'Exsisiting'] ?: ");
					reply = input5.nextLine();
					System.out.println("---------------------------------------------------------------------");
					System.out.println("");
					
					
					switch(reply) {
					
					case "New":
					
						Account_Informations obj14 = new Account_Informations();
						
						System.out.println("--------------------------------------------");
						System.out.println("***UPCOMING USER ACCOUNT APPROVAL REQUEST***");
						System.out.println("");
						obj14.general_user_info();
						System.out.println("--------------------------------------------");
						
						System.out.println("");
						
						do {
							
						Scanner input6 = new Scanner(System.in);
						
						String aprv;
						
						System.out.print("Approve Account ['Yes' / 'No'] ?: ");
						aprv = input6.nextLine();
						
						if(aprv.equalsIgnoreCase("Yes")) {
							
							System.out.println("");
							System.out.println("\t----------------");
							System.out.println("\tAccount Approved");
							System.out.println("\t----------------");
							System.out.println("");
							
							status8 = 1;
						}
						
						else if(aprv.equalsIgnoreCase("No")) {
							
							System.out.println("");
							System.out.println("\t----------------");
							System.out.println("\tAccount Rejected");
							System.out.println("\t----------------");
							System.out.println("");
							
							status8 = 1;
						}
						
						else if(aprv != "Yes" || aprv != "No") {
							
							System.out.println("\t-----------------");
							System.out.println("\tInvalid Selection");
							System.out.println("\t-----------------");
							System.out.println("");
						}
						
						status7 = 1;
					
						}
						
						while(status8 == 0);
						
						break;
					
					case "Exsisiting":
						
						Account_Informations obj16 = new Account_Informations();
						
						System.out.println("--------------------------");
						System.out.println("***USER RECENT ACTIVITY***");
						System.out.println("");
						obj16.general_user_after_login_info();
						System.out.println("--------------------------");
						
						System.out.println("");
						
						status7 = 1;
						
						break;
						
					default:
						
						System.out.println("\t-----------------");
						System.out.println("\tInvalid Selection");
						System.out.println("\t-----------------");
						System.out.println("");
						
						
						
						break;
						
						
					
					}
					
				}
					
					while(status7 == 0);
					
					}
					
					
					else if(read.equalsIgnoreCase("Driver")) {
						
						System.out.println("\t--------------------");
						System.out.println("\t***Driver Account***");
						System.out.println("\t--------------------");
						System.out.println("");
						
						status6 = 1;
						
						do {
							
						
						Scanner input5 = new Scanner(System.in);
						
						String reply;
						
						System.out.println("");
						System.out.println("---------------------------------------------------------------------");
						System.out.print("Please Select Which Category You Want To View ['New' / 'Exsisiting'] ?:");
						reply = input5.nextLine();
						System.out.println("---------------------------------------------------------------------");
						System.out.println("");
						
						switch(reply) {
						
						case "New":
							
							Account_Informations obj15 = new Account_Informations();
							
							System.out.println("--------------------------------------------");
							System.out.println("***UPCOMING USER ACCOUNT APPROVAL REQUEST***");	
							System.out.println("");
							obj15.driver_user_info();
							System.out.println("--------------------------------------------");
							
							System.out.println("");
							
							do {
								
							
							Scanner input6 = new Scanner(System.in);
							
							String aprv;
							
							System.out.print("Approve Account ['Yes' / 'No'] ?: ");
							aprv = input6.nextLine();
							
							if(aprv.equalsIgnoreCase("Yes")) {
								
								System.out.println("");
								System.out.println("\t----------------");
								System.out.println("\tAccount Approved");
								System.out.println("\t----------------");
								System.out.println("");
								
								status15 = 1;
							}
							
							else if(aprv.equalsIgnoreCase("No")) {
								
								System.out.println("");
								System.out.println("\t----------------");
								System.out.println("\tAccount Rejected");
								System.out.println("\t----------------");
								System.out.println("");
								
								status15 = 1;
							}
							
							else if(aprv != "Yes" || aprv != "No") {
								
								System.out.println("\t-----------------");
								System.out.println("\tInvalid Selection");
								System.out.println("\t-----------------");
								System.out.println("");
							}
							
							status9 = 1;
							
							}
							
							while(status15 == 0);
							
							break;
							
						case "Exsisiting":
							
							Account_Informations obj18 = new Account_Informations();
							
							System.out.println("--------------------------");
							System.out.println("***USER RECENT ACTIVITY***");
							System.out.println("");
							obj18.driver_user_after_login_info();
							System.out.println("--------------------------");
						
							System.out.println("");
							
							status9 = 1;
							
							break;
							
						default:
							
							System.out.println("\t-----------------");
							System.out.println("\tInvalid Selection");
							System.out.println("\t-----------------");
							System.out.println("");
							
						
					}
						
					}
						
						while(status9 == 0);
						
					}
					
					else if(read != "General" || read != "Driver") {
						
						System.out.println("\t-----------------");
						System.out.println("\tInvalid Selection");
						System.out.println("\t-----------------");
						System.out.println("");
					}
					
					status5 = 1;	
				
			}
			
			while(status6 == 0);
			
			break;	
					
				case 2:
					
					Sign_In obj12 = new Login_Admin();
					
					obj12.login_information1();
					
					do {
						
					
					Scanner input15 = new Scanner(System.in);
					
					String read_1;
					
					System.out.println("");
					System.out.println("---------------------------------------------------------------------");
					System.out.print("Please Select Which Account You Want To View ['General' / 'Driver'] ?: ");
					read_1 = input15.nextLine();
					System.out.println("---------------------------------------------------------------------");
					System.out.println("");
					
					
					if(read_1.equalsIgnoreCase("General")) {
						
						System.out.println("\t-----------------------");
						System.out.println("\t*****General Account***");
						System.out.println("\t-----------------------");
						System.out.println("");
						
						status10 = 1;
					
					do {
						
					
					Scanner input16 = new Scanner(System.in);
					
					String reply_1;
					
					System.out.println("");
					System.out.println("---------------------------------------------------------------------");
					System.out.print("Please Select Which Category You Want To View ['New' / 'Exsisiting'] ?: ");
					reply_1 = input16.nextLine();
					System.out.println("---------------------------------------------------------------------");
					System.out.println("");
					
					
					switch(reply_1) {
					
					case "New":
					
						Account_Informations obj17 = new Account_Informations();
						

						System.out.println("--------------------------------------------");
						System.out.println("***UPCOMING USER ACCOUNT APPROVAL REQUEST***");
						System.out.println("");
						obj17.general_user_info();
						System.out.println("--------------------------------------------");
						
						System.out.println("");
						
						do {
							
						
						Scanner input17 = new Scanner(System.in);
						
						String aprv_1;
						
						System.out.print("Approve Account ['Yes' / 'No'] ?: ");
						aprv_1 = input17.nextLine();
						
						if(aprv_1.equalsIgnoreCase("Yes")) {
							
							System.out.println("");
							System.out.println("\t----------------");
							System.out.println("\tAccount Approved");
							System.out.println("\t----------------");
							System.out.println("");
							
							status14 = 1;
						}
						
						else if(aprv_1.equalsIgnoreCase("No")) {
							
							System.out.println("");
							System.out.println("\t----------------");
							System.out.println("\tAccount Rejected");
							System.out.println("\t----------------");
							System.out.println("");
							
							status14 = 1;
						}
						
						else if(aprv_1 != "Yes" || aprv_1 != "No") {
							
							System.out.println("\t-----------------");
							System.out.println("\tInvalid Selection");
							System.out.println("\t-----------------");
							System.out.println("");
						}
						
						status11 = 1;
					
					
						}
						
						while(status14 == 0);
						

						break;
					
					case "Exsisiting":
						
						Account_Informations obj18 = new Account_Informations();
						
						System.out.println("--------------------------");
						System.out.println("***USER RECENT ACTIVITY***");
						System.out.println("");
						obj18.general_user_after_login_info_1();
						System.out.println("--------------------------");
						
						System.out.println("");
						
						status11 = 1;
						
						break;
						
					default:
						
						System.out.println("\t-----------------");
						System.out.println("\tInvalid Selection");
						System.out.println("\t-----------------");
						System.out.println("");
						
					}
				}
					
					while(status11 == 0);
					
					}
					
					else if(read_1.equalsIgnoreCase("Driver")) {
						
						System.out.println("\t-----------------------");
						System.out.println("\t*****Driver Account***");
						System.out.println("\t-----------------------");
						System.out.println("");
						
						status10 = 1;
						
						do {
							
						
						Scanner input32 = new Scanner(System.in);
						
						String reply32;
						
						System.out.println("");
						System.out.println("---------------------------------------------------------------------");
						System.out.print("Please Select Which Category You Want To View ['New' / 'Exsisiting'] ?:");
						reply32 = input32.nextLine();
						System.out.println("---------------------------------------------------------------------");
						System.out.println("");
						
						switch(reply32) {
						
						case "New":
							
							Account_Informations obj52 = new Account_Informations();
							
							System.out.println("--------------------------------------------");
							System.out.println("***UPCOMING USER ACCOUNT APPROVAL REQUEST***");	
							System.out.println("");
							obj52.driver_user_info();
							System.out.println("--------------------------------------------");
							
							System.out.println("");
							
							Scanner input34 = new Scanner(System.in);
							
							String aprv2;
							
							do {
								
							
							System.out.print("Approve Account ['Yes' / 'No'] ?: ");
							aprv2 = input34.nextLine();
							
							if(aprv2.equalsIgnoreCase("Yes")) {
								
								System.out.println("");
								System.out.println("\t----------------");
								System.out.println("\tAccount Approved");
								System.out.println("\t----------------");
								System.out.println("");
								
								status12 = 1;
							}
							
							else if(aprv2.equalsIgnoreCase("No")) {
								
								System.out.println("");
								System.out.println("\t----------------");
								System.out.println("\tAccount Rejected");
								System.out.println("\t----------------");
								System.out.println("");
								
								status12 = 1;
							}
							
							else if(aprv2 != "Yes" || aprv2 != "No") {
								
								System.out.println("\t-----------------");
								System.out.println("\tInvalid Selection");
								System.out.println("\t-----------------");
								System.out.println("");
								
							}
							
							status13 = 1;
							
							
							}
							
							while(status12 == 0);
							

							break;
							
						case "Exsisiting":
							
							Account_Informations obj42 = new Account_Informations();
							
							System.out.println("--------------------------");
							System.out.println("***USER RECENT ACTIVITY***");
							System.out.println("");
							obj42.driver_user_after_login_info();
							System.out.println("--------------------------");
						
							System.out.println("");
							
							status13 = 1;
							
							break;
							
						default:
							
							System.out.println("\t-----------------");
							System.out.println("\tInvalid Selection");
							System.out.println("\t-----------------");
							System.out.println("");
						
					}
						
					}
						
						while(status13 == 0);
						
					}
					
					else if(read_1 != "General" || read_1 != "Driver") {
						
						System.out.println("\t-----------------");
						System.out.println("\tInvalid Selection");
						System.out.println("\t-----------------");
						System.out.println("");
					}
					
					status5 = 1;
					
					
					}
					
					while(status10 == 0);
					
					break;
					
				case 3:
					
					Sign_In obj13 = new Login_Admin();
					
					obj13.login_information2();
					
					do {
						
					
					Scanner input19 = new Scanner(System.in);
					
					String read19;
					
					System.out.println("");
					System.out.println("---------------------------------------------------------------------");
					System.out.print("Please Select Which Account You Want To View ['General' / 'Driver'] ?: ");
					read19 = input19.nextLine();
					System.out.println("---------------------------------------------------------------------");
					System.out.println("");
					
					
					if(read19.equalsIgnoreCase("General")) {
						
						System.out.println("\t-----------------------");
						System.out.println("\t*****General Account***");
						System.out.println("\t-----------------------");
						System.out.println("");
						
						status16 = 1;
						
					do {
					
							
					Scanner input20 = new Scanner(System.in);
					
					String reply20;
					
					System.out.println("");
					System.out.println("---------------------------------------------------------------------");
					System.out.print("Please Select Which Category You Want To View ['New' / 'Exsisiting'] ?: ");
					reply20 = input20.nextLine();
					System.out.println("---------------------------------------------------------------------");
					System.out.println("");
					
					
					switch(reply20) {
					
					case "New":
					
						Account_Informations obj19 = new Account_Informations();
						
						System.out.println("--------------------------------------------");
						System.out.println("***UPCOMING USER ACCOUNT APPROVAL REQUEST***");
						System.out.println("");
						obj19.general_user_info();
						System.out.println("--------------------------------------------");
						
						System.out.println("");
						
						do {
							
						Scanner input21 = new Scanner(System.in);
						
						String aprv3;
						
						System.out.print("Approve Account ['Yes' / 'No'] ?: ");
						aprv3 = input21.nextLine();
						
						if(aprv3.equalsIgnoreCase("Yes")) {
							
							System.out.println("");
							System.out.println("\t----------------");
							System.out.println("\tAccount Approved");
							System.out.println("\t----------------");
							System.out.println("");
							
							status18 = 1;
						}
						
						else if(aprv3.equalsIgnoreCase("No")) {
							
							System.out.println("");
							System.out.println("\t----------------");
							System.out.println("\tAccount Rejected");
							System.out.println("\t----------------");
							System.out.println("");
							
							status18 = 1;
						}
						
						else if(aprv3 != "Yes" || aprv3 != "No") {
							
							System.out.println("\t-----------------");
							System.out.println("\tInvalid Selection");
							System.out.println("\t-----------------");
							System.out.println("");
							
						}
						
						status17 = 1;
					
						}
						
						while(status18 == 0);
						
						break;
				
					case "Exsisiting":
						
						Account_Informations obj21 = new Account_Informations();
						
						System.out.println("--------------------------");
						System.out.println("***USER RECENT ACTIVITY***");
						System.out.println("");
						obj21.general_user_after_login_info();
						System.out.println("--------------------------");
						
						System.out.println("");
						
						status17 = 1;
						
						break;
						
					default:
						
						System.out.println("\t-----------------");
						System.out.println("\tInvalid Selection");
						System.out.println("\t-----------------");
						System.out.println("");
						
						
					
					}
					
				}
					
					while(status17 == 0);
					
					}
					
					
					else if(read19.equalsIgnoreCase("Driver")) {
						
						System.out.println("\t--------------------");
						System.out.println("\t***Driver Account***");
						System.out.println("\t--------------------");
						System.out.println("");
						
						status16 = 1;
						
						do {
						
						Scanner input22 = new Scanner(System.in);
						
						String reply22;
						
						System.out.println("");
						System.out.println("---------------------------------------------------------------------");
						System.out.print("Please Select Which Category You Want To View ['New' / 'Exsisiting'] ?:");
						reply22 = input22.nextLine();
						System.out.println("---------------------------------------------------------------------");
						System.out.println("");
						
						switch(reply22) {
						
						case "New":
							
							Account_Informations obj22 = new Account_Informations();
							
							System.out.println("--------------------------------------------");
							System.out.println("***UPCOMING USER ACCOUNT APPROVAL REQUEST***");	
							System.out.println("");
							obj22.driver_user_info();
							System.out.println("--------------------------------------------");
							
							System.out.println("");
							
							do {
								
							
							Scanner input23 = new Scanner(System.in);
							
							String aprv3;
							
							System.out.print("Approve Account ['Yes' / 'No'] ?: ");
							aprv3 = input23.nextLine();
							
							if(aprv3.equalsIgnoreCase("Yes")) {
								
								System.out.println("");
								System.out.println("\t----------------");
								System.out.println("\tAccount Approved");
								System.out.println("\t----------------");
								System.out.println("");
								
								status20 = 1;
							}
							
							else if(aprv3.equalsIgnoreCase("No")) {
								
								System.out.println("");
								System.out.println("\t----------------");
								System.out.println("\tAccount Rejected");
								System.out.println("\t----------------");
								System.out.println("");
								
								status20 = 1;
							}
							
							else if(aprv3 != "Yes" || aprv3 != "No") {
								
								System.out.println("\t-----------------");
								System.out.println("\tInvalid Selection");
								System.out.println("\t-----------------");
								System.out.println("");
								
							}
							
							status19 = 1;
							
							}
							
							while(status20 == 0);
							
						break;
							
						case "Exsisiting":
							
							Account_Informations obj24 = new Account_Informations();
							
							System.out.println("--------------------------");
							System.out.println("***USER RECENT ACTIVITY***");
							System.out.println("");
							obj24.driver_user_after_login_info();
							System.out.println("--------------------------");
						
							System.out.println("");
							
							status19 = 1;
							
							break;
							
						default:
							
							System.out.println("\t-----------------");
							System.out.println("\tInvalid Selection");
							System.out.println("\t-----------------");
							System.out.println("");
						
					}
						
					}
						
						while(status19 == 0);
						
					}
					
					else if(read19 != "General" || read19 != "Driver") {
						
						System.out.println("\t-----------------");
						System.out.println("\tInvalid Selection");
						System.out.println("\t-----------------");
						System.out.println("");
					}
					
					status5 = 1;
					
					}
					
					while(status16 == 0);
					
					break;
				
				default:
					
					System.out.println("\t-----------------");
					System.out.println("\tInvalid Selection");
					System.out.println("\t-----------------");
					System.out.println("");
					
					
					
		}
	}
			
			while(status5 == 0);
			
			
		}
				
			
		else if	(login_response != "General" || login_response != "Driver" || login_response != "Admin") {
			
			System.out.println("\t-----------------");
			System.out.println("\tInvalid Selection");
			System.out.println("\t-----------------");
			System.out.println("");
		
		}
			status = 1;
									
			}
			
			while(status2 == 0);
			
		}

		
		else if(response != "Sign Up" || response != "Sign In") {
			
			System.out.println("\t-----------------");
			System.out.println("\tInvalid Selection");
			System.out.println("\t-----------------");
			System.out.println("");
		}
		
		
		}
		
		while(status == 0);
		
		store.close();
		
		}

		catch(Exception e) {
	
			System.out.println("Error: "+e);
		}	
		
		status21 = 1;
		
		break;
		
		default:
			
			System.out.println("\t-----------------");
			System.out.println("\tInvalid Selection");
			System.out.println("\t-----------------");
			System.out.println("");
			
			
	}
}
		
		while(status21 == 0);
	}
}
		



