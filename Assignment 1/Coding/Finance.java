package Assignment01;

import java.util.*;
public class Finance { //1.3 User-defined class

		Scanner s = new Scanner(System.in);
		
		double totalSales;
		double totalSpend;
		double profit;
		String month;
		
		
		Finance(double totalS, double totalSp) { // 1.4 Constructor with 2 arguments
			
			totalSales = totalS;
			totalSpend = totalSp;
			
		System.out.println("Enter financial month:");	
		month = s.nextLine();
		}
		public double calcProfit() {
			return profit = totalSales - totalSpend;
		}
	
		public void financeRecord() {
			System.out.println("Financial Statement for: " + month 
					+ "\nTotal Sales \t\t:RM" + totalSales
					+ "\nTotal Spending \t\t:RM" + totalSpend
					+ "\nProfit \t\t\t:RM" + profit);
		}
}
