package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ManagerMenuController {
    public void changeScreenHomePagePressed(ActionEvent event) throws Exception{
        Parent homePageParent = FXMLLoader.load(getClass().getResource("/sample/homePage.fxml"));
        Scene homePageScene = new Scene(homePageParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(homePageScene);
        window.show();
    }
}
