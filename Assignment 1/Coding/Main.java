package Assignment01;

import java.util.*; //1.2 Pre-defined class
public class Main {


	public static void main(String[] args) {
		
	Scanner s = new Scanner(System.in);
		
	storageRental sr = new storageRental();
	
		int choice =0;
		int user = 0;
		
		user = s.nextInt();
		
		if (user == 1) {
			
			
			Advertisment a = new Advertisment(8582088);
			System.out.println("--------------------Fulfill the Customers Infomation----------------------");
			CustomersInfo c = new CustomersInfo();
			ProductDesc p = new ProductDesc();
			
			Ordering o = new Ordering();
			o.Duration();
			o.totalPrice();
			o.Receipt();

	}
		else if (user == 2) {
			
			System.out.println("--------------Welcome Admin-----------------"
					+ "\n 1. Employee information"
					+ "\n 2. Finance");
			
			choice = s.nextInt();
			switch (choice) {
			
			case 1:
				EmployeeInfo e = new EmployeeInfo();
				break;
			case 2:
				Finance f = new Finance(2500000, 1700000);
				f.calcProfit();
				f.financeRecord();
			}
		}
	}
}
