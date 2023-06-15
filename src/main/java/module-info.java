module com.example.chessjava {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.chessjava to javafx.fxml;
    exports com.example.chessjava;
}