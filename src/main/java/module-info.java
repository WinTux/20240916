module com.pepe {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    opens com.pepe.principal to javafx.fxml;
    exports com.pepe.principal;
}