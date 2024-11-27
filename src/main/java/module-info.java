module org.example.t4_interfaces {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.t4_interfaces to javafx.fxml;
    exports org.example.t4_interfaces;
}