package Views;

import Controllers.ControllerClass;
import Controllers.EditPhoneViewController;
import Models.MobilePhone;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneChanger {

    /**
     * This method will load the new FXML page and change to that scene
     */
    public static void changeScenes(ActionEvent event, String viewName, String title) throws IOException {
        Parent root = FXMLLoader.load(new Object(){}.getClass().getResource(viewName));
        Scene scene = new Scene(root);

        //get the stage from the ActionEvent
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle(title);
        stage.show();
    }

    /**
     * This method will change scenes and allow for a MobilePhone object to be passed
     * into the scene
     */
    public static void changeScenes(ActionEvent event, String viewName, String title,
                                    MobilePhone phone) throws IOException
    {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(new Object(){}.getClass().getResource(viewName));
        Parent root = loader.load();

        Scene tableViewScene = new Scene(root);

        //access the controller and call a method
        ControllerClass controller = loader.getController();
        controller.loadPhone(phone);

        //This line gets the Stage information
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();

        stage.setScene(tableViewScene);
        stage.setTitle(title);
        stage.show();
    }

}
