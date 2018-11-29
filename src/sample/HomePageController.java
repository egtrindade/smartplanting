package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HomePageController {

    public void changeScreenManagerPressed(ActionEvent event) throws Exception{
            Parent managerMenuParent = FXMLLoader.load(getClass().getResource("/sample/managerMenu.fxml"));
            Scene managerMenuScene = new Scene(managerMenuParent);
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(managerMenuScene);
            window.show();
    }
}
