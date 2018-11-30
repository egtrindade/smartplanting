package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import javafx.scene.input.InputEvent;

public class ManagerLoginController {

    @FXML
    private TextField managerKey;

    @FXML
    private Label wrongKey;

    public void changeScreenEnterButtonPressed(ActionEvent event) throws Exception {
        if (managerKey.getText().equals("H42WX")){
            Parent managerMenuParent = FXMLLoader.load(getClass().getResource("/sample/managerMenu.fxml"));
            Scene managerMenuScene = new Scene(managerMenuParent);
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setScene(managerMenuScene);
            window.show();
        } else {
            wrongKey.setText("Chave Incorreta");
        }
    }

    public void changeScreenEnterKeyPressed(KeyEvent event) throws Exception {
        if(event.getCode() == KeyCode.ENTER) {
            if (managerKey.getText().equals("H42WX")) {
                Parent managerMenuParent = FXMLLoader.load(getClass().getResource("/sample/managerMenu.fxml"));
                Scene managerMenuScene = new Scene(managerMenuParent);
                Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                window.setScene(managerMenuScene);
                window.show();
            } else {
                wrongKey.setText("Chave Incorreta");
            }
        }
    }

    public void changeScreenHomePagePressed(ActionEvent event) throws Exception {
        Parent homePageParent = FXMLLoader.load(getClass().getResource("/sample/homePage.fxml"));
        Scene homePageScene = new Scene(homePageParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(homePageScene);
        window.show();
    }
}
