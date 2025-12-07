module org.example.exception {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens org.example.exception to javafx.fxml;
    exports org.example.exception;
}