package Assignment01;

import java.util.*; //1.2 Pre-defined class
public class Main {


	public static void main(String[] args) {
		
	Scanner s = new Scanner(System.in);
		
	storageRental sr = new storageRental();
	
		int choice =0;
		int user = 0;
		
		System.out.println();
		
		System.out.println("Enter your role "
				+ "\n 1.Customers"
				+ "\n 2.Admin");
		System.out.print("-->");
		user = s.nextInt();
		
		if (user == 1) {
			System.out.println("--------------------Fulfill the Customers Infomation--------------------");
			System.out.println();
			CustomersInfo c = new CustomersInfo();
			System.out.println();
			Sales o = new Sales();
			o.Duration();
			System.out.println();
			o.totalPrice();
			System.out.println();
			o.payment();
			System.out.println();
			o.confirmOrder();

	}
		else if (user == 2) {
			
			System.out.println("--------------------Welcome Admin--------------------\n");
			System.out.println("----------(Log In)----------");
			System.out.print("Username\t: ");	
			s.nextLine();
			String login = s.nextLine();
			System.out.print("Password\t: ");
			String password = s.nextLine();
			String position = "Manager";
			
			
			if ((login.equals("zulhasnan")) && (password.equals("abc123"))) {
				
				System.out.println();
				System.out.println("**Log in successfull**");
				
				System.out.println("#Admin\t\t: " + login);
				System.out.println("#Position\t: " + position);
				
				
				
				do {
					System.out.print("\n 1. Employee information"
							+ "\n 2. Finance"
							+ "\n 3. Inventory"
							+ "\n 0. exit"
							+ "\n-->");
					
					choice = s.nextInt();
					if (choice == 1) {
					EmployeeInfo e = new EmployeeInfo();
					}
					
					if (choice == 2) {
					Finance f = new Finance();
					f.calcProfit();
					System.out.println();
					f.financeRecord();
					}
					
					if (choice == 3) {
					Inventory i = new Inventory(300);
					i.calcStorage();
					System.out.println();
					i.StorageStock();
					}
					
					if (choice >=4) {
					System.out.println("Invalid number!!!!");
					}
					if (choice == 0) {
						System.out.println("Exiting.........");
						System.exit(0);
					}
					System.out.println();
					System.out.println("Choose again or press 0 to exit");
				}while(choice != -1);
			
			
		}
			else {
				System.out.println();
				System.out.println("Wrong username or password, Try again");
				System.out.println("\nExiting..............");
			}
	    
		}
	}
}
