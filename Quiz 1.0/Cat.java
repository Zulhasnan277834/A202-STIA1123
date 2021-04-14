import java.util.*;
public class Cat {

	String catType;
	String color;
	String origin;
	String personality;
	double avgPrice;
	
	Scanner s = new Scanner(System.in);
	
	//creating setter
	
	public void setCatType() {
		System.out.println("Enter Cat Type:");
		this.catType =s.nextLine();
	}
	public void setColor() {
		System.out.println("Enter Color:");
		this.color = s.nextLine();
	}
	public void setOrigin() {
		System.out.println("Enter Nasional of Origin:");
		this.origin = s.nextLine();
	}
	public void setPersona() {
		System.out.println("Enter Cat Personality");
		this.personality = s.nextLine();
	}
	public void setAvgPrice() {
		System.out.println("Enter Cat Average Price:");
		this.avgPrice = s.nextDouble();
	}
	
	//creating getter
	
	public String getCatType(){
		return this.catType;
		
	}
	public String getColor() {
		return this.color;
	}
	public String getOrigin() {
		return this.origin;
	}
	public String getPersona() {
		return this.personality;
	}
	public Double getAvgPrice() {
		return this.avgPrice;
	}
	
	
}
