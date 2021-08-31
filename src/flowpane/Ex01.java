package flowpane;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

//클래스 파일에서 우클릭 - properties - 클래스파일명 더블클릭 아큐먼츠 - vm아규먼츠에 ${javafxCompControls} 등록

public class Ex01 extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		//FlowPane flowPane = new FlowPane();		//컨테이너 종류중에 하나. 기본 가로로 배치
		FlowPane flowPane = new FlowPane(Orientation.VERTICAL); //세로배치
		/*
		Button btn01 = new Button("버튼01");
		Button btn02 = new Button("버튼02");
		Button btn03 = new Button("버튼03");
		
		flowPane.getChildren().add(btn01);
		flowPane.getChildren().add(btn02);
		flowPane.getChildren().add(btn03);
		*/
		
		for(int i = 1; i <=15; i++) {
			flowPane.getChildren().add(new Button("버튼0" + i));
		}
		//위의 코드를 반복문으로 동작하게
		
		flowPane.setPadding(new Insets(10,10,10,10));
		//padding : 안쪽으로 여백을 준다.    위, 오, 아, 왼
		
		flowPane.setVgap(80); 	//버튼 사이 위아래
		flowPane.setHgap(10);	//버튼 사이 오른쪽왼쪽
		
		Scene sc = new Scene(flowPane, 200, 100);
		
		arg0.setScene(sc);
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
	
}

