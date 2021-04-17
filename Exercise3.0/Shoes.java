import java.util.*;
public class Shoes {
	
    String Brand;
	int ShoesType;
	String Color;
	String MadeIn;
	String Material;
	double Price;
	int Quantity;
	double TotalPrice;
	
	//default constructor
	Scanner s = new Scanner(System.in);

	Shoes(){
		
		System.out.print("Enter Brand:");
		this.Brand = s.nextLine();
		
		System.out.println("Choose Shoes Type:"
				+ "\n 1.Formal"
				+ "\n 2.Casual");
		this.ShoesType = s.nextInt();
		
		switch (ShoesType) {
		
		case 1: 
			System.out.print("You choose formal shoes");
			break;
		case 2: 
			System.out.print("You choose casual shoes");
			break;
		}
		System.out.println();
		
		s.nextLine();
		System.out.print("Enter color: ");
		this.Color = s.nextLine();
		
		System.out.print("Enter made in whice country: ");
		this.MadeIn = s.nextLine();
		
		System.out.print("Enter material of the shoes: ");
		this.Material = s.nextLine();
		
		System.out.print("Enter shoes price: RM");
		this.Price = s.nextDouble();
		
		System.out.print("Enter Quantity: ");
		this.Quantity = s.nextInt();
		
		this.TotalPrice = this.Price*this.Quantity;
		System.out.print("Total price is: RM" + this.TotalPrice);
		System.out.println();
	} 
	
	Shoes(String Brand, int s, String c, String m, String Mtrl, double Price, int Quantity, double total){
		
		this.Brand = Brand;
		this.ShoesType = s;
		this.Color = c;
		this.MadeIn = m;
		this.Material = Mtrl;
		this.Price= Price;
		this.Quantity = Quantity;
		this.TotalPrice = total;
	}
}
