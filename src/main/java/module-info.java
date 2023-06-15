module com.haolong.im {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.haolong.im to javafx.fxml;
    exports com.haolong.im;
}