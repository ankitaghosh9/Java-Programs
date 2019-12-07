import javafx.scene.control.*;
import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.event.*;
import javafx.geometry.*;

public class Javafx4 extends Application
{
	public static void main(String args[])
	{
		launch(args);
	}
	public void start(Stage primaryStage)
	{
		primaryStage.setTitle("GCD of two numbers:");
		Label lb1= new Label();
		Label lb2= new Label();
		lb1.setText("Enter the numbers:");
		TextField tf1 = new TextField ();
		TextField tf2 = new TextField ();
		Button btn = new Button();
        btn.setText("Enter");
        btn.setOnAction(new EventHandler<ActionEvent>() 
        {
            public void handle(ActionEvent event) 
            {
            	String ans="";
                int gcd=1;
                int a= Integer.parseInt(tf1.getText());
                int b= Integer.parseInt(tf2.getText());
                for(int i=1;i<=a;i++)
                {
                	if(a%i==0 && b%i==0)
                		gcd=i;
                }
                ans+="GCD: "+gcd;
                lb2.setText(ans);
            }
        });

		FlowPane root= new FlowPane(10,10);
		root.setAlignment(Pos.CENTER);
		root.setOrientation(Orientation.VERTICAL);
		root.getChildren().addAll(lb1, tf1, tf2, btn, lb2);
		
		Scene myScene = new Scene(root,500,500);
		primaryStage.setScene(myScene);
		primaryStage.show();
	}
}
