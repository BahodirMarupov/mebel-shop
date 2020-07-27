package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Stol3 {
    public void buyurtma(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/fxmls/Buyurtma.fxml"));
        Stage stage=new Stage();
        stage.setTitle("Buyurtma ");
        stage.setScene(new Scene(root, 600, 400));
        stage.show();
        ((Node)(event.getSource())).getScene().getWindow().hide();
    }
}
