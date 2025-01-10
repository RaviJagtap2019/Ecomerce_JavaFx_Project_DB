package product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class SearchProductScreenController {
	
	@FXML
	TextField Name;
	
	@FXML
	Label status;
	
	public void searchProductcall() throws SQLException {
		String url="jdbc:mysql://127.0.0.1:3306/ecom_project";
		String name="root";
		String password="Ravi@2005";
		
		Connection connection=DriverManager.getConnection(url,name,password);
		
		Statement statement=connection.createStatement();
		
		String query="SELECT * from `ecom_project`.`add_product` where name='"+Name.getText()+"';";
		
		ResultSet result=statement.executeQuery(query);
		
		if(result.next()) {
			status.setTextFill(Color.GREEN);
			status.setText("Product has been found...");
		}else {
			status.setTextFill(Color.RED);
			status.setText("Product has not found..!");
		}
		
		
	}
}
