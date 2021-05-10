
public class Apple extends Fruits  {
	
	private double price;
	private int quantity;

	public Apple (String name, double price, int quantity) { //constructor
		
		super(name);
		this.quantity= quantity;
		this.price = price;
		
		if (this.quantity < 10) {
			totalPrice(); //overloading no argument
			System.out.println("Quantity: < 10, Total price: RM" + totalPrice());
		}
		else if (this.quantity > 10 && this.quantity < 100) {
			double p = 1.30;
			totalPrice(p); //overloading 1 argument
			System.out.println("Quantity: >10 <100, Total price: RM" + totalPrice(p));
		}
		else {
			double p = 0.99;
			int q = 100;
			totalPrice(q,p); //overloading 2 argument
			System.out.println("Quantity: > 100, Total price: RM" + totalPrice(q,p));
		}
	}

	public double getPrice() {
		return this.price;
	}
	public Integer getQuantity() {
		return this.quantity;
	}
	
	
	public double totalPrice() {
		return this.price*this.quantity;
	}
	
	public double totalPrice(double p) {
		return p*this.quantity;
	}
	
	public double totalPrice(int q, double p) {
		return p*q;
	}
	public String toString() {
		return ("Quantity: " + this.quantity);
	}
}
