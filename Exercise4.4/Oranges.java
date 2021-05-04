
public class Oranges extends Fruit{//Oranges is a sub-class or extends from Fruit class

	private int quantity;
	private double price; 
	private double weight;
	private double diss;
	
	//Constructor 
	public Oranges (String name, double weight, double price, int quantity) {
		
		super(name);
		
		this.weight = weight;
		this.price = price;
		this.quantity = quantity;
		
		if (this.weight < 0.9) {
			calPrice(); //overloading no argument
			System.out.println("Weight: <0.9g");
			System.out.printf("Price: RM %.2f" , calPrice());
			System.out.println();
		}
		else if (this.weight > 0.9 && this.weight < 1.5) {
			double p = 0.80;
			calPrice(p); //overloading 1 argument
			System.out.println("Weight:>0.9g <1.5g");
			System.out.printf("Price: RM %.2f" , calPrice(p));
			System.out.println();
		}
		else {
			double p = 1.00;
			diss = 0.1;
			calPrice(p,diss); //overloading 2 argument
			System.out.println("Weight:>1.5g");
			System.out.println("You got 10% discount");
			System.out.printf("Price: RM %.2f" , calPrice(p,diss));
			System.out.println();
			
		}
	}

	public double calPrice() {  
		return this.price*this.quantity;
	}
	
	public double calPrice(double p) {
		return p*this.quantity;
	}
	public double calPrice (double p, double diss) {
		double pp = p*this.quantity;
		double qq = pp*diss;
		return pp-diss;
	}
	
	
	//getter
	public Double getPrice() {
		return this.price;
	}
	public Double getWeight() {
		return this.weight;
	}
	public Integer getQuantity() {
		return this.quantity;
	}
	
	
	//overriding
	public String toString() {
		return ("Weight: " + this.weight +"g" 
	+ "\nQuantity: " + this.quantity);
	}
}
