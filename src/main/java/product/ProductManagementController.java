package product;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ProductManagementController extends Application {
		public static void main(String[] args) {
			Application.launch(args);
			
		}
		
		@Override
		public void start(Stage stagecreatedByJavaFx) throws IOException {
			Stage stage=new Stage();
			
			stage.setTitle("Product Management");
			
			Parent actorGroup=FXMLLoader.load(getClass().getResource("/ProductManagement.fxml"));
			Scene scene=new Scene(actorGroup,600,400);
			stage.setScene(scene);
			
			stage.show();
			
		}
		public void addProductcall() throws IOException {
			Stage stage=new Stage();
			
			stage.setTitle("Add Product");
			
			Parent actorGroup=FXMLLoader.load(getClass().getResource("/AddProduct.fxml"));
			Scene scene=new Scene(actorGroup,600,400);
			stage.setScene(scene);
			
			stage.show();
		}
		
		public void searchProductcall() throws IOException {
			Stage stage=new Stage();
			stage.setTitle("Search Product");
			
			Parent actorGroup=FXMLLoader.load(getClass().getResource("/SearchProduct.fxml"));
			Scene scene=new Scene(actorGroup);
			stage.setScene(scene);
			
			stage.show();
		}
		
		public void deleteProductcall() throws IOException {
			Stage stage =new Stage();
			stage.setTitle("Delete Product");
			
			Parent actorGroup=FXMLLoader.load(getClass().getResource("/DeleteProduct.fxml"));
			Scene scene=new Scene(actorGroup);
			
			stage.setScene(scene);
			
			stage.show();
		}

}