package imageview;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

//${javafxCompControls}

public class Ex01 extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		AnchorPane ap = new AnchorPane();
		ImageView iv = new ImageView("/img/smilerere.png");
		//iv.setImage(new Image("/img/calendar.png")); //둘중 아무 방식이나 사용하면됨
		
		//iv.setFitHeight(100);
		iv.setFitWidth(50);
		iv.setPreserveRatio(true); //이미지 크기 가로세로중 하나만 설정하면 나머지 하나는 자동으로 맞춰짐
		
		iv.setRotate(45); //이미지를 45도 회전시킨다
		
		ap.getChildren().add(iv);
		
		arg0.setScene(new Scene(ap,300,200));
		arg0.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}

}
