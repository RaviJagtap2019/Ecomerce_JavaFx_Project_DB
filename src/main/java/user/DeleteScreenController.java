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

public class DeleteScreenController {
		
	
	@FXML
	TextField Name;
	
	@FXML
	Label status;
	
	public void deleteUsercall() throws SQLException {
		
		String url="jdbc:mysql://127.0.0.1:3306/ecom_project";
		String username="root";
		String password="Ravi@2005";
		
		Connection connection=DriverManager.getConnection(url,username,password);
		Statement statement =connection.createStatement();
		
		String query="SELECT * from ecom_project.add_user WHERE name='"+Name.getText()+"'";
		ResultSet result=statement.executeQuery(query);
		
		if(result.next()) {
			String remove="DELETE from ecom_project.add_user WHERE name='"+Name.getText()+"'";
			statement.execute(remove);
			status.setTextFill(Color.GREEN);
			status.setText("User Deleted Sucsessfully");
			
		}else {
			status.setTextFill(Color.RED);
			status.setText("User Not Found");
		}
		
	}
}
