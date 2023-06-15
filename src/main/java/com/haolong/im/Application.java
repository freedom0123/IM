package com.haolong.im;

import com.haolong.im.view.Login;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        Login login = new Login();
        login.show();
    }

    public static void main(String[] args) {
        launch();
    }
}