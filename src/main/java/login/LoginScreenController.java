package login;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class LoginScreenController  {
		
	@FXML
	TextField loginName;
	
	@FXML 
	TextField password;
	
	@FXML
	Label errorMassage;
	
	public void loginButtonClick() throws SQLException, IOException{
		
				String url="jdbc:mysql://127.0.0.1:3306/ecom_project";
				String sqlname="root";
				String sqlpassword="Ravi@2005";
		
				Connection connection = DriverManager.getConnection(url,sqlname,sqlpassword);
		
				Statement statement = connection.createStatement();
		
				String query = "Select * from ecom_project.login where username = '" + loginName.getText() + "'and password = '"
						+ password.getText() + "';";
		
				ResultSet result = statement.executeQuery(query);
		
				if (result.next()) {
				
				 errorMassage.setTextFill(Color.GREEN);
				 errorMassage.setText("Login Successful");
				 Stage stage=new Stage();
					
					stage.setTitle("Main Page");
					
					Parent actorGroup=FXMLLoader.load(getClass().getResource("/MainPage.fxml"));
					Scene scene=new Scene(actorGroup,600,400);
					stage.setScene(scene);
					
					stage.show();
					
				}else {
					
				errorMassage.setTextFill(Color.RED);	
			
				errorMassage.setText("Login Failed....!");
			
		}
	}
}	 
	

