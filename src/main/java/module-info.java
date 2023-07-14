module com.example.individualproject_10923638 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.individualproject_10923638 to javafx.fxml;
    exports com.example.individualproject_10923638;
}