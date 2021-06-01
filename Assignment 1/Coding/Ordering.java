package Assignment01;

import java.util.*;
public class Ordering { //1.3 User-defined class

	int choose = 0 ;
	int price;
	int Duration = 0;
	double tp;
	
	Scanner s = new Scanner(System.in);
	
	 Ordering() { // 1.4 Constructor with one arguments
		
		System.out.print("Choose a storage unit you want to rent"
				+ "\n 1.Small Storage"
				+ "\n 2.Medium Storage"
				+ "\n 3.Large Storage"
				+ "\n Your choice? :");
		choose = s.nextInt();

		if (choose == 1) {
			this.price = 100;
		}
		else if (choose == 2) {
			this.price = 150;
		}
		else if (choose == 3) {
			this.price = 200;
		}
		
		switch (choose) {
		
		case 1:
			System.out.println("You choose Small Storage unit"
					+ "\nPrice per month: RM" + this.price);
					
			break;
		case 2:
			System.out.println("You choose Medium Storage unit"
					+ "\nPrice per month: RM" + this.price);
					
			break;
		case 3:
			System.out.println("You choose Medium Storage unit"
					+ "\nPrice per month: RM" + this.price); 
					
			break;
			default:
				System.out.println("Invalid number");
					
		}
}
	 public void Duration () {
			
			System.out.print("Enter your rental duration (month):");
			Duration = s.nextInt();
			
		}
		public void totalPrice() {
			
			tp = this.price*Duration;
			
		}
		
		public void Receipt() {
			
			System.out.println("============================================================");
			System.out.println("************************Order Detail************************");
			System.out.println("Total Price \t\t: RM" + tp);
			System.out.println("Rental Duration \t: " + Duration);
			System.out.println();
			System.out.println("*************Thank You for choosing our services************");
			System.out.println("============================================================");
		}
	}
