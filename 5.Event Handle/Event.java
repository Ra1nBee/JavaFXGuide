package application.myapp;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Event extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        HBox root = new HBox();
        root.setPrefSize(200,50);
        root.setAlignment(Pos.CENTER); //중앙 정렬
        root.setSpacing(20);

        Button btn1 = new Button("버튼1");
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                System.out.println("버튼 1 클릭되었습니다.");
            }
        });

        Button btn2 = new Button("버튼 2");
        btn2.setOnAction(event -> System.out.println("버튼 2 클릭되었습니다."));

        root.getChildren().addAll(btn1,btn2); //HBOX 에 버튼 1, 2 추가

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setOnCloseRequest(event -> System.out.println("프로그램 종료"));
        primaryStage.show();
    }
}
