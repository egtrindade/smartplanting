package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class EmployeeMenuController {

    public void changeScreenHomePagePressed(ActionEvent event) throws Exception {
        Parent homePageParent = FXMLLoader.load(getClass().getResource("/sample/homePage.fxml"));
        Scene homePageScene = new Scene(homePageParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(homePageScene);
        window.show();
    }

    public void changeIdealSoilQualityRepPressed(ActionEvent event) throws Exception {
        Parent idealSoilQualityRepParent = FXMLLoader.load(getClass().getResource("/sample/idealSoilQualityRep.fxml"));
        Scene idealSoilQualityRepScene = new Scene(idealSoilQualityRepParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(idealSoilQualityRepScene);
        window.show();
    }

    public void changeScreenAgrotoxicRepPressed(ActionEvent event) throws Exception {
        Parent agrotoxicRepParent = FXMLLoader.load(getClass().getResource("/sample/agrotoxicRep.fxml"));
        Scene agrotoxicRepScene = new Scene(agrotoxicRepParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(agrotoxicRepScene);
        window.show();
    }
}
