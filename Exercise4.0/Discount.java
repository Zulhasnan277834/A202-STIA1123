
public class Discount extends Shoes {

	private double disc;
	

	public Discount() {
		super();
		System.out.println("Enter Discount:");
		disc = s.nextDouble();
	}
	public Double getDiss() {
		return disc;
	}
	public Double calDisc() {
		return (disc/100)*super.Total();
	}
	
	public Double getAfterDisc() {
		return super.Total()- calDisc();
	}
}
