import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterController {

	private RegisterView theView;
	private RegisterModel theModel;
	
	public RegisterController(RegisterView theView,RegisterModel theModel ){
		this.theView = theView;
		this.theModel = theModel;
		
		this.theView.addRegListener(new RegListener());
	}
	
	class RegListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			int a, b = 0;
			
			try{
				a = theView.getA();
				b = theView.getB();
				
				theModel.addNumbers(a,b);
				theView.setTotal(theModel.getValue());
			}
			catch (NumberFormatException ex){
				theView.displayErrorMessage("You need to enter 2 numbers!");
			}
			
		}
		
	}
}
