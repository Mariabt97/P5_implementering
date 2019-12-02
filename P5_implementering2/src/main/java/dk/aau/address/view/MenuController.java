package dk.aau.address.view;

import dk.aau.address.model.Platform;
import dk.aau.App;
/*Importere javafx filer*/
import javafx.fxml.FXML;

/*SceneBuilder imports */
import javafx.scene.control.Button;

/*Danner klasse for MenuController, der indeholder aktivering af knappen*/

public class MenuController{
//Angiver indholdet, for alle dem der har fx:id i scenebuilder
@FXML
private Button anatomyButton;
@FXML
private Button treatmentButton;
@FXML
private Button faqButton;
@FXML
private Button askButton;

//Refererer til hoved applikationen
private App app;

/**
 * Danner constructoren
 * Denne er kaldet før initialize() metoden
 */

 public MenuController(){
 }

private Platform menu;
private boolean buttonClicked = false;

//Initialisere
@FXML
private void initialize(){
	//Indsæt noget data her...
}

/**
 * Bliver kaldet af "app" applikationen
 * for at give reference tilbage til den selv 
 * 
 * @param app 
 */

public void setApp(App app){
	this.app = app;

	//Tilføj noget mere her....
}

/**
 * Her tænker jeg der skal noget ind med de 
 * knapper der er på forsiden
 * @param
 */

 /*private void showButtonsFunctions(Button button){
	 if (button != null){
		 //Noget med hvad der sker, hvis der trykkes på knappen
	  } else{
		// Noget med hvad der sker, når der ikek trykkes på knappen
	 } 
 }*/


/**
 * Returnere, hvis brugeren trykker ind på en af fanerne
 * 
 * @return
 */

public boolean isButtonClicked(){
	return buttonClicked;
}
}