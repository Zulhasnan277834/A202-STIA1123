
public class Lemon extends Fruit{//Lemon is a sub-class or extends from Fruit class

	public Lemon (String name, double weight, double price ) {
		super(name);
		this.weigh = weight;
		this.price = price;
		System.out.println("Weight:" + this.weigh + "");
		System.out.println("Average Price: RM" + this.price);
		
	}
}
