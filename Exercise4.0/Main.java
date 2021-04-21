
public class Main {

	public static void main(String[] args) {
		
		Shoes shoes1 = new Shoes();
		Discount shoes = new Discount();
		
		System.out.println("Price \t\t:RM" + shoes1.getPrice());
		System.out.println("Quantity \t:" + shoes1.getQuantity());
		System.out.println("Total price \t:RM" + shoes1.Total());
		
		System.out.println("Discount: RM" + shoes.calDisc());
		System.out.println("Price after discount: RM" + shoes.getAfterDisc());
		
		
		
		

	}

}
