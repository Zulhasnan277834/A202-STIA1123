
public class Main {

	public static void main(String[] args) {
	
		Apple a = new Apple("Apple", 1.60, 90);
		System.out.println(a);
		System.out.println();
		
		GreenApple g = new GreenApple ("Green Apple", "Sweet and Sour", 2.25, 50, 98);
		System.out.println(g);
		System.out.println();
		
		Orange o = new Orange("Orange", 1.7, 0.69, 100);
		System.out.println(o);
		System.out.println();
		
		Watermelon w = new Watermelon("Watermelon",16, 15.3, 100 );
		System.out.println(w);
	}

}
