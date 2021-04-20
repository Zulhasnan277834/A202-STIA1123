
public class Converse extends Shoes{

	private double disc;
	private double d;
		
	public Converse() {
		System.out.println("Enter Discount:");
		disc = s.nextDouble();
	}
	
	public Double getD() {
		return disc;
	}
	public Double getDisc() {
		return (disc/100)*getTotal();
	}
	
	public Double getAfterDisc() {
		return getTotal()-getDisc();
	}
}
