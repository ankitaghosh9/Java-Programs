import javafx.scene.control.*;
import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.event.*;
import javafx.geometry.*;

public class Javafx3 extends Application
{
	public static void main(String args[])
	{
		launch(args);
	}
	public void start(Stage primaryStage)
	{
		primaryStage.setTitle("Details");

        Label lb1= new Label();
        lb1.setText("User Name:");
        TextField tf = new TextField ();
        Label lb2= new Label();
        lb2.setText("Password:");
		PasswordField pf= new PasswordField();
		Button btn = new Button();
        btn.setText("Sign in");

        Label lb3= new Label();
        btn.setOnAction(new EventHandler<ActionEvent>() 
        {
            public void handle(ActionEvent event) 
            {
            	String str="";
                str= "Welcome " + tf.getText();
                lb3.setText(str);
            }
        });

		GridPane root= new GridPane();
		root.setPrefSize(100,100);
		root.setHgap(10);
		root.setVgap(10);
		root.add(lb1,0,0);
		root.add(lb2,0,1);
		root.add(tf,1,0);
		root.add(pf,1,1);
		root.add(btn,2,2);
		root.add(lb3,1,2);
		
		Scene myScene = new Scene(root,500,500);
		primaryStage.setScene(myScene);
		primaryStage.show();
	}
}