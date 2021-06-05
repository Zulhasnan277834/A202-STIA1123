package Assignment01;

import java.util.*; //1.2 Pre-defined class
public abstract class CustomersRegistration extends CompanyInfo{  // 2.4 Abstaction

	private String name;
	private int phoneNum;
	private String email;
	
	Scanner s = new Scanner(System.in);
	
	    CustomersRegistration() { // 1.4 Constructor with no arguments
	    	
	    	System.out.println(
		    		"\nOur company provide a service to rent a storage to store your belonging."
		    		+ "\nFor more information:"
		    		+ "\nCompany name\t\t\t:" + super.getName()
		    		+ "\nContact us\t\t\t:" + getContact()
		    		+ "\nEmail\t\t\t\t:" + getMail()
		    		+ "\nVisit our main company\t\t:" + getLocation());
	    
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
	
	public abstract void printInfo() ; //2.2 Polymorphism
		
}
