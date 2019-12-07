import javafx.scene.control.*;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

public class Javafx1 extends Application
{
	public void start(Stage primaryStage)
	{
		primaryStage.setTitle("This is first JavaFX Application");
		Label lb1= new Label();
		lb1.setText("Welcome to JavaFX programming");
		lb1.setTextFill(Color.MAGENTA);

		FlowPane root= new FlowPane(10,10);
		root.getChildren().add(lb1);
		Scene myScene = new Scene(root,500,200);
		primaryStage.setScene(myScene);
		primaryStage.show();
	}
	public static void main(String args[])
	{
		launch(args);
	}


}