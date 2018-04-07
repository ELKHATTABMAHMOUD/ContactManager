/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1.piu;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

/**
 *
 * @author uapv1800074
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private ListView<String> addressbooks ;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    @FXML
    private void addNewContactHandler(ActionEvent event) throws IOException{
        System.out.println("You clicked add new contact button!");
        Stage stage = new Stage();
        Parent root1 = FXMLLoader.load(getClass().getResource("FXMLNewContactFrame.fxml"));
        Scene scene1 = new Scene(root1);
        stage.setScene(scene1);
        stage.show();
    }
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        ObservableList<String> items =FXCollections.observableArrayList (
            "All contacts ", "Private contacts", "Professional contacts", "Student contacts");
        addressbooks.setItems(items);
    }    
    
}
