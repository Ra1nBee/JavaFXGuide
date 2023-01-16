package com.example.myapp;

import javafx.application.Application;
import javafx.stage.Stage;

public class ThreadTest extends Application {

    public ThreadTest(){
        System.out.println(Thread.currentThread().getName()+": 생성자 호출");
    }
    @Override
    public void init(){
        System.out.println(Thread.currentThread().getName()+": init() 호출");
    }
    @Override
    public void start(Stage primaryStage) {
        System.out.println(Thread.currentThread().getName()+": start() 호출");
        primaryStage.show();
    }
    @Override
    public void stop(){
        System.out.println(Thread.currentThread().getName()+": stop() 호출");
    }
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+": main() 호출");
        launch(args);
    }
}
