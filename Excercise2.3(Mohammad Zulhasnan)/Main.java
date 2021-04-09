import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		Smartphone Apple = new Smartphone();
		Apple.printSmartphone();
		Apple.calculateRam();
		Apple.calculateStorage();
		Apple.devOption();
		Apple.printCamera();
		
		System.out.println();
		
		Smartphone Android = new Smartphone();
		Android.printSmartphone();
		Android.calculateRam();
		Android.calculateStorage();
		Android.devOption();
		Android.printCamera();


	}

}
