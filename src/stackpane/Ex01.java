package stackpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

//${javafxCompControls}
public class Ex01 extends Application {
//stackpane : 중첩해서 만드는 것
	@Override
	public void start(Stage arg0) throws Exception {
		StackPane sp = new StackPane();
		sp.getChildren().addAll(new Rectangle(100,100,Color.WHITE), new Label("Go!"));
		//다른 설정이 없으면 가운데에 하얀색 정사각형이 만들어진다
		
		arg0.setScene(new Scene(sp,300,250));
		arg0.show();
		
		
	}
	public static void main(String[] args) {
		launch(args);
	}

}
