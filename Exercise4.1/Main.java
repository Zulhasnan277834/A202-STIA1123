
public class Main {

	public static void main(String[] args) {
		
		Converse x = new Converse();
		System.out.println();
		System.out.println("Size:" + x.getSize());
		System.out.println("Colour:" + x.getColor());
		System.out.println("Material:" + x.getMaterial());
		System.out.println("Price: RM" + x.getPrice());
		System.out.println("Quantity:" + x.getQuantity());
		System.out.println("Total Price:RM" + x.getTotal());
		System.out.println("Brand:" + x.getBrand());
		System.out.println("Model:" + x.getModel());
		System.out.println("Discount:RM " + x.calDiscount());
		System.out.println("Price after discount: RM" + x.afterDiss());
		
		System.out.println();
		
		Polo y = new Polo();
		System.out.println();
		System.out.println("Size:" + y.getSize());
		System.out.println("Colour:" + y.getColor());
		System.out.println("Material:" + y.getMaterial());
		System.out.println("Price: RM" + y.getPrice());
		System.out.println("Quantity:" + y.getQuantity());
		System.out.println("Total Price:RM" + y.getTotal());
		System.out.println("Brand:" + y.getBrand());
		System.out.println("Model:" + y.getModel());
		System.out.println("Discount:RM " + y.calDiscount());
		System.out.println("Price after discount: RM" + y.afterDiss());
		
	}

}
