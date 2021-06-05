package Assignment01;

import java.util.Scanner;

public abstract class CompanyInfo { // 2.4 Abstaction

Scanner s = new Scanner(System.in);
	
	private String name;
	private String contact;
	private String email;
	private String location;
	

	CompanyInfo(){

		setName("Mystorage");
		setContact("8582088");
		setEmail("storageRS@gmail.com");
		setLocation("Kemaman,Terengganu");
	}
	
	//setter
	public void setName(String name) {   //2.3 Encapsulation (setter)
		this.name = name;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	//getter
	public String getName() { //2.3 Encapsulation (getter)
		return name;
	}
	public String getContact() {
		return contact;
	}
	public String getMail() {
		return email;
	}
	public String getLocation() {
		return location;
	}
	
	
	public abstract void printInfo(); 
		
	
}
