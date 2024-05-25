module com.boomexs.threads {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.boomexs.threads to javafx.fxml;
    exports com.boomexs.threads;
}