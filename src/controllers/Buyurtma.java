package controllers;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.net.URL;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import models.DatabaseConnector;

import static java.awt.Color.RED;

public class Buyurtma {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField ism;

    @FXML
    private TextField familiya;

    @FXML
    private TextField tell;

    @FXML
    void tasdiqlash(ActionEvent event) throws IOException, SQLException, InterruptedException {
        if (ism.getText().equals("") || familiya.getText().equals("") || tell.getText().equals("")) {
            ism.setText("");
            familiya.setText("");
            tell.setText("");
        } else {
            Connection connection = DatabaseConnector.getConnection();

            String query = "insert into clients(ism,familiya,tell) values (?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, ism.getText());
            preparedStatement.setString(2, familiya.getText());
            preparedStatement.setString(3, tell.getText());
            preparedStatement.execute();
            connection.close();
            ((Node)(event.getSource())).getScene().getWindow().hide();
        }
    }

    @FXML
    void initialize() {
        assert ism != null : "fx:id=\"ism\" was not injected: check your FXML file 'Buyurtma.fxml'.";
        assert familiya != null : "fx:id=\"familiya\" was not injected: check your FXML file 'Buyurtma.fxml'.";
        assert tell != null : "fx:id=\"tell\" was not injected: check your FXML file 'Buyurtma.fxml'.";
    }
}
