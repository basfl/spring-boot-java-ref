package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MainController {
	@FXML
	private Label status;
	@FXML
	private TextField username;
	@FXML
	private TextField password;
	public void login(ActionEvent e) throws IOException {
		System.out.println("**************8");
		if(username.getText().equals("user")&&password.getText().equals("pass")) {
			status.setText("Login Success");
			Stage primaryStage=new Stage();
			Parent root = FXMLLoader.load(
					getClass().getResource("/application/Main.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		}else {
			status.setText("failed");
		}
	}
	

	


}
