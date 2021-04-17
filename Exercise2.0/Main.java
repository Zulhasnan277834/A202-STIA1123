
public class Main {

	public static void main(String[] args) {
		
		Smartphone smartphone1 = new Smartphone();
		smartphone1.Brand = "Apple";
		smartphone1.Color = "Pacific Blue";
		smartphone1.OS = "IOS";
		
		Smartphone smartphone2 = new Smartphone();
		smartphone2.Brand = "Xiaomi";
		smartphone2.Color = "Grey";
		smartphone2.OS = "Android";
		
		System.out.println("Smartphone1");
		System.out.println("Brand:" + smartphone1.Brand);
		System.out.println("Color:" + smartphone1.Color);
		System.out.println("OS:" + smartphone1.OS);
		
		System.out.println();
		
		System.out.println("Function:");
		smartphone1.Behavior();
		
		System.out.println();
		
		System.out.println("Smartphone2");
		System.out.println("Brand:" + smartphone2.Brand);
		System.out.println("Color:" + smartphone2.Color);
		System.out.println("OS:" + smartphone2.OS);
		System.out.println();
		
		System.out.println("Function:");
		smartphone2.Behavior();
		

	}

}
