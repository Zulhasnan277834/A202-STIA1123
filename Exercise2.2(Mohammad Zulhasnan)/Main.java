
public class Main {

	public static void main(String[] args) {
		
		Smartphone Apple = new Smartphone(); //create first object smartphone1
		Apple.printSmartphone("Iphone12 Pro Max", "Pacific Blue", "IOS", 128, 5.1);
		Apple.calculateRam(7473.0, 4783.0);
		Apple.calculateStorage(128.00, 64.78);
		Apple.devOption(false);
		
		System.out.println();
		
		Smartphone Xiaomi = new Smartphone(); //create second object smartphone2
		Xiaomi.printSmartphone("Mi 10T Pro", "Grey", "Android", 256, 5.1);
		Xiaomi.calculateRam(7473.0, 4850.0);
		Xiaomi.calculateStorage(256.00, 156.47);
		Xiaomi.devOption(true);
	
		
		

	}

}
