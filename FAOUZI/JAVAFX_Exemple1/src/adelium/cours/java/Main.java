package adelium.cours.java;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			
			
			HBox hbox = new HBox();
			  hbox.setPadding(new Insets(15, 12, 15, 12));
			  hbox.setSpacing(10);
			  hbox.setStyle("-fx-background-color: #336699;");
			
			    
			  Button cmdOk = new Button("Okay");  
			  cmdOk.setPrefSize(100, 20);
			  
			 
			  
			  
			  
			  
			  
			  
			  Button cmdAnnuler = new Button("Annuler");  
			  cmdAnnuler.setPrefSize(100, 20);
			
			  hbox.getChildren().addAll(cmdOk,cmdAnnuler);
			  
			  root.setTop(hbox);
			  
			  
			  Label lblEtiquette = new Label("Message : ");
			  Label lblMessage = new Label();
			  
			  HBox hbox2 = new HBox();
			  hbox2.setPadding(new Insets(15, 12, 15, 12));
			  hbox2.setSpacing(60);
			  
			  hbox2.getChildren().addAll(lblEtiquette,lblMessage);
			  
			  root.setBottom(hbox2);
			  
			    scene.getStylesheets().add(getClass().
					    getResource("application.css").
					toExternalForm());
			    
			    cmdOk.setOnAction(new EventHandler<ActionEvent> () {
					@Override
					public void handle(ActionEvent arg0) {
						lblMessage.setText("Bouton Ok en action");
						
					}
					  
				  });
			    
			   /* cmdAnnuler.setOnAction(new EventHandler<ActionEvent> () {
					@Override
					public void handle(ActionEvent arg0) {
						lblMessage.setText("Bouton Annuler en action");
						
					}
					  
				  });*/
			    
			    cmdAnnuler.setOnAction( (event) ->{
					
						lblMessage.setText("Bouton Annuler en action");
						
					}
					  
				  );
			    
			    
			    lblMessage.setOnMouseEntered((e) -> {
			        {
			        	//lblMessage.setFont(new Font("Cambria", 32));
			        	lblMessage.setRotate(270);
			        	lblMessage.setTranslateY(50);
			        	lblMessage.setScaleX(1.5);
			        	lblMessage.setScaleY(1.5);
			        }
			    });

			    lblMessage.setOnMouseExited((e)-> {
			        {
			        	lblMessage.setRotate(0);
			        	lblMessage.setTranslateY(0);
			        	lblMessage.setScaleX(1);
			        	lblMessage.setScaleY(1);
			        }
			    });
			    
			    
			    
			VBox vbox = new VBox();
			Label lblNom = new Label("Nom : ");
			TextField txtNom = new TextField();
			Label lblPrenom = new Label("Prenom : ");
			TextField txtPrenom = new TextField();
			Label lblAdresse = new Label("Adresse : ");
			TextField txtAdresse = new TextField();  
			
			
			Button cmdNomComplet = new Button("Affiche");
			
			cmdNomComplet.setOnAction((e) -> {
				lblMessage.setText(txtPrenom.getText()+", "
			+ txtNom.getText());
				
			});
			
			
			
			
			vbox.getChildren().addAll(lblNom,txtNom,lblPrenom,txtPrenom,lblAdresse,txtAdresse,cmdNomComplet);
			
			root.setLeft(vbox);
			
			
			
			
			primaryStage.setScene(scene);
			primaryStage.setTitle("Ma superbe première fenêtre");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
