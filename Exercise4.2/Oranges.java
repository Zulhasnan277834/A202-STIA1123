
public class Oranges extends Fruit{//Oranges is a sub-class or extends from Fruit class

	public Oranges (String name, double weight, double price) {
		super(name);
		this.weigh = weight;
		this.price = price;
		System.out.println("Weight:" + this.weigh + "g");
		System.out.println("Average Price: RM" + this.price);
		
	}
}
