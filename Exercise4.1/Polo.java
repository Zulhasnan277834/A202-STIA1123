
public class Polo extends Shoes{
	
	private String Brand;
	private String Model;
	private Double Diss;
	
	Polo(){
		super();
		this.Brand = "Polo";
		
		System.out.print("Enter shoes model:");
		s.nextLine();
		this.Model = s.nextLine();
	}
	
	//method
	public double calDiscount() {
		
		System.out.println("Enter Discount Coupon :");
		Diss = s.nextDouble();
		double cal = (Diss/100)*super.getTotal();
		return cal;
	}
	
	double afterDiss() {
		
		double AD =  super.getTotal()-calDiscount();
		return AD;
	}
	
	public String getBrand() {
		return this.Brand;
	}
	public String getModel() {
		return this.Model;
	}
	
	

}
