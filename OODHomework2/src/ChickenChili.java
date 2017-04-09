
public class ChickenChili extends Soup{

	
	boolean buyerWantsChicken() {return true;}
	
	String[] sides = { "French Fries", "Crackers" };
	void addBeef() {
		System.out.println("Adding shredded Beef to mixture!");		
	}

	@Override
	void addChicken() {
		System.out.println("Adding Shredded Chicken to mixture!");
		
	}

	@Override
	void addVeggies() {
		System.out.println("Adding Cut veggies to the mixture");
		
	}

	@Override
	void addSides() {
		System.out.println("Adding the sides : ");
		
		for(String sides : sides){
			System.out.println(sides + " ");
		}
		
	}

	@Override
	void addCream() {
		System.out.println("Adding the Cream");
	}
	

}
