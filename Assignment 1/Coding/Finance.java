package Assignment01;

import java.util.*;
public class Finance { //1.3 User-defined class

		Scanner s = new Scanner(System.in);
		
		private double totalSales;
		private double totalSpend;
		private double profit;
		private String month;
		
		
		Finance(double totalS, double totalSp) { // 1.4 Constructor with two arguments
			
			this.totalSales = totalS;
			this.totalSpend = totalSp;
			
		System.out.println("Enter financial month:");	
		this.month = s.nextLine();
		}
		public double calcProfit() {
			return profit = this.totalSales - this.totalSpend;
		}
	
		public void financeRecord() {
			System.out.println("Financial Statement for: " + this.month 
					+ "\nTotal Sales \t\t:RM" + this.totalSales
					+ "\nTotal Spending \t\t:RM" + this.totalSpend
					+ "\nProfit \t\t\t:RM" + profit);
		}
}
