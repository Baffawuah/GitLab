
public class test {

	public static void main(String [] args){
		RegisterView theView = new RegisterView();
		RegisterModel theModel = new RegisterModel();
		RegisterController theController = new RegisterController(theView,theModel);
		
		theView.setVisible(true);
		
		
	}
}
