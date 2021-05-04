
public class GreenApple extends Apple{//RedApple is a subclasses or extends from Apple class

	private String taste;
	private int calories;
	
	public GreenApple (String name, String taste, double price, int quantity, int calories) {
		
		super(name,price,quantity);
		this.taste = taste;
		this.calories = calories;
}
	public String getTaste() {
		return this.taste;
	}
	public Integer getCalories() {
		return this.calories;
	}
	
	//overriding
	public String toString() {
		return ("Green Apple taste is :" + this.taste + 
				"\nCalories: " + this.calories);
	}
}

