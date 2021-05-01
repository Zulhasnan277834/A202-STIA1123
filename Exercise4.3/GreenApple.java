
public class GreenApple extends Apple{//RedApple is a subclasses or extends from Apple class

	private String taste;
	
	public GreenApple (String name, String taste, double price) {
		
		super(name,price);
		
		this.taste = taste;
}
	public String getTaste() {
		return this.taste;
	}
	
	//overriding
	public String toString() {
		return ("Green Apple taste is :" + this.taste);
	}
}

