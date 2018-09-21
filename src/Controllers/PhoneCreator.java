package Controllers;

import javafx.fxml.FXML;
        import javafx.scene.control.Button;
        import javafx.scene.control.ChoiceBox;
        import javafx.scene.control.Slider;
        import javafx.scene.control.TextField;

public class PhoneCreator {

    @FXML
    private Slider memorySlider;

    @FXML
    private TextField priceChoiceBox;

    @FXML
    private TextField rearCameraChoiceBox;

    @FXML
    private TextField frontCameraChoiceBox;

    @FXML
    private TextField screenSizeChoiceBox;

    @FXML
    private TextField modelTextField;

    @FXML
    private ChoiceBox<String> makeChoiceBox;

    @FXML
    private ChoiceBox<String> osChoiceBox;

    @FXML
    private Button imageButton;

    @FXML
    private Button saveButton;

}