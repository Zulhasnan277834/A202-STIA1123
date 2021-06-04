package Assignment01;

import java.util.*;
public class Finance { //1.3 User-defined class

		Scanner s = new Scanner(System.in);
		
		private double totalSales;
		private double totalSpend;
		private double profit;
		private String month;
		
		
		Finance() { // 1.4 Constructor with two arguments
			System.out.println("--------------------Finance--------------------");
			
			System.out.print("Enter financial month: ");	
			this.month = s.nextLine();
			
			System.out.print("Enter total sales\t\t:RM");
			this.totalSales = s.nextDouble();
			System.out.print("Enter total expenses\t\t:RM");
			this.totalSpend = s.nextDouble();
			
		
		}
		public double calcProfit() {
			return profit = this.totalSales - this.totalSpend;
		}
	
		public void financeRecord() {
			System.out.println("----------Financial Statement----------"
					+ "\nMonth\t\t\t:" + "(" + this.month + ")"
					+ "\nTotal Sales \t\t:RM" + this.totalSales
					+ "\nTotal Expenses \t\t:RM" + this.totalSpend
					+ "\nProfit \t\t\t:RM" + profit);
		}
}
