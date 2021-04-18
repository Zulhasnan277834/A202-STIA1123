
public class Main {

	public static void main(String[] args) {
		
		Shoes shoes1 = new Shoes();
		
		System.out.println();
		System.out.println("Brand: " + shoes1.Brand);
		System.out.println("Shoes Type:" + shoes1.ShoesType);
		System.out.println("Color:" + shoes1.Color);
		System.out.println("Made In:" + shoes1.MadeIn);
		System.out.println("Material:" + shoes1.Material);
		System.out.println("Price:RM" + shoes1.Price);
		System.out.println("Quantity:" + shoes1.Quantity);
		System.out.println("Total Price: RM" + shoes1.TotalPrice);
		
		System.out.println();
		
		Shoes shoes2 = new Shoes("Polo", 2, "Brown", "German", "Leather", 200, 2, 400);
		
		System.out.println();
		System.out.println("Brand: " + shoes2.Brand);
		System.out.println("Shoes Type:" + shoes2.ShoesType);
		System.out.println("Color:" + shoes2.Color);
		System.out.println("Made In:" + shoes2.MadeIn);
		System.out.println("Material:" + shoes2.Material);
		System.out.println("Price:" + shoes2.Price);
		System.out.println("Quantity:" + shoes2.Quantity);
		System.out.println("Total Price: RM" + shoes2.TotalPrice);
		
		

	}

}
