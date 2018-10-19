package Controllers;

import Models.DBConnect;
import Models.MobilePhone;
import Views.SceneChanger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class EditPhoneViewController implements Initializable, ControllerClass {

    @FXML
    private Label makeLabel;

    @FXML
    private Label modelLabel;

    @FXML
    private Label memoryLabel;

    @FXML
    private Label osLabel;



    private MobilePhone activePhone;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    /**
     * This method receives a MobilPhone object and updates the display with it
     * @param phone
     */
    public void loadPhone(MobilePhone phone)
    {
        activePhone = phone;
        updateView();
    }

    public void updateView()
    {
        makeLabel.setText(activePhone.getMake());
        modelLabel.setText(activePhone.getModel());
        memoryLabel.setText(String.format("%.0f", activePhone.getMemory()));
        osLabel.setText(activePhone.getOs());
    }

    @FXML
    public void changeToTableView(ActionEvent event) throws IOException {
        SceneChanger.changeScenes(event, "TableOfPhonesView.fxml", "Phones");
    }
}
