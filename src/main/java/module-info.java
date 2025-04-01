module com.codedotorg {
    requires transitive javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;
    opens com.codedotorg to javafx.fxml;
    exports com.codedotorg;
}
