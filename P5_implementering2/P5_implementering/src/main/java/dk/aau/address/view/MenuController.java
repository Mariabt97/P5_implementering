package dk.aau.address.view;

/*Importere javafx filer*/
import javafx.fxml.FXML;

/*SceneBuilder imports */
import javafx.scene.control.Button;

/*Danner klasse for MenuController, der indeholder aktivering af knappen*/

public class MenuController{

@FXML
private Button anatomyButton;

@FXML
	public void buttonClicked(){
		anatomyButton.setText("Button clicked!");
		treatmentButton.setText("hej");
	}

@FXML
private Button treatmentButton;
@FXML
private Button faqButton;
@FXML
private Button askButton;

}