
public class Lemon extends Fruit{//Lemon is a sub-class or extends from Fruit class

	private double weight; 
	private double price;
	
	//Constructor 
	public Lemon (String name, double weight, double price ) {
		
		super(name);
		
		this.weight = weight;
		this.price = price;
		
	}
	//method for overloading
		public void calPrice() { //overloading method without parameter
			System.out.println("The price is fix: RM" + this.price);
		}
		public double calPrice(double diss) { //overloading method with 1 parameter
			diss = (diss/100)*price;
			return diss;	
		}
		public double calPrice(double diss, double afterDiss) { //overloading method with 2 parameter
			diss = (diss/100)*price;
			afterDiss = price-diss;
			return afterDiss;		
		}
		
	
	//getter
	public Double getPrice() {
		return this.price;
	}
	public Double getWeight() {
		return this.weight;
		
		
	}
	//overriding
	public String toString() {
		return ("Weight: " + weight + "g"
	             + "\nAverage Price: RM" +  price);
	}
}
