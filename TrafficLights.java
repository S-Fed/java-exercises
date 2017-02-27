import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class TrafficLights extends Application {

		private double paneWidth = 500;
		private double paneHeight = 200;
		
	public void start(Stage primaryStage){
	    

		
		BorderPane pane = new BorderPane();

		
		//Create the pane for the radio buttons 
	    VBox paneForRadioButtons = new VBox(20);
	    paneForRadioButtons.setPadding(new Insets(5, 5, 5, 5)); 
	    paneForRadioButtons.setStyle("-fx-border-color: yellowgreen");
	    paneForRadioButtons.setStyle
	      ("-fx-border-width: 2px; -fx-border-color: yellowgreen");
	    //Create the radio buttons
	    RadioButton rbRed = new RadioButton("Red Light");
	    RadioButton rbYellow = new RadioButton("Yellow Light");	   
	    RadioButton rbGreen = new RadioButton("Green Light");
	    //Add the buttons to the pane
	    paneForRadioButtons.getChildren().addAll(rbRed, rbYellow, rbGreen );
	    pane.setLeft(paneForRadioButtons);
	    
	    
	    ToggleGroup group = new ToggleGroup();
	    rbRed.setToggleGroup(group);
	    rbGreen.setToggleGroup(group); 
	    rbYellow.setToggleGroup(group);
		
	    //Create and fill the circles with color for the traffic light
		Circle redCircle = new Circle(paneWidth/2,20,10);
		Circle yellowCircle = new Circle(paneWidth/2,50,10);
		Circle greenCircle = new Circle(paneWidth/2,80,10);
		redCircle.setFill(Color.WHITE);
		yellowCircle.setFill(Color.WHITE);
		greenCircle.setFill(Color.WHITE);
		redCircle.setStroke(Color.BLACK);
		yellowCircle.setStroke(Color.BLACK);
		redCircle.setStroke(Color.BLACK);
		greenCircle.setStroke(Color.BLACK);
		
	    //Create the traffic light, color it, and add the lights to it
		Rectangle rect= new Rectangle(paneWidth/2 -15, 5, 30, 90);
		rect.setFill(Color.YELLOWGREEN);
		rect.setStroke(Color.BLACK);
		pane.getChildren().addAll(rect,redCircle,yellowCircle,greenCircle);
		BorderPane bpane = new BorderPane();
		bpane.setCenter(pane);
		
		
		
		Scene scene = new Scene(bpane, paneWidth, paneHeight +40);
		primaryStage.setTitle("Traffic Light");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		//Set the radio buttons to work when clicked
		rbRed.setOnAction(e -> {
	        if (rbRed.isSelected()) {
	          redCircle.setFill(Color.RED);
	          yellowCircle.setFill(Color.WHITE);
	          greenCircle.setFill(Color.WHITE);
	         
	        }
	      });
	      
	    rbYellow.setOnAction(e -> {
	        if (rbYellow.isSelected()) {
	          yellowCircle.setFill(Color.YELLOW);
	          redCircle.setFill(Color.WHITE);
	          greenCircle.setFill(Color.WHITE);
	        }
	      });
	      
	    rbGreen.setOnAction(e -> {
	        if (rbGreen.isSelected()) {
	          greenCircle.setFill(Color.LIME);
	          redCircle.setFill(Color.WHITE);
	          yellowCircle.setFill(Color.WHITE);
	        }
	      });

	      return;
	
	};
	public static void main(String[] args){
		Application.launch(args);
		
	}
	
	
	
	
	
}
