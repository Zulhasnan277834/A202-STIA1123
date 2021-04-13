
public class Smartphone {

	String Model ;
	String Color ;
	String OS ;
	int Storage ;
	double Bluetooth;
	boolean Dev;
	
	
	
	void printSmartphone(String b, String c, String o, int s, double blt) {
		
		System.out.println("Smartphone Brand : " + b);
		System.out.println("Color : " + c);
		System.out.println("OS: " + o);
		System.out.println("Storage : " + s + "gb");
		System.out.println("Bluetooth Version : " + blt);
		
		}
	
	void calculateRam(double total, double used) {
		
        double available = total-used;
        double percent = available/total*100;
        System.out.printf("Available ram is : " + available + "mb" + "(%.2f)",percent);
        System.out.println();
      
	}
	void calculateStorage(double totalStorage, double usedStorage) {
		
	    double storage = totalStorage-usedStorage;
	    double percentage = storage/totalStorage*100;
	    System.out.printf("Available storage is :" + storage + "gb" + "(%.2f)",percentage );
	    System.out.println();
	   
		
		
	}
	void devOption(boolean oxo) {
		
		if (oxo == true) {
			System.out.println("You are a developer ");
		}
		else {
			System.out.println("Developer option is disable");
		}
			
	}
	
	
			
}
