package controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Controller_1 {
    Stage j1=new Stage();
    Stage j2=new Stage();
    Stage j3=new Stage();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    void jihoz1(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/fxmls/jihoz1.fxml"));

        j1.setTitle("Mehmonhona_jihozlari ");

        j1.setScene(new Scene(root, 600, 400));
        j1.show();
        ((Node)(event.getSource())).getScene().getWindow().hide();
    }

    @FXML
    void jihoz2(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/fxmls/jihoz2.fxml"));

        j2.setTitle("Mehmonhona_jihozlari ");

        j2.setScene(new Scene(root, 600, 400));
        j2.show();
        ((Node)(event.getSource())).getScene().getWindow().hide();
    }

    @FXML
    void jihoz3(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/fxmls/jihoz3.fxml"));

        j3.setTitle("Mehmonhona_jihozlari ");

        j3.setScene(new Scene(root, 600, 400));
        j3.show();
        ((Node)(event.getSource())).getScene().getWindow().hide();
    }

    @FXML
    void initialize() {

    }
}
