
public class VeggieSoup extends Soup{
	
	String[] sides = { "Crackers", "Bread", "Cheese Cubes" };

    boolean buyerWantsBeef() { return false;}
    boolean buyerWantsChicken() { return false;}
    
	void addBeef() {	}

	@Override
	void addChicken() {
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
