
public class Lemon extends Fruit{//Lemon is a sub-class or extends from Fruit class

	double weight;
	double price;
	
	public Lemon (String name, double weight, double price ) {
		super(name);
		this.weight = weight;
		this.price = price;
		System.out.println("Weight:" + this.weight + "");
		System.out.println("Average Price: RM" + this.price);
		
	}
}
