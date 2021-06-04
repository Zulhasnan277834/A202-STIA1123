package Assignment01;

import java.util.*;
import java.util.jar.Attributes.Name;
public class storageRental { //1.3 User-defined class

	Scanner s = new Scanner(System.in);
	
	private String name;
	private String contact;
	private String email;
	private String location;
	
	
	storageRental(String n, String c){ // 1.4 Constructor with two arguments
		
		this.name = n;
		this.contact = c;
		this.email = "storageRE@gmail.com";
		this.location = "Kemaman, Terengganu";
		
	
		System.out.println("***************-Welcome to Storage Rental Service-*********************"
				+ "\nOur company provide a service to rent a storage to store your belonging."
				+ "\nFor more information:"
				+ "\nCompany name\t\t\t:" + this.name
				+ "\nContact us\t\t\t:" + this.contact
				+ "\nEmail\t\t\t\t:" + this.email
				+ "\nVisit our main company\t\t:" + this.location);

	}
	
	public String getName() {
		return this.name;
	}
	public String getContact() {
		return this.contact;
	}
	public String getMail() {
		return this.email;
	}
	public String getLocation() {
		return this.location;
	}
	
}