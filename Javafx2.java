import javafx.scene.control.*;
import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.event.*;
import javafx.geometry.*;

public class Javafx2 extends Application
{
	public static void main(String args[])
	{
		launch(args);
	}
	public void start(Stage primaryStage)
	{
		primaryStage.setTitle("Multiplication Table");
		
		Label lb1= new Label();
		lb1.setText("Enter number:");
		TextField textField = new TextField ();

        Label lb2= new Label();
        textField.setOnAction(ae->{
        	      String table="";
       			 for(int i=1;i<=10;i++)
        		{
        			table+=i+"*"+ Integer.parseInt(textField.getText()) + "="+(Integer.parseInt(textField.getText())*i)+"\n";
        		}
        		lb2.setText(table);
        	});

		FlowPane root= new FlowPane(10,10);
		root.setAlignment(Pos.CENTER);
		root.setOrientation(Orientation.VERTICAL);
		root.getChildren().addAll(lb1, textField, lb2);
		
		Scene myScene = new Scene(root,500,500);
		primaryStage.setScene(myScene);
		primaryStage.show();

	}


}


