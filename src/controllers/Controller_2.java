package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Controller_2 {
    Stage j1=new Stage();
    Stage j2=new Stage();
    Stage j3=new Stage();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    void stol1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/fxmls/Stol1.fxml"));

        j1.setTitle("Stollar ");

        j1.setScene(new Scene(root, 600, 400));
        j1.show();
        ((Node)(event.getSource())).getScene().getWindow().hide();
    }


    @FXML
    void stol2(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("/fxmls/stol2.fxml"));

        j2.setTitle("Stollar ");

        j2.setScene(new Scene(root, 600, 400));
        j2.show();
        ((Node)(event.getSource())).getScene().getWindow().hide();
    }


    @FXML
    void stol3(ActionEvent event)throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("/fxmls/stol3.fxml"));

        j3.setTitle("Stollar ");

        j3.setScene(new Scene(root, 600, 400));
        j3.show();
        ((Node)(event.getSource())).getScene().getWindow().hide();
    }


    @FXML
    void initialize() {

    }
}
