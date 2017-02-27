import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.text.*;

public class CircleClickMiniGame extends Application{
	
		private int count = 0;
		private long startTime,endTime;
		
	
	
	

	public void start(Stage primaryStage){
		Pane cpane = new Pane();
		Circle mycircle = new Circle(40,40,10);	   //Create circle define starting x,y and radius  
		
		cpane.getChildren().add(mycircle);
		Scene myscene = new Scene(cpane, 200,200); //Start scene define width and length of cpane
		primaryStage.setTitle("Get the Circle!");
		primaryStage.setScene(myscene);
		primaryStage.show();
		startTime = System.currentTimeMillis()/1000;
		//Start game set circle to random location
		//Move circle to new random location and change color every time it is clicked
		mycircle.setOnMouseClicked( e -> {
				if (count < 4){
					Color nextcolor = new Color
					(Math.random(),Math.random(),Math.random(),1);
					mycircle.setFill(nextcolor);
					double newx = Math.random() * myscene.getWidth();//Makes a random X coordinate 
					double newy = Math.random() * myscene.getHeight();//Makes a random Y coordinate
					mycircle.setCenterX(newx);
					mycircle.setCenterY(newy);
					count++;
				
				}
				//End game if circle is clicked 5 times and show time it took to complete game in seconds
				else{
				endTime = System.currentTimeMillis()/1000;
				cpane.getChildren().clear();
				cpane.getChildren().add(new Text(30,30, "Time Spent: " + (endTime-startTime) + " Seconds"));
				
				}
		});
}
	
	
	public static void main(String[] args) {
		
		Application.launch(args);
				
		
		
		
		
		
		
		
		
		
		
	}

}
