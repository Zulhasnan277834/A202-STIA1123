
public class Apple extends Fruit{//Apple is a sub-class or extends from Fruit class

	private double price;
	
	public Apple (String name, double price) {
		
		super(name);
		
		this.price = price;
}
	public Double getPrice() {
		return this.price;	
	}
	
	//overriding
	public String toString() {
		return ("Apple price is :RM" + this.price);
	}
}
