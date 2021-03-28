package it.polito.tdp.spellchecker;
import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.spellchecker.model.Dictionary;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

public class FXMLController {
	
	Dictionary model;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<String> comb;

    @FXML
    private TextArea txtResult1;

    @FXML
    private Button btnCheck;

    @FXML
    private TextArea txtResult2;

    @FXML
    private Button btnClearText;

    @FXML
    void doButtonCheck(ActionEvent event) {
    String parola= txtResult1.getText().toLowerCase();
    parola.replaceAll("[.,\\/#!$%\\^&\\*;:{}=\\-_`~()\\[\\]\"]", "");
    
    
    
    	
    	
    	
    }

    @FXML
    void doClearText(ActionEvent event) {
     txtResult1.clear();
     txtResult2.clear();
    }

    @FXML
    void initialize() {
        assert comb != null : "fx:id=\"cmbCombo\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult1 != null : "fx:id=\"txtResult1\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnCheck != null : "fx:id=\"btnCheck\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult2 != null : "fx:id=\"txtResult2\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnClearText != null : "fx:id=\"btnClearText\" was not injected: check your FXML file 'Scene.fxml'.";
  
   
    }

	public void setModel(Dictionary model) {
		this.model=model;
		comb.getItems().addAll("English","Italian");
		
	}
    
    
    
}

