
public class Orange extends Fruits implements DiscountInterface {

	private int quantity;
	private double price; 
	private double weight;
	private double diss;
	
	//Constructor 
	public Orange (String name, double weight, double price, int quantity) {
		
		super(name);
		
		this.weight = weight;
		this.price = price;
		this.quantity = quantity;
		
		if (this.weight < 0.9) {
			totalPrice(); //overloading no argument
			System.out.println("Weight: <0.9g");
			System.out.printf("Price: RM %.2f" , totalPrice());
			System.out.println();
		}
		else if (this.weight > 0.9 && this.weight < 1.5) {
			double p = 0.80;
			totalPrice(p); //overloading 1 argument
			System.out.println("Weight:>0.9g <1.5g");
			System.out.printf("Price: RM %.2f" , totalPrice(p));
			System.out.println();
		}
		else {
			double p = 1.00;
			int q = 100;
			totalPrice(p,q); //overloading 2 argument
			System.out.println("Weight:>1.5g");
			System.out.println("You got 15% discount");
			System.out.printf("Price: RM %.2f" , totalPrice(p,q));
			System.out.println();
			
		}
	}

	public double totalPrice() {  
		return this.price*this.quantity;
	}
	
	public double totalPrice(double p) {
		return p*this.quantity;
	}
	public double totalPrice (double p, double q) {
		double pp = p*q;
		double qq =DiscountRate()*pp;
		return pp-qq;
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

	@Override
	public double DiscountRate() { // implement from DiscountInterface
		return 0.15;
	}

	}
	

	


