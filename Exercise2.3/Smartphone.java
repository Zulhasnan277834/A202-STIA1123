import java.util.Scanner;
public class Smartphone {

	String Model ;
	String Color ;
	String OS ;
	String type;
	String color;
	double percentage;
	
	Scanner s = new Scanner(System.in);
	
	void printSmartphone() {
		
		System.out.println("Enter :\n1.Brand \n2.Model\n3.Color ");
		String b = s.nextLine();
		String m = s.nextLine();
		String c = s.nextLine();
		
		
			System.out.println("Brand : " + b);
			System.out.println("Model : " + m);
		    System.out.println("Color : " + c);
		    System.out.println();
		    
	}//end printSmartphone
	
	void calculateRam() { 
		
		System.out.println("Enter used Ram :(mb)");
		int Ram = s.nextInt();
		
		int totalRam = 7473;
		int avRam = totalRam-Ram;
		
		System.out.println("Availale Ram is : " + avRam + "mb");
		System.out.println();
	}//end calculateRam
	
	void calculateStorage() {
		System.out.println("Enter Used Storage(gb) :");
		double usedStorage = s.nextDouble();
		
		System.out.println("Enter Total Storage(gb) :");
		double totalStorage = s.nextDouble();
		
		double avStorage = totalStorage-usedStorage;
		System.out.println("Availale Storage is : " + avStorage + "gb");
		System.out.println();
	}//end calculateStorage
	
	void devOption() {
		System.out.println("Turn on deleveloper mode?");
		boolean OnOff = s.nextBoolean();
		
		if (OnOff == true) {
			System.out.println("You are a developer");
			}
			else if (OnOff == false){
				System.out.println("Developer option is disable");	
			}
		
		System.out.println();	
		
	}//end devOption
	
	void printCamera() {
		System.out.println("Choose the camera you want to use :\n 1.Main Camera \n 2.Ultrawide Camera \n 3.Macro Camera");
		
		int camera = s.nextInt();
		
		switch (camera) {
		
		case 1:
			System.out.println("You are using 'Main Camera'");
			System.out.println("Main Camera \n 108 MP(f/1.7) \n 26mm(wide)lense \n OIS");
			break;
		case 2: 
			System.out.println("You are using 'Ultrawide Camera'");
			System.out.println("Ultrawide Camera \n 13MP(f/2.4) \n 123 degree lense ");
			break;
		case 3: 
			System.out.println("You are using 'Macro Camera'");
			System.out.println("Macro Camera \n 5MP(f/2.4) \n 1/50");
			break;
			
	}//end switch
				
	}//end printCamera
	}//end class
	
