package adelium.cours.java;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Fenetre extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		BorderPane root = new BorderPane();
	    Scene scene = new Scene(root, 800, 600, Color.WHITE);

	    GridPane gridpane = new GridPane();
	    gridpane.setPadding(new Insets(5));
	    gridpane.setHgap(5);
	    gridpane.setVgap(5);
	    ColumnConstraints column1 = new ColumnConstraints(100);
	    ColumnConstraints column2 = new ColumnConstraints(50, 150, 300);
	    column2.setHgrow(Priority.ALWAYS);
	    gridpane.getColumnConstraints().addAll(column1, column2);

	    Label lblNom = new Label("Nom : ");
	    TextField txtNom = new TextField();
	    Label lblPrenom = new Label("Prenom");
	    TextField txtPrenom = new TextField();
	    Label lblPoids = new Label("Poids : ");
	    TextField txtPoids = new TextField();
	    Label lblTaille = new Label("Taille");
	    TextField txtTaille = new TextField();
	    
	    Label lblSexe = new Label("Sexe");
	    
	    ObservableList<String> options = 
	    	    FXCollections.observableArrayList(
	    	        "MASCULIN",
	    	        "FEMININ"
	    	    );
	    ComboBox cboSexe = new ComboBox(options);
	    

	    Button cmdCalculer = new Button("Calculer");

	   
	    GridPane.setHalignment(lblNom, HPos.RIGHT);
	    gridpane.add(lblNom, 0, 0);

	    
	    GridPane.setHalignment(lblPrenom, HPos.RIGHT);
	    gridpane.add(lblPrenom, 0, 1);
	    
	    GridPane.setHalignment(lblPoids, HPos.RIGHT);
	    gridpane.add(lblPoids, 0, 2);
	    
	    GridPane.setHalignment(lblTaille, HPos.RIGHT);
	    gridpane.add(lblTaille, 0, 3);
	    
	    GridPane.setHalignment(lblSexe, HPos.RIGHT);
	    gridpane.add(lblSexe, 0, 4);

	  
	    
	    
	    GridPane.setHalignment(txtNom, HPos.LEFT);
	    gridpane.add(txtNom, 1, 0);

	    
	    GridPane.setHalignment(txtPrenom, HPos.LEFT);
	    gridpane.add(txtPrenom, 1, 1);
	    
	    GridPane.setHalignment(txtPoids, HPos.LEFT);
	    gridpane.add(txtPoids, 1, 2);
	    
	    GridPane.setHalignment(txtTaille, HPos.LEFT);
	    gridpane.add(txtTaille, 1, 3);
	    
	    GridPane.setHalignment(cboSexe, HPos.LEFT);
	    gridpane.add(cboSexe, 1, 4);

	  
	    GridPane.setHalignment(cmdCalculer, HPos.CENTER);
	    GridPane.setColumnSpan(cmdCalculer, 2);
	    gridpane.add(cmdCalculer, 0, 5);
	    
	   
	    
	    
	    //Zone resultats
	    Label lblIMC = new Label("IMC : ");
	    TextField txtIMC = new TextField();
	    Label lblDiagnostic = new Label("Diagnostic");
	    TextField txtDiagnostic = new TextField();
	    Label lblPoidsMin = new Label("Poids min : ");
	    TextField txtPoidsMin = new TextField();
	    Label lblPoidsMax = new Label("Poids Max : ");
	    TextField txtPoidsMax = new TextField();
	    Label lblPoidsIdeal = new Label("Poids Ideal : ");
	    TextField txtPoidsIdeal = new TextField();
	    
	    GridPane.setHalignment(lblIMC, HPos.RIGHT);
	    gridpane.add(lblIMC, 0, 6);

	    
	    GridPane.setHalignment(lblDiagnostic, HPos.RIGHT);
	    gridpane.add(lblDiagnostic, 0, 7);
	    
	    GridPane.setHalignment(lblPoidsMin, HPos.RIGHT);
	    gridpane.add(lblPoidsMin, 0, 8);
	    
	    GridPane.setHalignment(lblPoidsMax, HPos.RIGHT);
	    gridpane.add(lblPoidsMax, 0, 9);
	    
	    GridPane.setHalignment(lblPoidsIdeal, HPos.RIGHT);
	    gridpane.add(lblPoidsIdeal, 0, 10);

	  
	    GridPane.setHalignment(txtIMC, HPos.LEFT);
	    gridpane.add(txtIMC, 1, 6);

	    
	    GridPane.setHalignment(txtDiagnostic, HPos.LEFT);
	    gridpane.add(txtDiagnostic, 1, 7);
	    
	    GridPane.setHalignment(txtPoidsMin, HPos.LEFT);
	    gridpane.add(txtPoidsMin, 1, 8);
	    
	    GridPane.setHalignment(txtPoidsMax, HPos.LEFT);
	    gridpane.add(txtPoidsMax, 1, 9);
	    
	    GridPane.setHalignment(txtPoidsIdeal, HPos.LEFT);
	    gridpane.add(txtPoidsIdeal, 1, 10);
	    
	    
	    cmdCalculer.setOnAction((e)-> {
	    	String nom = txtNom.getText();
	    	String prenom = txtPrenom.getText();
	    	float poids = Float.parseFloat(txtPoids.getText());
	    	float taille = Float.parseFloat(txtTaille.getText());
	    	Genre sexe = Genre.valueOf(cboSexe.getValue().toString());
	    	
	    	
	    	Personne P = new Personne(nom,prenom,poids,taille,sexe);
	    	txtIMC.setText(Float.toString(P.IMC()));
	    	txtDiagnostic.setText(P.Diagnostic());
	    	txtPoidsMin.setText(Float.toString(P.PoidsMin()));
	    	txtPoidsMax.setText(Float.toString(P.PoidsMax()));
	    	txtPoidsIdeal.setText(Float.toString(P.PoidsIdeal()));
	    	
	    	
	    	
	    });

	    root.setCenter(gridpane);
	    primaryStage.setScene(scene);
	    primaryStage.show();
	  }
	
	
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
