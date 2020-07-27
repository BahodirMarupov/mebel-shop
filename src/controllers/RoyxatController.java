package controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import models.DatabaseConnector;
import models.ModelTable;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class RoyxatController implements Initializable {

    @FXML
    Stage reloadStege=new Stage();

    @FXML
    public TextField number;

    @FXML
    private TableView<ModelTable> table;

    @FXML
    private TableColumn<ModelTable, String > id;

    @FXML
    private TableColumn<ModelTable, String > ism;

    @FXML
    private TableColumn<ModelTable, String > familiya;

    @FXML
    private TableColumn<ModelTable, String > tell;

    ObservableList<ModelTable> obList= FXCollections.observableArrayList();

    public void delete(ActionEvent actionEvent) throws SQLException, IOException {
        String exactId="";
        Connection connection=DatabaseConnector.getConnection();
        ResultSet resultSet=connection.createStatement().executeQuery("select * from clients");
        while (resultSet.next()){
            if (resultSet.getString("id").equals(number.getText())){
                exactId=number.getText();
            }
        }
        if (exactId.equals("")){
            return;
        }
        String query="delete from clients where id="+exactId;
        PreparedStatement preparedStatement=connection.prepareStatement(query);
        preparedStatement.execute();
        connection.close();

        Parent root = FXMLLoader.load(getClass().getResource("/fxmls/Royxat.fxml"));
        reloadStege.setTitle("Buyurtmalar ro'yxati");
        reloadStege.setScene(new Scene(root, 600, 400));
        reloadStege.show();
        ((Node)(actionEvent.getSource())).getScene().getWindow().hide();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        try {
            Connection connection= DatabaseConnector.getConnection();
            ResultSet resultSet=connection.createStatement().executeQuery("select * from clients");
            while (resultSet.next()){
                obList.add(new ModelTable(resultSet.getString("id"),resultSet.getString("ism"),
                        resultSet.getString("familiya"),resultSet.getString("tell")));
            }

        id.setCellValueFactory(new PropertyValueFactory<ModelTable, String>("id"));
        ism.setCellValueFactory(new PropertyValueFactory<ModelTable, String>("ism"));
        familiya.setCellValueFactory(new PropertyValueFactory<ModelTable, String>("familiya"));
        tell.setCellValueFactory(new PropertyValueFactory<ModelTable, String>("tell"));
        table.setItems(obList);

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

}
