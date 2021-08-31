package quiz;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

//팬 위에 팬을 올릴 수 있다는것을 이용해 문제풀기
public class Quiz01 extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		
		Button menu = new Button("메뉴 나열");
		Button center = new Button("내용 들어가는 곳");
		Button bottom = new Button("바닥글 들어가는 곳");
		Button id = new Button("아이디 입력");
		Button pwd = new Button("비밀번호 입력");
		Button login = new Button("로그인");
		
		Label lb = new Label("메뉴  홈  로그인");
		
		FlowPane fp1 = new FlowPane();
		fp1.getChildren().addAll(lb);
		fp1.setStyle("-fx-background-color:pink;");
		fp1.setPadding(new Insets(10,10,10,350));
		//fp1.setPrefSize(20, 20);
		
		FlowPane fp2 = new FlowPane();
		fp2.getChildren().addAll(menu);
		fp2.setStyle("-fx-background-color:skyblue;");
		fp2.setPrefSize(80, 20);
		
		FlowPane fp3 = new FlowPane();
		fp3.getChildren().addAll(center);
		fp3.setStyle("-fx-background-color:#CEF279;");
		//fp3.setPrefSize(80, 0);
		fp3.setAlignment(Pos.TOP_CENTER);
		
		FlowPane fp4 = new FlowPane();
		fp4.getChildren().addAll(bottom);
		fp4.setStyle("-fx-background-color:brown;");
		fp4.setAlignment(Pos.CENTER);
		
		GridPane gridpane = new GridPane();
		gridpane.add(id, 0, 0);
		gridpane.add(pwd, 0, 1);
		gridpane.add(login, 1, 0, 1, 2);
		gridpane.setPadding(new Insets(20,20,0,20));
		gridpane.setStyle("-fx-background-color:yellow;");
		
		
		id.setPrefSize(100, 20);
		pwd.setPrefSize(100, 20);
		login.setPrefSize(70, 45);
		
		BorderPane bp = new BorderPane();
		bp.setTop(fp1);
		bp.setCenter(fp3);
		bp.setBottom(fp4);
		bp.setRight(gridpane);
		bp.setLeft(fp2);
		
		
		
		
		//arg0.setResizable(false);
		arg0.setScene(new Scene(bp,450,200));
		arg0.setTitle("Quiz");
		arg0.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}

}
