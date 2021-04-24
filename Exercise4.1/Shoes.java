import java.util.Scanner;

public class Shoes {

	private int Size;
	private int ShoesType;
	private String Color;
	private String MadeIn;
	private String Material;
	private double Price;
	private int Quantity;
	private double TotalPrice;
		
		//default constructor
		Scanner s = new Scanner(System.in);

		Shoes(){
			
			System.out.println("Welcome to our shop, enter your shoes detail:");
			
			System.out.print("Your shoes size (UK): ");
			this.Size = s.nextInt();
			
			s.nextLine();
			System.out.print("Enter color: ");
			this.Color = s.nextLine();
			
			System.out.print("Enter material of the shoes: ");
			this.Material = s.nextLine();
			
			System.out.print("Enter shoes price:RM");
			this.Price = s.nextDouble();
			
			System.out.print("Enter Quantity: ");
			this.Quantity = s.nextInt();
			
			this.TotalPrice = this.Price*this.Quantity;
			System.out.print("Total price is: RM" + this.TotalPrice);
			System.out.println();
		} 
		

		public Integer getSize() {
			return this.Size;
		}
		public String getColor() {
			return this.Color;
		}
		public String getMaterial() {
			return this.Material;
		}
		public Double getPrice() {
			return this.Price;
		}
		public Integer getQuantity() {
			return this.Quantity;
		}
		public Double getTotal() {
			return this.TotalPrice;
		}
}
