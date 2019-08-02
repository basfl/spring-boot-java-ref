package com.demo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloWorld extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
//		Button exit = new Button("exit");
//		// lambda expression
//		exit.setOnAction(e -> {
//			System.out.println("exiting!!");
//			System.exit(0);
//		});
//		Button btn = new Button("click me!!");
//		btn.setOnAction(new EventHandler<ActionEvent>() {
//
//			@Override
//			public void handle(ActionEvent event) {
//				System.out.println("Hello World!!!");
//
//			}
//		});
		// StackPane root = new StackPane(); // layout
		Parent root = FXMLLoader.load(
				getClass().getClassLoader().getResource("Main.fxml"));
		// VBox root = new VBox(); // vertical box layout
		// root.getChildren().addAll(btn, exit);// layout
		Scene scene = new Scene(root); // scene
		primaryStage.setScene(scene); // scene
		primaryStage.setTitle("Demo");
		primaryStage.show();

	}

}
