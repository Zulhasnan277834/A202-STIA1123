package Assignment01;

import java.util.*;
import java.util.jar.Attributes.Name;
public class storageRental { //1.3 User-defined class

	Scanner s = new Scanner(System.in);
	
	private String name;
	private int contact;
	private String email;
	private String location;
	
	
	storageRental(){ // 1.4 Constructor with no arguments
		
		this.name = "My Storage";
		this.contact = 8582088;
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
	public int getContact() {
		return this.contact;
	}
	public String getMail() {
		return this.email;
	}
	public String getLocation() {
		return this.location;
	}
	
}