package Assignment01;

public class EmployeeInfo extends CompanyInfo{ // 2.1 extends from CompanyInfo

	EmployeeInfo(){ // 1.4 Constructor with no arguments
		
		System.out.println("\nEmployee list: \n");
		System.out.println("=========================================================================");
		System.out.println("Name:" + "\t\t\t\t" + "\t\t\tContact number:");
		
		String []employee = {"Azman \t\t(Supplier Manager)"
				, "Hazim \t\t(Assistant Manager)", 
				"Kamal \t\t(Logistic Manager)", 
				"Badrul \t(Advertisment Manager)", 
				"Faiz Soep \t(Base Worker)\t"};
		
		String []phone = {"0145455544", "0112332211", "0143325544", "0178898332", "0115673321"};
		
		for(int x = 0; x<employee.length; x++) {
			System.out.println("|" + employee[x] + "\t\t\t" + phone[x]);
			
		}
		System.out.println("=========================================================================");
	}
	public void printInfo() { //2.2 Polymorphism
		
		System.out.println("Information: All worker must work from home during this pandemic Covid-19");
		
		
	}
	
}
