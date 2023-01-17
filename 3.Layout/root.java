package application.myapp;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class root extends Application {

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        HBox hbox = new HBox(); //HBOX 컨테이너 생성
        TextField textField = new TextField(); // TextField 컨트롤 생성
        textField.setPrefWidth(100); // TextField 폭 설정

        ObservableList list = hbox.getChildren(); // HBOX의 ObservableList 얻기
        list.add(textField); // TextField 컨트롤 배치

        Scene scene = new Scene(hbox); // Scene 생성
        primaryStage.setScene(scene); // stage에 Scene 할당
        primaryStage.show();
    }
}
