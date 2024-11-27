package org.example.t4_interfaces;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class CalculadoraController {
    String operacion = "";
    double resultado12 = 0;
    String num1 = "";
    String num2 = "";
    boolean concatenaSegundoNum = false;
    int resultado1 = 0;
    boolean hapulsadoifual = false;
    boolean haypulsadooperacion = false;


    @FXML
    private Button C;

    @FXML
    private Button X;

    @FXML
    private Button apagar;

    @FXML
    private Button b0;

    @FXML
    private Button b1;

    @FXML
    private Button b2;

    @FXML
    private Button b3;

    @FXML
    private Button b4;

    @FXML
    private Button b5;

    @FXML
    private Button b6;

    @FXML
    private Button b7;

    @FXML
    private Button b8;

    @FXML
    private Button b9;

    @FXML
    private Button dividir;

    @FXML
    private GridPane gp;

    @FXML
    private Button igual;

    @FXML
    private Button mas;

    @FXML
    private Button menos;

    @FXML
    private TextField tf;

    @FXML
    private VBox vb;

    @FXML
    void apagar(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("calculadora.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 475);
        Stage stage = (Stage) b1.getScene().getWindow();
        stage.setScene(scene);
        stage.close();
    }

    @FXML
    void pulsar(ActionEvent event) {
        if(hapulsadoifual){
            tf.setText("");
        }
        hapulsadoifual=false;
        Button button = (Button) event.getSource();
        if (button.getText().equals("C")) {
            tf.setText("");
        } else if (button.getText().equals("+")) {
            operacion = "+";
            concatenaSegundoNum = true;
            haypulsadooperacion = true;
        } else if (button.getText().equals("X")) {
            operacion = "X";
            concatenaSegundoNum = true;
            haypulsadooperacion = true;
        } else if (button.getText().equals("/")) {
            operacion = "/";
            concatenaSegundoNum = true;
            haypulsadooperacion = true;
        } else if (button.getText().equals("-")) {
            operacion = "-";
            concatenaSegundoNum = true;
            haypulsadooperacion = true;
        } else if (button.getText().equals("=")) {
            concatenaSegundoNum = false;
            hapulsadoifual=true;
            haypulsadooperacion = false;
            if (operacion.equals("+")) {
                resultado1 = Integer.parseInt(num1) + Integer.parseInt(num2);
                tf.setText((String.valueOf(resultado1)));

            } else if (operacion.equals("/")) {

                resultado12 = (double) Integer.parseInt(num1) / (double) Integer.parseInt(num2);
                resultado1= Integer.parseInt(num1) / Integer.parseInt(num2);
                if(Integer.parseInt(num1) % Integer.parseInt(num2)==0){
                    tf.setText(String.valueOf(resultado1));
                }else {
                    tf.setText((String.valueOf(resultado12)));
                }
            } else if (operacion.equals("-")) {
                resultado1 = Integer.parseInt(num1) - Integer.parseInt(num2);
                tf.setText((String.valueOf(resultado1)));

            } else if (operacion.equals("X")) {
                resultado1 = Integer.parseInt(num1) * Integer.parseInt(num2);
                tf.setText((String.valueOf(resultado1)));

            }


        } else {

            if(haypulsadooperacion){
                tf.setText("");
                haypulsadooperacion = false;
            }


            if (concatenaSegundoNum) {
                tf.setText(tf.getText() + button.getText());
                num2 = tf.getText();

            } else {
                tf.setText(tf.getText() + button.getText());
                num1 = tf.getText();

            }
        }

    }
}


