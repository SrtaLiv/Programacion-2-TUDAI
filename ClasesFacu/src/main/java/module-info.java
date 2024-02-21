module org.example.clases {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.clases to javafx.fxml;
    exports org.example.clases;
}