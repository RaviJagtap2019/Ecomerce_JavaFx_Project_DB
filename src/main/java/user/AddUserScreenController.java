package user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class AddUserScreenController {
	@FXML
	TextField id;
	
	@FXML
	TextField name;
	
	@FXML
	TextField email;
	
	@FXML
	TextField password;
	
	@FXML
	Label errormassage;
	
	public void enterButtonclick() throws SQLException{
		
		String url="jdbc:mysql://127.0.0.1:3306/ecom_project";
		String sqlname="root";
		String sqlpassword="Ravi@2005";

		Connection connection = DriverManager.getConnection(url,sqlname,sqlpassword);

		Statement statement = connection.createStatement();

		String query="INSERT INTO `ecom_project`.`add_user`\n"
				+"( id,name,email,password)\n"
				+"VALUES('"+id.getText()+"','"+name.getText()+"','"+email.getText()+"','"+password.getText()+"')";
		statement.execute(query);
		
		errormassage.setTextFill(Color.GREEN);
		errormassage.setText("User Added Sucseesfully");
	
		
		
	}
		
}

