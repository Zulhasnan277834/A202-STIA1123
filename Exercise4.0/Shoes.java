import java.util.*;
public class Shoes {

	private double Price;
	private int Quantity;
	private double TotalPrice;
	
	//default constructor
	Scanner s = new Scanner(System.in);

	public Shoes(){
		
		System.out.print("Enter shoes price: RM");
		Price = s.nextDouble();
		
		System.out.print("Enter Quantity: ");
		Quantity = s.nextInt();
		
		
	} 
	public Double getPrice() {
		return Price;
	}
	public Integer getQuantity() {
		return Quantity;
	}
	public Double Total() {
		return Price*Quantity;
	}
}
