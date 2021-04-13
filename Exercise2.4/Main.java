
public class Main {

	public static void main(String[] args) {
		
		Cat Cat1 = new Cat();
		Cat1.setCatType("British Short Hair");
		Cat1.setColor("Grey");
		Cat1.setOrigin("Great Britain");
		Cat1.setPersona("Easy going and plasid");
		Cat1.setAvgPrice(2500);
		
		System.out.println("Cat type :" + Cat1.getCatType());
		System.out.println("Color :" + Cat1.getColor());
		System.out.println("Nation of origin :" + Cat1.getOrigin());
		System.out.println("Personality :" + Cat1.personality);
		System.out.println("Average price in Ringgit :RM" + Cat1.getAvgPrice());
		
		System.out.println();
		
		Cat Cat2 = new Cat();
		Cat2.setCatType("Persian");
		Cat2.setColor("White");
		Cat2.setOrigin("Iran");
		Cat2.setPersona("Quite and Sweet");
		Cat2.setAvgPrice(500);
				
		System.out.println("Cat type :" + Cat2.getCatType());
		System.out.println("Color :" + Cat2.getColor());
		System.out.println("Nation of origin :" + Cat2.getOrigin());
		System.out.println("Personality : " + Cat2.getPersona());
		System.out.println("Average price in Ringgit :RM" + Cat2.getAvgPrice());

	}

}
