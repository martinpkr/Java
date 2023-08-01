module com.example.firstguiproject {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.firstguiproject to javafx.fxml;
    exports com.example.firstguiproject;
}