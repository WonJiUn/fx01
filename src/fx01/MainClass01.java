package fx01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MainClass01 extends Application {
	public static void main(String[] args) {
		
		launch(args);
		
		
	}

	@Override
	public void start(Stage arg0) throws Exception {
		
		Label lb = new Label("Hello World!!");
		lb.setFont(new Font(20));
		
		Scene scene = new Scene(lb, 200, 100);	//장판 위에 글씨(라벨)를 쓰고
		//lb뒤에 있는거는 창(장판)의 가로세로 크기
		//scene은 하나의 장판에 한개만 넣을 수 있기 때문에 보통 컨테이너를 쌓아서 등록하는 식으로 사용
		
		arg0.setScene(scene); 			//무대 위에 올림
		arg0.setTitle("연습중");
		arg0.show();					//무대
		
	}
}
