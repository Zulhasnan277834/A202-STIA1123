package Assignment01;

public class EmployeeInfo { //1.3 User-defined class

	EmployeeInfo(){ // 1.4 Constructor with one arguments
		
		System.out.println("\nEmployee list: \n");
		System.out.println("Name:" + "\t\t\t\t" + "\t\t\tContact number:");
		
		String []employee = {"Hazman \t\t(Supplier Manager)"
				, "Hazim \t\t(Assistant Manager)", 
				"Kamal \t\t(Logistic Manager)", 
				"Badrul \t\t(Advertisment Manager)", 
				"Faiz Soep \t(Base Worker)\t"};
		
		int []phone = {8582231, 8593321, 8592211, 8582291, 8580999};
		for(int x = 0; x<employee.length; x++) {
			System.out.println(employee[x] + "\t\t\t" + phone[x]);
		}
	}
}
