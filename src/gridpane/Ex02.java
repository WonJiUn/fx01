package gridpane;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Ex02 extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		
		GridPane gridpane = new GridPane();
		Button button = new Button("Button");
		GridPane.setConstraints(button, 0, 0);
		
		Label label = new Label("Label");
		GridPane.setConstraints(label, 1, 1);
		
		gridpane.getChildren().addAll(button,label);
		Button btn = new Button("1, 0");	//위치지정 없이 버튼을 만들기만 함
		gridpane.add(btn, 1, 0);			//추가하면서 위치지정
		gridpane.add(new Label("0,1"),0,1);
		
		gridpane.setPadding(new Insets(20)); //위, 오른, 아래, 왼 모두 20
		gridpane.setHgap(50);
		gridpane.setVgap(10);
		
		arg0.setScene(new Scene(gridpane,300,300));
		
		FlowPane flowpane = new FlowPane();
		flowpane.getChildren().add(new Button("merge col(0), row(2)"));
		flowpane.setStyle("-fx-background-color:black;");
		flowpane.setAlignment(Pos.CENTER);
		gridpane.add(flowpane, 0,2,2,1);	//가로, 세로, 가로병합(2개), 세로병합(1개 = 자기자신만)
		
		arg0.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
