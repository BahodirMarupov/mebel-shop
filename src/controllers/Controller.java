package controllers;

import java.io.IOException;
import java.net.URL;
        import java.util.ResourceBundle;
        import javafx.event.ActionEvent;
        import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class Controller {

    @FXML
    ImageView imageView;
    Stage jihozstage=new Stage();
    Stage stolstage=new Stage();
    Stage stulstage=new Stage();
    Stage yotoqstage=new Stage();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    void jihozlar(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/fxmls/Mehmonhona_jihozlari.fxml"));

        jihozstage.setTitle("Mehmonhona_jihozlari ");

        jihozstage.setScene(new Scene(root, 600, 400));
        jihozstage.show();}
    @FXML
    void stolar(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/fxmls/Stollar.fxml"));

        stolstage.setTitle("Stollar ");

        stolstage.setScene(new Scene(root, 600, 400));
        stolstage.show();}

    @FXML
    void stullar(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/fxmls/Stullar.fxml"));

        stulstage.setTitle("Stullar ");

        stulstage.setScene(new Scene(root, 600, 400));
        stulstage.show();}

    @FXML
    void yotoqlar(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/fxmls/Yotoqlar.fxml"));

        yotoqstage.setTitle("Yotoqlar ");

        yotoqstage.setScene(new Scene(root, 600, 400));
        yotoqstage.show();
    }

    public void buyurtmalar(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/fxmls/Royxat.fxml"));

        yotoqstage.setTitle("Buyurtmalar ro'yxati");

        yotoqstage.setScene(new Scene(root, 600, 400));
        yotoqstage.show();
    }

    @FXML
    void initialize() {

    }

}
