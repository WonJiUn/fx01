package gridpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Ex01 extends Application {
	
	@Override
	public void start(Stage arg0) throws Exception {
		GridPane gridPane = new GridPane();
		Button btn = new Button("Button");
		GridPane.setConstraints(btn, 0,0); //가로, 세로(좌표)

		Label label = new Label("Label");
		Label label02 = new Label("Label02");
		
		GridPane.setConstraints(label02, 1, 1);
		GridPane.setConstraints(label, 0, 2);
		
		gridPane.getChildren().addAll(btn,label, label02);
		
		arg0.setScene(new Scene(gridPane, 300, 100));
		
		arg0.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	
}
