
public class Oranges extends Fruit{//Oranges is a sub-class or extends from Fruit class

	double price;
	double weight;
	
	public Oranges (String name, double weight, double price) {
		super(name);
		this.weight = weight;
		this.price = price;
		System.out.println("Weight:" + this.weight + "g");
		System.out.println("Average Price: RM" + this.price);
		
	}
}
