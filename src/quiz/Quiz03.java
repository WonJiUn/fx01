package quiz;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

//${javafxCompControls}
public class Quiz03 extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		
		Button center = new Button("내용 들어가는 곳");
		Button bottom = new Button("바닥글 들어가는 곳");
		Button id = new Button("아이디 입력");
		Button pw = new Button("비밀번호 입력");
		Button login = new Button("로그인");
		
		
		ImageView iv = new ImageView("/img/quiz.jpg");
		
		//탑
		FlowPane top = new FlowPane();
		top.getChildren().addAll(new Label("메뉴   홈   로그인"));
		top.setStyle("-fx-background-color:pink;");
		top.setPadding(new Insets(10,10,10,250));
		
		//바텀
		FlowPane bot = new FlowPane();
		bot.getChildren().addAll(bottom);
		bot.setAlignment(Pos.CENTER);
		bot.setMaxWidth(450);
	
		//우측
		GridPane gridpane = new GridPane();
		gridpane.add(id, 0, 0);
		gridpane.add(pw, 0, 1);
		gridpane.add(login, 1, 0, 1, 2);
		gridpane.setPadding(new Insets(20,20,0,20));
		id.setPrefSize(100, 20);
		pw.setPrefSize(100, 20);
		login.setPrefSize(70, 45);
		
		//좌측
		AnchorPane ap = new AnchorPane(); //앵커팬 -> 리스트 -> 플로우팬
		
		ListView<String> listView = new ListView<String>();
		listView.getItems().addAll("item1","item2","item3");
		listView.setMaxSize(100, 100);
		ap.getChildren().addAll(listView);
		
		FlowPane left = new FlowPane(ap);
		left.setMaxWidth(100);
		
		
		//가운데
		FlowPane ctr = new FlowPane();
		ctr.getChildren().addAll(center);
		ctr.setMaxSize(100, 200);
		ctr.setMaxWidth(100);
		ctr.setAlignment(Pos.TOP_RIGHT);
		
		BorderPane bp = new BorderPane();
		bp.getChildren().add(iv);
		bp.setCenter(ctr);
		bp.setBottom(bot);
		bp.setLeft(left);
		bp.setRight(gridpane);
		bp.setTop(top);
		
		arg0.setResizable(false);
		arg0.setScene(new Scene(bp,400,200));
		arg0.setTitle("Quiz");
		arg0.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}

}
