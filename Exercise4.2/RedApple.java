
public class RedApple extends Apple {//RedApple is a sub-class or extends from Apple class
	
	public RedApple (String name, String taste, double price) {
		super(name,price);
		this.taste = taste;
		System.out.println("Red apple taste is sweet");
	}

}
