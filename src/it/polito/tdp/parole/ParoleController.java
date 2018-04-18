package it.polito.tdp.parole;


/**
 * Sample Skeleton for 'Parole.fxml' Controller Class
 */


import it.polito.tdp.parole.model.Parole;
import it.polito.tdp.parole.model.Parole_Arr;

import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;
import java.util.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ParoleController {
	
	Parole elenco ;
	Parole_Arr elenco2;
	

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="txtParola"
    private TextField txtParola; // Value injected by FXMLLoader

    @FXML // fx:id="txtResult"
    private TextArea txtResult; // Value injected by FXMLLoader
    
    @FXML
    private Button btnInserisciArray;

    @FXML
    private Button btnInserisciLinked;
    
    @FXML
    private TextArea txtTime;
    
    @FXML
    private Button btnReset;
    
    @FXML
    private Button btnCancella;

    
    
    


    @FXML
    void doCancella(ActionEvent event) {
    	double tempoIniziale= System.nanoTime();
    	String parolaCancellata = txtResult.getSelectedText();
    	elenco.cancella(parolaCancellata);
    	txtResult.clear();
    	
    	for(String x: elenco.getElenco()){
    
      	  txtResult.appendText(x);
      	  txtResult.appendText("\n");
      	  txtParola.clear();
      
      	  
        }
    	
    	txtTime.clear();
    	double tempoFinale= System.nanoTime();
      	
        double tempoEffettivo=tempoFinale-tempoIniziale;
        tempoEffettivo=tempoEffettivo/1000000000;
    	
    	   	
    	
    	String tempoStringa = "Il tempo effettivo per cancellare é: "+tempoEffettivo+" secondi";
    	
    	txtTime.appendText(tempoStringa);
    
    	
    }
    
    
    @FXML
    void doInsertL(ActionEvent event) {
    
    // TODO
   double tempoIniziale= System.nanoTime();
      txtResult.clear();
         
      String parola=txtParola.getText();
      
      elenco.addParola(parola);
      
      for(String x: elenco.getElenco()){
    	  txtResult.appendText(x);
    	  txtResult.appendText("\n");
    	  txtParola.clear();
    
    	  
      }
      
      txtTime.clear();
    double tempoFinale= System.nanoTime();
  	
    double tempoEffettivo=tempoFinale-tempoIniziale;
    tempoEffettivo=tempoEffettivo/1000000000;
	
	   	
	
	String tempoStringa = "Il tempo effettivo per l'inserimento é: "+tempoEffettivo+" secondi";
	
	txtTime.appendText(tempoStringa);

    	
    }
    
    @FXML
    void doInsertA(ActionEvent event) {
    
    // TODO
   double tempoIniziale= System.nanoTime();
      txtResult.clear();
         
      String parola=txtParola.getText();
      
      elenco2.addParola(parola);
      
      for(String x: elenco2.getElenco()){
    	  txtResult.appendText(x);
    	  txtResult.appendText("\n");
    	  txtParola.clear();
    
    	  
      }
      
      txtTime.clear();
    double tempoFinale= System.nanoTime();
  	
    double tempoEffettivo=tempoFinale-tempoIniziale;
    tempoEffettivo=tempoEffettivo/1000000000;
	
	   	
	
	String tempoStringa = "Il tempo effettivo per l'inserimento é: "+tempoEffettivo+" secondi";
	
	txtTime.appendText(tempoStringa);

    	
    }
    
    @FXML
    void doReset(ActionEvent event) {
    	// TODO
    	long tempoIniziale= System.nanoTime();
    	elenco.reset();
    	txtResult.clear();
    	txtParola.clear();
    
    	
    	txtTime.clear();
        long tempoFinale= System.nanoTime();
    	
    	long tempoEffettivo=tempoFinale-tempoIniziale;
        tempoEffettivo=tempoEffettivo*1000000;
    	
    	   	
    	
    	String tempoStringa = "Il tempo effettivo per il reset é: "+tempoEffettivo+" micro secondi";
    	
    	txtTime.appendText(tempoStringa);
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Parole.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Parole.fxml'.";
        assert btnInserisciLinked != null : "fx:id=\"btnInserisciLinked\" was not injected: check your FXML file 'Parole.fxml'.";
        assert btnInserisciArray != null : "fx:id=\"btnInserisciArray\" was not injected: check your FXML file 'Parole.fxml'.";
        assert btnCancella != null : "fx:id=\"btnCancella\" was not injected: check your FXML file 'Parole.fxml'.";
        assert txtTime != null : "fx:id=\"txtTime\" was not injected: check your FXML file 'Parole.fxml'.";
        
        elenco = new Parole() ;
        elenco2 = new Parole_Arr();
        
    }
}
