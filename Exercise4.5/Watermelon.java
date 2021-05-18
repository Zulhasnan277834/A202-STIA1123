
public class Watermelon extends Fruits {

	private int quantity;
	private double price; 
	private double weight;
	private double dissrate;
	
	//Constructor 
	public Watermelon (String name, double weight, double price, int quantity) {
		
		super(name);
		
		this.weight = weight;
		this.price = price;
		this.quantity = quantity;
		
		if (this.weight < 9) {
			totalPrice(); 
			System.out.println("Weight: <9kg");
			System.out.printf("Price: RM %.2f" , totalPrice());
			System.out.println();
		}
		else if (this.weight > 9 && this.weight < 15) {
			double p = 18.99;
			totalPrice(p); 
			System.out.println("Weight:>9kg <15kg");
			System.out.printf("Price: RM %.2f" , totalPrice(p));
			System.out.println();
		}
		else {
			double p = 20.00;
			WatermelonDiscount diss = new WatermelonDiscount();
			dissrate = diss.DiscountRate();
			totalPrice(p,dissrate); 
			System.out.println("Weight:>15kg");
			System.out.println("You got 20% discount");
			System.out.printf("Price: RM %.2f" , totalPrice(p,dissrate));
			System.out.println();
			
		}
	}

	public double totalPrice() {  //overloading no argument
		return this.price*this.quantity;
	}
	
	public double totalPrice(double p) { //overloading 1 argument
		return p*this.quantity;
	}
	public double totalPrice (double p, double dissrate) { //overloading 2 argument
		double pp = p*this.quantity;
		double qq = dissrate*pp;
		return pp-qq;
	}
	
	//overriding
	public String toString() {
		return ("Weight: " + this.weight +"kg" 
	+ "\nQuantity: " + this.quantity);
	}

	
	}

