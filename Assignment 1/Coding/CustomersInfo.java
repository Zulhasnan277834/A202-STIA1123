package Assignment01;

import java.util.*; //1.2 Pre-defined class
public class CustomersInfo { //1.3 User-defined class

	private String name;
	private int phoneNum;
	private String email;
	
	Scanner s = new Scanner(System.in);
	
	    CustomersInfo() { // 1.4 Constructor with no arguments
	    	
		System.out.println();
	    System.out.println("--------------------Enter Customers Detail--------------------");
	    
		System.out.print("Full Name\t\t:");
		name = s.nextLine();
		
		System.out.print("Phone number(60+)\t:");
		phoneNum = s.nextInt();
		
		s.nextLine();
		System.out.print("Email\t\t\t:");
		email = s.nextLine();
		
	}
	
	public String getName() {
		return name;
	}
	
	public Integer getPhoneNum() {
		return phoneNum;
	}
	public String getEmail() {
		return email;
	}
}
