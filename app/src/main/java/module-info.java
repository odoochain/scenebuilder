module app {

    opens com.oracle.javafx.scenebuilder.app.welcomedialog to javafx.fxml;

    requires java.desktop;
    requires java.logging;
    requires java.prefs;
    requires javax.json.api;
    requires javafx.base;
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.web;
    requires kit;
    exports com.oracle.javafx.scenebuilder.app;
    exports com.oracle.javafx.scenebuilder.app.welcomedialog;
}
//Unable to make field private javafx.scene.layout.BorderPane com.oracle.javafx.scenebuilder.app.welcomedialog.WelcomeDialogWindowController.contentPane accessible: module app does not "opens com.oracle.javafx.scenebuilder.app.welcomedialog" to module javafx.fxml