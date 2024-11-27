package org.example.t4_interfaces;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class loginHelloController {
    boolean volver = false;
    @FXML
    private Button b1;

    @FXML
    private CheckBox cb1;

    @FXML
    private GridPane g1;

    @FXML
    private HBox hb1;

    @FXML
    private Label l1;

    @FXML
    private Label l2;

    @FXML
    private Label l3;

    @FXML
    private Label l4;

    @FXML
    private TextField labelV;

    @FXML
    private PasswordField pf1;

    @FXML
    private TextField tf1;

    @FXML
    private VBox vbox1;

    @FXML
    void comprobar(KeyEvent event) {
           if(!pf1.getText().isEmpty()&&!tf1.getText().isEmpty()){
            b1.setDisable(false);
           }else{
               b1.setDisable(true);
           }
    }

    @FXML
    void eventButton(ActionEvent event) {

    }

    @FXML
    void eventCheck(ActionEvent event) {
        if(cb1.isSelected()) {

            labelV.setDisable(false);
            pf1.setDisable(true);
            labelV.setText(pf1.getText());
            pf1.setText("");
            volver = true;

        }else if(!cb1.isSelected()){
            labelV.setDisable(true);
            pf1.setDisable(false);
            pf1.setText(labelV.getText());

        }


    }

}


