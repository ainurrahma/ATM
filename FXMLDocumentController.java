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
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 *
 * @author Andien
 */
public class FXMLDocumentController implements Initializable {
    
    String pin = "";
    String PIN = "1234";
    int kesempatan= 3;
    int tmp;
    
    @FXML
    private Label label;
    
    @FXML
    private TextField editpin;

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
    void pin(ActionEvent event) {

    }

    @FXML
    void tekan0(ActionEvent event) {
        pin+="0";
        editpin.setText(pin);
    }

    @FXML
    void tekan1(ActionEvent event) {
        pin+="1";
        editpin.setText(pin);
    }

    @FXML
    void tekan2(ActionEvent event) {
        pin+="2";
        editpin.setText(pin);
    }

    @FXML
    void tekan3(ActionEvent event) {
        pin+="3";
        editpin.setText(pin);
    }

    @FXML
    void tekan4(ActionEvent event) {
        pin+="4";
        editpin.setText(pin);
    }

    @FXML
    void tekan5(ActionEvent event) {
        pin+="5";
        editpin.setText(pin);
    }

    @FXML
    void tekan6(ActionEvent event) {
        pin+="6";
        editpin.setText(pin);
    }

    @FXML
    void tekan7(ActionEvent event) {
        pin+="7";
        editpin.setText(pin);
    }

    @FXML
    void tekan8(ActionEvent event) {
        pin+="8";
        editpin.setText(pin);
    }

    @FXML
    void tekan9(ActionEvent event) {
        pin+="9";
        editpin.setText(pin);
    }

    @FXML
    void tekanc(ActionEvent event) {
        pin="";
        editpin.setText(pin);
    }

    @FXML
    void tekanok(ActionEvent event) {
        if(pin.equals(PIN)){
            JOptionPane.showMessageDialog(null, "BENAR");
        }
        else{
            JOptionPane.showMessageDialog(null, "SALAH");
        }
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
