package org.example.t4_interfaces;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class EscenasController {
String texto = "";
    @FXML
    private AnchorPane ap1;

    @FXML
    private Button b1;

    @FXML
    private Label l1;
    @FXML
    private Label l21;

    @FXML
    private TextField tf1;

    @FXML
    void irAEscena2(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("escena2.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        EscenasController controlador = fxmlLoader.getController();
        controlador.l12.setText(tf1.getText());

        Stage stage = (Stage) b1.getScene().getWindow();
        stage.setScene(scene);
    }
    @FXML
    private AnchorPane ap2;

    @FXML
    private Button b2;

    @FXML
    private Label l2;

    @FXML
    private Label l12;

    @FXML
    private TextField tf2;

    @FXML
    void irAEscena1(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("escena1.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        EscenasController controlador = fxmlLoader.getController();
        controlador.l21.setText(tf2.getText());
        Stage stage = (Stage) b2.getScene().getWindow();
        stage.setScene(scene);

    }

}
