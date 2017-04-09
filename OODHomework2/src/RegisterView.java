import java.awt.event.ActionListener;
import javax.swing.*;
public class RegisterView extends JFrame{

	private JTextField a = new JTextField(10);
	private JLabel additionLabel = new JLabel("+");
	private JTextField b = new JTextField(10);
	
	private JButton totalButton = new JButton("Sum");
	private JTextField Total = new JTextField(10);
	
	RegisterView(){
		JPanel regPanel = new JPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 200);
		
		regPanel.add(a);
		regPanel.add(additionLabel);
		regPanel.add(b);
		regPanel.add(totalButton);
		regPanel.add(Total);
		
		this.add(regPanel);
	}
	
	public int getA(){
		return Integer.parseInt(a.getText());
	}
	
	public int getB(){
		return Integer.parseInt(b.getText());
	}
	public int getTotal(){
		return Integer.parseInt(Total.getText());
	}
	public void setTotal(int T){
		Total.setText(Integer.toString(T));
	}
	
	void addRegListener(ActionListener listen){
		totalButton.addActionListener(listen);
	}
	void displayErrorMessage(String Error){
		JOptionPane.showMessageDialog(this, Error);
	}
}
