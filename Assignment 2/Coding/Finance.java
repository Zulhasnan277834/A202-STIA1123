package Assignment01;

import java.util.*;
public class Finance extends CompanyInfo implements Payment{ // 2.1 extends from CompanyInfo 
	                                                         // 2.5 Implements 

		Scanner s = new Scanner(System.in);
		
		private double totalSales;
		private double totalSpend;
		private double profit;
		private String month;
		
		
		Finance() { // 1.4 Constructor with no arguments
			System.out.println("--------------------Finance--------------------");
			
			System.out.print("Enter financial month: ");	
			this.month = s.nextLine();
			
			System.out.print("Enter total sales\t\t:RM");
			this.totalSales = s.nextDouble();
			System.out.print("Enter total expenses\t\t:RM");
			this.totalSpend = s.nextDouble();
			
		
		}
		public double getPayment() {
			return profit = this.totalSales - this.totalSpend;
		}
	
		public void printInfo() { // 2.2 Polymorphism
			System.out.println("----------Financial Statement----------"
					+ "\nMonth\t\t\t:" + "(" + this.month + ")"
					+ "\nTotal Sales \t\t:RM" + this.totalSales
					+ "\nTotal Expenses \t\t:RM" + this.totalSpend
					+ "\nProfit \t\t\t:RM" + profit);
		}
		
}
