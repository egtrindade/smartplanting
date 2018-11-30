package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ManagerMenuController {

    public void changeScreenHomePagePressed(ActionEvent event) throws Exception {
        Parent homePageParent = FXMLLoader.load(getClass().getResource("/sample/homePage.fxml"));
        Scene homePageScene = new Scene(homePageParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(homePageScene);
        window.show();
    }

    public void changeScreenSettingsPressed(ActionEvent event) throws Exception {
        Parent settingsParent = FXMLLoader.load(getClass().getResource("/sample/settings.fxml"));
        Scene settingsScene = new Scene(settingsParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(settingsScene);
        window.show();
    }

    public void changeScreenDroneReportsPressed(ActionEvent event) throws Exception {
        Parent droneReportsParent = FXMLLoader.load(getClass().getResource("/sample/droneReports.fxml"));
        Scene droneReportsScene = new Scene(droneReportsParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(droneReportsScene);
        window.show();
    }

    public void changeScreenSoilQualityReportsPressed(ActionEvent event) throws Exception {
        Parent soilQualityReportsParent = FXMLLoader.load(getClass().getResource("/sample/soilQualityReports.fxml"));
        Scene soilQualityReportsScene = new Scene(soilQualityReportsParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(soilQualityReportsScene);
        window.show();
    }
}
