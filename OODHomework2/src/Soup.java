
public abstract class Soup {
	
	final void makeMeal(){
		
		prepmeal();
		
		if(buyerWantsBeef()){
			addBeef();
		}
		if(buyerWantsChicken()){
			addChicken();
		}
		if(buyerWantsVeggies()){
			addVeggies();
		}
		if(buyerWantsSides()){
			addSides();
		}
		if(buyerWantsCream()){
			addCream();
		}
		serve();
	}
	
	
	public void prepmeal(){
		System.out.println("The Soul/Chili you have ordered is being put together!");
	}
	
	
	
	
	abstract void addBeef();
	abstract void addChicken();
	abstract void addVeggies();
	abstract void addSides();
	abstract void addCream();
	boolean buyerWantsBeef(){ return true;}
	boolean buyerWantsChicken(){ return false;}
	boolean buyerWantsVeggies(){ return true;}
	boolean buyerWantsSides(){ return true;}
	boolean buyerWantsCream(){return true;}
	
	public void serve(){
		System.out.println("The meal has been served! Enjoy!");
	}
	

}
