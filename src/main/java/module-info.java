module com.vortex.vortex {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.vortex.vortex to javafx.fxml;
    exports com.vortex.vortex;
}