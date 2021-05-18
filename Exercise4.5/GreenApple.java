
public class GreenApple extends Apple {
	

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
				"\nQuantity: " + this.getQuantity() +
				"\nCalories: " + this.calories);
	}

}
