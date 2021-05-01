
public class Main {

	public static void main(String[] args) {
		
		Apple a = new Apple("Apple", 1.59);
		System.out.println(a);
		System.out.println();
		
		RedApple r = new RedApple("Red Apple","Sweet",1.59);
		System.out.println(r);
		System.out.println();
		
		GreenApple g = new GreenApple ("Green Apple", "Sweet and Sour", 2.25);
		System.out.println(g);
		System.out.println();
		
		Oranges o = new Oranges("Orange", 0.88, 5.69);
		System.out.println(o);
		o.calPrice();
		System.out.println("10% discount: RM" + o.calPrice(10));
		System.out.println("Price after 10% discount: %.2f RM" + o.calPrice(10,5.69));
		
		System.out.println();
		
		Lemon l = new Lemon("Lemon", 0.58, 6.99);
		System.out.println(l);
		l.calPrice();
		System.out.println("10% discount: RM" + l.calPrice(10));
		System.out.println("Price after 10% discount: RM" + l.calPrice(10,6.99));
		System.out.println();
		

	}

}
