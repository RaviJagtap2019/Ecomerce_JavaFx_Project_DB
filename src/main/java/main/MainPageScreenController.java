package main;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainPageScreenController {
	public void productManagementCall() throws IOException {
		Stage stage=new Stage();
		
		stage.setTitle("Product Management");
		
		Parent actorGroup=FXMLLoader.load(getClass().getResource("/ProductManagement.fxml"));
		Scene scene=new Scene(actorGroup,600,400);
		stage.setScene(scene);
		
		stage.show();
	}
	public void userManagementCall() throws IOException {
		Stage stage=new Stage();
		
		stage.setTitle("User Management");
		
		Parent actorGroup=FXMLLoader.load(getClass().getResource("/UserManagement.fxml"));
		Scene scene=new Scene(actorGroup,600,400);
		stage.setScene(scene);
		
		stage.show();
	}
	
	
}
