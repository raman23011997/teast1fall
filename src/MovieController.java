/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Shanty
 */
public class MovieController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML private Label namelabel;
    @FXML private Label genrelabel;
    @FXML private Label descriptionlabel;
    @FXML private Label yearlabel;
    @FXML private TextField nametext;
    @FXML private TextField genretext;
    @FXML private TextField descriptiontext;
    @FXML private TextField yeartext;
    @FXML private Label errorlabel;
    @FXML private Button createbutton;
    @FXML private Label displaylabel;
    
    public void pushbuttoncalculate(){
        Movie createmovie= new Movie(
                                     nametext.getText(),genretext.getText(),descriptiontext.getText(),
                                       Integer.parseInt(yeartext.getText()) );
        try{
            displaylabel.setVisible(true);
        displaylabel.setText(createmovie.toString());
        }catch(IllegalArgumentException e){
            displaylabel.setVisible(false);
            errorlabel.setVisible(true);
        }
        
    }
       
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       displaylabel.setVisible(false);
       errorlabel.setVisible(false);
    }    
    
}
