
public class Main {

	public static void main(String[] args) {
		
		Shoes shoes1 = new Shoes();
		System.out.println("Price \t\t:RM" + shoes1.getPrice());
		System.out.println("Quantity \t:" + shoes1.getQuantity());
		System.out.println("Total price \t:RM" + shoes1.getTotal());
		System.out.println();
		
		
		Converse lowcut = new Converse();
		System.out.println("Discount \t\t:RM" + lowcut.getDisc());
		System.out.println("Price after discount \t:RM" + lowcut.getAfterDisc());
	
		

	}

}
