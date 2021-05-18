
public class Orange extends Fruits {

	private int quantity;
	private double price; 
	private double weight;
	private double dissrate;
	
	//Constructor 
	public Orange (String name, double weight, double price, int quantity) {
		
		super(name);
		
		this.weight = weight;
		this.price = price;
		this.quantity = quantity;
		
		if (this.weight < 0.9) {
			totalPrice(); 
			System.out.println("Weight: <0.9g");
			System.out.printf("Price: RM %.2f" , totalPrice());
			System.out.println();
		}
		else if (this.weight > 0.9 && this.weight < 1.5) {
			double p = 0.80;
			totalPrice(p); 
			System.out.println("Weight:>0.9g <1.5g");
			System.out.printf("Price: RM %.2f" , totalPrice(p));
			System.out.println();
		}
		else {
			double p = 1.00;
			OrangeDiscount diss = new OrangeDiscount();
			dissrate = diss.DiscountRate();
			totalPrice(p,dissrate); 
			System.out.println("Weight:>1.5g");
			System.out.println("You got 15% discount");
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
		return ("Weight: " + this.weight +"g" 
	+ "\nQuantity: " + this.quantity);
	}

	
	}

	

	


