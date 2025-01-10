package user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class SearchUserScreenController {
	
	@FXML
	TextField Name;
	
	@FXML
	Label status;
	
	public void searchUsercall() throws SQLException {
		String url="jdbc:mysql://127.0.0.1:3306/ecom_project";
		String name="root";
		String password="Ravi@2005";
		
		Connection connection=DriverManager.getConnection(url,name,password);
		
		Statement statement=connection.createStatement();
		
		String query="SELECT * from `ecom_project`.`add_user` where name='"+Name.getText()+"';";
		
		ResultSet result=statement.executeQuery(query);
		
		if(result.next()) {
			status.setTextFill(Color.GREEN);
			status.setText("User has been found...");
		}else {
			status.setTextFill(Color.RED);
			status.setText("User has not found..!");
		}
		
		
	}
}
