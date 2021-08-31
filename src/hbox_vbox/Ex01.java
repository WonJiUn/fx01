package hbox_vbox;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

//${javafxCompControls}
public class Ex01 extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		
		HBox hBox = new HBox(); //가로로 배치됨
		Button btn1 = new Button("btn1");
		Button btn2 = new Button("btn2");
		Button btn3 = new Button("btn3");
		
		VBox vBox = new VBox(); //세로로 배치됨
		Label lb1 = new Label("lb1");
		Label lb2 = new Label("lb2");
		Label lb3 = new Label("lb3");
		
		vBox.getChildren().addAll(lb1,lb2,lb3);
		vBox.setSpacing(20);
		
		hBox.getChildren().addAll(btn1,btn2,btn3,vBox); //vbox를 만들어서 hbox에 넣음
		hBox.setSpacing(20); //사이 간격 조절
		
		
		
		arg0.setScene(new Scene(hBox,300,300));
		arg0.show();
		
	}
	public static void main(String[] args) {
		launch(args);
		
	}

}
