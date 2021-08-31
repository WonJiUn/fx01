package quiz;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Quiz02 extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		
		HBox hbox = new HBox();
		VBox vbox1 = new VBox();
		VBox vbox2 = new VBox();
		VBox vbox3 = new VBox();
		
		
		StackPane sp1 = new StackPane();
		sp1.getChildren().addAll(new Rectangle(100,100,Color.BLUE));
		sp1.setPadding(new Insets(5,5,0,5));
		
		StackPane sp2 = new StackPane();
		sp2.getChildren().addAll(new Rectangle(100,100,Color.BLUE));
		sp2.setPadding(new Insets(10,5,0,5));
		
		StackPane sp3 = new StackPane();
		sp3.getChildren().addAll(new Rectangle(100,100,Color.RED));
		sp3.setPadding(new Insets(5,5,0,0));
		
		StackPane sp4 = new StackPane();
		sp4.getChildren().addAll(new Rectangle(100,100,Color.RED));
		sp4.setPadding(new Insets(10,5,0,0));
		
		StackPane sp5 = new StackPane();
		sp5.getChildren().addAll(new Rectangle(150,100,Color.BLACK));
		sp5.setPadding(new Insets(5,5,0,0));
		
		StackPane sp6 = new StackPane();
		sp6.getChildren().addAll(new Rectangle(150,100,Color.BLACK));
		sp6.setPadding(new Insets(10,5,0,0));
		
		vbox1.getChildren().addAll(sp1,sp2);
		vbox2.getChildren().addAll(sp3,sp4);
		vbox3.getChildren().addAll(sp5,sp6);
		
		hbox.getChildren().addAll(vbox1, vbox2,vbox3);
		
		
		arg0.setScene(new Scene(hbox,370,220));
		arg0.show();
	
	}
	public static void main(String[] args) {
		launch(args);
	}

}
