package product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.xdevapi.Result;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class AddProductScreenController {
		
	
	@FXML
	TextField ProductId;
	
	@FXML
	TextField ProductName;
	
	@FXML
	TextField ProductPrice;
	
	@FXML
	TextField ProductQuantity;
	
	@FXML
	Label errormassage;
	
	public void EnterButtonClick() throws SQLException{
		String url="jdbc:mysql://127.0.0.1:3306/ecom_project";
		String sqlname="root";
		String sqlpassword="Ravi@2005";

		Connection connection = DriverManager.getConnection(url,sqlname,sqlpassword);

		Statement statement = connection.createStatement();

		String query="INSERT INTO `ecom_project`.`add_product`\n"
				+"( id,name,price,quantity)\n"
				+"VALUES('"+ProductId.getText()+"','"+ProductName.getText()+"','"+ProductPrice.getText()+"','"+ProductQuantity.getText()+"')";
		statement.execute(query);
		errormassage.setTextFill(Color.GREEN);
		errormassage.setText("    Product Added Sucssesfully");
		
		
	}
}
