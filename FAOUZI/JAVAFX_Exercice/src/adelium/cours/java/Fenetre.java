package adelium.cours.java;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Fenetre extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane root = new BorderPane();
	    Scene scene = new Scene(root, 400, 300, Color.WHITE);
	    
	    VBox vbox = new VBox();
	    RadioButton rbtCheque = new RadioButton("Chèque");
	    RadioButton rbtCB = new RadioButton("CB");
	    
	    
	    ToggleGroup group = new ToggleGroup();
	   
	    rbtCheque.setToggleGroup(group);
	    rbtCB.setToggleGroup(group);
	    
	    rbtCheque.setUserData("cheque");
	    rbtCB.setUserData("CB");
	    
	    
	    vbox.getChildren().addAll(rbtCheque,rbtCB);
	    
	    root.setLeft(vbox);
	    
	    VBox vbox2 = new VBox();
	    
	    root.setRight(vbox2);
	    
	    group.selectedToggleProperty().addListener(
	        (ov,old_toggle,new_toggle) -> {
	                if (group.getSelectedToggle() != null) {
	                   
	                	String selection = group.getSelectedToggle().getUserData().toString();
	                	System.out.println(selection);
	               
		                if (selection.equals("CB"))
		                {
		                	vbox2.getChildren().clear();
		                	Label lblNouveau = new Label("Type de carte");
		                	
		                	ComboBox cboTypeCB = new ComboBox();
		                	cboTypeCB.getItems().addAll("VISA","MASTER CARD","AMERICAIN EXPRESS");
		                	vbox2.getChildren().addAll(lblNouveau,cboTypeCB);
		                }
		                else
		                	if (selection.equals("cheque"))
			                {
			                	vbox2.getChildren().clear();
			                	Label lblNouveau = new Label("Cheque 2121");
			                	vbox2.getChildren().add(lblNouveau);
			                }
	                
	                
	                
	                }                
	           
	    });
	    
	    
	    
	    primaryStage.setScene(scene);
	    primaryStage.show();
	}
	
	
	
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
