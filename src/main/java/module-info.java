module com.example.gitmerging {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gitmerging to javafx.fxml;
    exports com.example.gitmerging;
}