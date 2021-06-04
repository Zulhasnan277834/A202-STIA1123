package Assignment01;

import java.util.*;
public class Inventory {

	Scanner s = new Scanner(System.in);
	
	int smallStorage, mediumStorage, largeStorage;
	int allStorage;
	int rentStorage;
	int avStorage;
	int ss = 100, ms = 100,ls = 100;
	int TotalS, TotalM, TotalL;
	
	Inventory(int as) { // 1.4 Constructor with 1 arguments
		
		allStorage = as;
		
		System.out.println("--------------------Inventory--------------------");
		
		 
	}
	
	public void calcStorage () {
		
		System.out.print("Enter small storage rented amount \t: ");
		int sr = s.nextInt();
		
		System.out.print("Enter medium storage rented amount \t: ");
		int mr = s.nextInt();
		
		System.out.print("Enter large storage rented amount \t: ");
		int lr = s.nextInt();
		
		TotalS = ss-sr;
		TotalM = ms-mr;
		TotalL = ls-lr;
		
		avStorage = allStorage-(sr+mr+lr);
	}
	
	public void StorageStock() {
		
		System.out.println("---------------Inventory Stock Review---------------");
		System.out.println("Storage unit provide by the company \t\t: " + allStorage + " unit");
		System.out.println("Available storage amount for all category \t: " + avStorage + " unit");
		System.out.println("Small Storage Available \t\t\t: " + TotalS + " unit");
		System.out.println("Medium Storage Available \t\t\t: " + TotalM + " unit");
		System.out.println("Large Storage Available \t\t\t: " + TotalL + " unit");
		
		
	}
}
