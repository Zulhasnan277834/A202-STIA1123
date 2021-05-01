
public class RedApple extends Apple {//RedApple is a sub-class or extends from Apple class
	
	private String taste;
	
	public RedApple (String name, String taste, double price) {
		
		super(name,price);
		
		this.taste = taste;
	}
	public String getTaste() {
		return this.taste;
	}

	
	//overriding
	public String toString() {
		return ("Red Apple taste is :" + this.taste);
		
	}
}
