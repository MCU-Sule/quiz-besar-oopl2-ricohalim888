module com.rico.quiz2_pbo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.rico.quiz2_pbo to javafx.fxml;
    exports com.rico.quiz2_pbo;
    exports com.rico;
    opens com.rico to javafx.fxml;
}