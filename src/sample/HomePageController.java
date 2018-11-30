package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HomePageController {

    public void changeScreenManagerPressed(ActionEvent event) throws Exception {
            Parent loginManagerParent = FXMLLoader.load(getClass().getResource("/sample/managerLogin.fxml"));
            Scene loginManagerScene = new Scene(loginManagerParent);
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(loginManagerScene);
            window.show();
    }
}
