package org.example.t4_interfaces;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class EscenasInstalarController {

    @FXML
    private Button Bottoncancel1;

    @FXML
    private Button bcerrar1;

    @FXML
    private Button bottonOk;

    @FXML
    private ComboBox<?> cb;

    @FXML
    private ImageView imagen1;

    @FXML
    private Label labelidiomas;

    @FXML
    private Label labeltitulo1;
    @FXML
    void cancelar(ActionEvent event) {

    }
    @FXML
    public void initialize(){

    }
    @FXML
    void cerrarpag(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("calculadora.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 475);
        Stage stage = (Stage) bcerrar1.getScene().getWindow();
        stage.setScene(scene);
        stage.close();

    }

    @FXML
    void continuar(ActionEvent event) {

    }

}
