package com.example.myapp;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class VBoxApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        VBox root = new VBox(); //Parent 하위 객체 VBOX생성
        root.setPrefWidth(300); //폭
        root.setPrefHeight(150); // 높이
        root.setAlignment(Pos.CENTER); // 컨트롤 가운데 정렬

        Label label = new Label(); // 라벨 컨트롤 생성
        label.setText("Java FX"); // text 설정
        label.setFont(new Font(30)); // font 설정

        root.getChildren().add(label); //VBOX의 자식으로 label추가

        Scene scene = new Scene(root); // VBOX를 루트 컨테이너로 하는 Scene 생성
        primaryStage.setScene(scene); // Stage에 Scene할당
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
