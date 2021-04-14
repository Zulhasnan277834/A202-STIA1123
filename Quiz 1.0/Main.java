
public class Main {

	public static void main(String[] args) {
		
		Cat Cat1 = new Cat();
		Cat1.setCatType();
		Cat1.setColor();
		Cat1.setOrigin();
		Cat1.setPersona();
		Cat1.setAvgPrice();
		
		System.out.println("Cat type :" + Cat1.getCatType());
		System.out.println("Color :" + Cat1.getColor());
		System.out.println("Nation of origin :" + Cat1.getOrigin());
		System.out.println("Personality :" + Cat1.personality);
		System.out.println("Average price in Ringgit :RM" + Cat1.getAvgPrice());
		
		System.out.println();
		
		Cat Cat2 = new Cat();
		Cat2.setCatType();
		Cat2.setColor();
		Cat2.setOrigin();
		Cat2.setPersona();
		Cat2.setAvgPrice();
				
		System.out.println("Cat type :" + Cat2.getCatType());
		System.out.println("Color :" + Cat2.getColor());
		System.out.println("Nation of origin :" + Cat2.getOrigin());
		System.out.println("Personality : " + Cat2.getPersona());
		System.out.println("Average price in Ringgit :RM" + Cat2.getAvgPrice());

	}

}
