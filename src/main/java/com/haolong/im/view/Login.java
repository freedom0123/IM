package com.haolong.im.view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * @project: IM
 * @description:
 * @author: haolong
 * @data: 2023/6/15 14:26
 */
@Slf4j
public class Login extends Stage {
    // 需要加载的资源
    private static final String RESOURCE = "fxml/login/login.fxml";

    private Parent root;

    public Login() {
        URL resource = Login.class.getClassLoader().getResource(RESOURCE);
        if (resource == null) {
            log.error("Login.Login,获取到的参数为空");
        }
        try {
            root = FXMLLoader.load(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene scene = new Scene(root);
        scene.setFill(Color.TRANSPARENT);
        setScene(scene);
        initStyle(StageStyle.TRANSPARENT);
        setResizable(false);
        this.getIcons().add(new Image("fxml/login/img/logo.png"));
    }
}
