package Assignment01;

import java.util.*;
public class Sales extends CustomersRegistration implements Payment{ // 2.1 extends from CustomersRegistration
	                                                                 // 2.5 Implements
	
	private int choose = 0 ;
	private int price;
	private int Duration = 0;
	private double tp;
	private double payment;
	private double balance;
	boolean storage = true;
	
	Scanner s = new Scanner(System.in);
	
	 Sales() { // 1.4 Constructor with no arguments

		System.out.print("--------------------Choose a storage unit you want to rent--------------------"
				+ "\n 1.Small Storage \t :RM 125"
				+ "\n 2.Medium Storage \t :RM 155"
				+ "\n 3.Large Storage \t :RM 200"
				+ "\n --> :");
		choose = s.nextInt();

		if (choose == 1) {
			this.price = 125;
		}
		else if (choose == 2) {
			this.price = 155;
		}
		else if (choose == 3) {
			this.price = 200;
		}
		
		System.out.println();
		System.out.println("--------------------Storage Detail--------------------");
		
		switch (choose) {
		
		case 1:
			System.out.println("\t(You choose Small Storage unit)\n"
		
					+ "\n\tA 5x10 storage unit can hold about a dorm room worth of items"
					
					+ "\n\tPrice per month\t: RM" + this.price
					+ "\n\tSize\t\t: 5x10 (foot)"
					+ "\n\tMaterial\t: Block and Steel"
					);
			break;
		case 2:
			System.out.println("\t(You choose Medium Storage unit)\n"
					
					+ "\n\tA 10x10 storage unit can hold about a 1-2 bedroom apartment worth of item"
					
					+ "\n\tPrice per month\t: RM" + this.price
					+ "\n\tSize\t\t: 10x10 (foot)"
					+ "\n\tMaterial\t: Block and Steel"
					);
			break;
		case 3:
			System.out.println("\t(You choose Medium Storage unit)\n"
					
					+ "\n\tA 10x20 storage unit can hold about a 2-3 bedroom house worth of item"
					
					+ "\n\tPrice per month\t: RM" + this.price
					+ "\n\tSize\t\t: 10x20 (foot)"
					+ "\n\tMaterial\t: Concrete and Steel"); 
			break;
			default:
		}
}
	 public void Duration () {
			
		 System.out.println();
		 System.out.println("--------------------Rental Duration--------------------");
		 
		System.out.print("Enter your rental duration (month):");
		Duration = s.nextInt();
			
		}
		public void totalPrice() {
			
			tp = this.price*Duration;
			System.out.println("Price per month\t: RM" + this.price);
			System.out.println("Rental Duration\t: " + Duration + " Month" );
			System.out.println("Total Price\t: RM" + tp);
			
			
		}
		
		public double getPayment() {
			
			System.out.println("----------Payment----------");
			System.out.print("Enter Payment: RM");
			payment = s.nextDouble();
			
			balance = payment-tp;
			return balance;
		}
		
		public void printInfo() { //2.2 Polymorphism
			
			boolean confirm = true;
			
			System.out.println("--------------------Order Detail--------------------");
			System.out.println("Customer Name \t\t: " + super.getName()); // data get from CustomersInfo class
			System.out.println("Phone Number \t\t: " + super.getPhoneNum()); // data get from CustomersInfo class
			System.out.println("Email \t\t\t: " + super.getEmail()); // data get from CustomersInfo class
			System.out.println("Total Price \t\t: RM" + tp);
			System.out.println("Rental Duration \t: " + Duration + " Month");
			System.out.println("Payment\t\t\t: RM" + payment);
			System.out.println("Change\t\t\t: RM" + balance);
			System.out.println();
			System.out.println("============================================================");
			
			while (confirm) {
				
				int choice = 0;
			
				System.out.println("Press 1 to confirm your"
						+ "\nPress 2 to cancel order");
				System.out.print("-->");
				choice = s.nextInt();
				
				switch (choice) {
				
				case 1:
					System.out.println("-Order Completed!!-"
							+ " \nThank you for using our service"
							+ " \nAny inconvenience? Contact us: 8582088");
					confirm = false;
					break;
				
				case 2:
					System.out.println("-Order Canceled-");
					System.out.println("Exiting.............");
					confirm = false;
					break;
				default:
					System.out.println("Invalid number. Try again");
				}
			
			}
		}
		
	}
