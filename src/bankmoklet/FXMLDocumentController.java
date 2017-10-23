/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankmoklet;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class FXMLDocumentController implements Initializable {
    String pin ="";
    String PIN ="1234";
    int kesempatan = 3;
    int tmp;
    
    @FXML
    private JFXButton button1;

    @FXML
    private JFXButton button2;

    @FXML
    private JFXButton button3;

    @FXML
    private JFXButton button4;

    @FXML
    private JFXButton button5;

    @FXML
    private JFXButton button6;

    @FXML
    private JFXButton button7;

    @FXML
    private JFXButton button8;

    @FXML
    private JFXButton button9;

    @FXML
    private JFXButton buttonc;

    @FXML
    private JFXButton button0;

    @FXML
    private JFXButton buttonok;

    @FXML
    private TextField editpin;

    @FXML
    void tekan0(ActionEvent event) {
           pin +="0";
           editpin.setText(pin);
    }

    @FXML
    void tekan1(ActionEvent event) {
            pin +="1";
           editpin.setText(pin);
    }

    @FXML
    void tekan2(ActionEvent event) {
             pin +="2";
           editpin.setText(pin);
    }

    @FXML
    void tekan3(ActionEvent event) {
             pin +="3";
           editpin.setText(pin);
    }

    @FXML
    void tekan4(ActionEvent event) {
             pin +="4";
           editpin.setText(pin);
    }

    @FXML
    void tekan5(ActionEvent event) {
             pin +="5";
           editpin.setText(pin);
    }

    @FXML
    void tekan6(ActionEvent event) {
             pin +="6";
           editpin.setText(pin);
    }
    
    @FXML
    void tekan7(ActionEvent event){
         pin +="7";
           editpin.setText(pin);
    }

    @FXML
    void tekan8(ActionEvent event) {
             pin +="8";
           editpin.setText(pin);
    }

    @FXML
    void tekan9(ActionEvent event) {
             pin +="9";
           editpin.setText(pin);
    }

    @FXML
    void tekanc(ActionEvent event) {
             pin +="";
           editpin.setText(pin);
    }

   
    @FXML
    void tekanok(ActionEvent event) {
        if(pin.equals(PIN)){
            JOptionPane.showMessageDialog(null, "BENAR");
            try {
            // Hide this current window (if this is what you want)
            ((Node)(event.getSource())).getScene().getWindow().hide();
            
            // Load the new fxml
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("FXML.fxml"));
            Scene scene = new Scene((Parent) fxmlLoader.load(), 830, 450);
            
            // Create new stage (window), then set the new Scene
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Bankmoklet");
            stage.show();
            
        } catch (IOException e) {
            System.out.println("Failed to create new Window." + e);
        }
        }
        else{
            JOptionPane.showMessageDialog(null, "SALAH");
        }
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private Label label;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
}
