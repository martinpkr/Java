module com.example.streams {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.streams to javafx.fxml;
    exports com.example.streams;
}