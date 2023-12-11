module com.example.lat1mod6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lat1mod6 to javafx.fxml;
    exports com.example.lat1mod6;
}