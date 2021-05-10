
public abstract class Fruits { //abstrack class

private String name;
	
	public Fruits(String name) {
		this.name = name;
		System.out.println(this.name +  " constructor is invoked");
	
	
	  }
	public String getName() {
		return name;
	}
	public abstract double totalPrice(); //abstrack method
	public abstract String toString();   //abstrack method
}

