
public class Cat {

	String catType;
	String color;
	String origin;
	String personality;
	double avgPrice;
	
	//creating setter
	
	public void setCatType(String catType) {
		this.catType = catType;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public void setPersona(String personality) {
		this.personality = personality;
	}
	public void setAvgPrice(double avgPrice) {
		this.avgPrice = avgPrice;
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
