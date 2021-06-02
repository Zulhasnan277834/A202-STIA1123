package Assignment01;

import java.util.*; //1.2 Pre-defined class
public class CustomersInfo { //1.3 User-defined class

	private String name;
	private int ic;
	private int phoneNum;
	private String location;
	private int postcode;
	
	Scanner s = new Scanner(System.in);
	
	    CustomersInfo() { // 1.4 Constructor with no arguments
	    	
		System.out.println();
	    System.out.println("----------Enter Customers Detail------------");
	    
		System.out.print("Full Name: ");
		name = s.nextLine();
		
		System.out.print("Ic number: ");
		ic = s.nextInt();
		
		System.out.print("Phone number(60+): ");
		phoneNum = s.nextInt();
		
		s.nextLine();
		System.out.print("Current Location: ");
		location = s.nextLine();
		
		System.out.print("Postcode: ");
		postcode = s.nextInt();
	}
	
	public String getName() {
		return name;
	}
	
	public Integer getIC() {
		return ic;
	}
	public Integer getPhoneNum() {
		return phoneNum;
	}
	public String getLocation() {
		return location;
	}
	public Integer getPostcode() {
		return postcode;
	}
}
