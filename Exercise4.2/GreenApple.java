
public class GreenApple extends Apple{//RedApple is a subclasses or extends from Apple class

	public GreenApple (String name, String taste, double price) {
		super(name,price);
		this.taste = taste;
		System.out.println("Green apple taste is Sweet and Sour");
}
}
