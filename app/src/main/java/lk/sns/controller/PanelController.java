package lk.sns.controller;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class PanelController{

	@FXML
	private ImageView btnClose;
	
	@FXML
	private TextField txtNetworkId;
	@FXML
	private TextField txtUsername;
	@FXML
	private TextField txtPassword;
	

	@FXML
	public void btnCloseEvent() {
		System.out.println("Close button clicked");
		System.exit(0);
		
	}
	@FXML
	public void btnSaveEvent() {
		System.out.println("Save button clicked");
	
		
	}
	@FXML
	public void btnEditEvent() {
		System.out.println("Edit button clicked" +txtNetworkId.getText());
		
		
	}

}
