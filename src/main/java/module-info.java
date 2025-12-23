module org.t3tracon.sepet {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens org.t3tracon.sepet to javafx.fxml;
    exports org.t3tracon.sepet;
}