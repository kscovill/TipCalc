package application;

import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class tipCalcController {
	@FXML
	private TextField amountTextField;
	
	@FXML
	private TextField tipTextField;
	
	@FXML
	private TextField tipTotal;
	
	@FXML 
	private TextField amountTotal;
	
	@FXML
	private void calculateButtonPressed(ActionEvent event){
		Float mealAmount = Float.parseFloat(amountTextField.getText());
		Float tipAmount = Float.parseFloat(tipTextField.getText());
		float tote = mealAmount * (tipAmount/100);
		//tip
		tipTotal.setText(String.valueOf(tote));
		amountTotal.setText(String.valueOf(mealAmount + tote));
	}
}
