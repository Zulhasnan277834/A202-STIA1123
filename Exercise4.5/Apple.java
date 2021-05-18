
public class Apple extends Fruits  {
	
	private double price;
	private int quantity;
	private double dissrate;

	public Apple (String name, double price, int quantity) { //constructor
		
		super(name);
		this.quantity= quantity;
		this.price = price;
		
		if (this.quantity < 10) {
			totalPrice(); 
			System.out.println("Quantity: < 10, Total price: RM" + totalPrice());
		}
		else if (this.quantity > 10 && this.quantity < 100) {
			double p = 1.30;
			totalPrice(p); 
			System.out.println("Quantity: >10 <100, Total price: RM" + totalPrice(p));
		}
		else {
			double p = 0.99;
			AppleDiscount diss = new AppleDiscount();
			dissrate = diss.DiscountRate();
			totalPrice(dissrate,p); 
			System.out.println("You bought more than 100, you got 10% Discount");
			System.out.println("Quantity: > 100, Total price: RM" + totalPrice(dissrate,p));
			
			
		}
	}

	public double getPrice() {
		return this.price;
	}
	public Integer getQuantity() {
		return this.quantity;
	}
	
	
	public double totalPrice() { //overloading no argument
		return this.price*this.quantity;
	}
	
	public double totalPrice(double p) { //overloading 1 argument
		return p*this.quantity;
	}
	
	public double totalPrice(double dissrate, double p) { //overloading 2 argument
		double pp = p*this.quantity;
		double qq = dissrate*pp;
		return pp-qq;
	}
	public String toString() {
		return ("Quantity: " + this.quantity);
	}
}
