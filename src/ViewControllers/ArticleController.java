/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewControllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.SortEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author Med. Ali
 */
public class ArticleController implements Initializable {

    @FXML
    private Pane pane_acceuil;
    @FXML
    private Pane pane_locaux;
    @FXML
    private TableView<?> tableLocal;
    @FXML
    private TableColumn<?, ?> colNom;
    @FXML
    private TableColumn<?, ?> colDispo;
    @FXML
    private TableColumn<?, ?> colDateL;
    @FXML
    private TableColumn<?, ?> colDateS;
    @FXML
    private TableColumn<?, ?> colDuree;
    @FXML
    private TableColumn<?, ?> colAdresse;
    @FXML
    private Button btSupprimer;
    @FXML
    private Button btAjouter;
    @FXML
    private Button btModifier;
    @FXML
    private RadioButton rbTous;
    @FXML
    private ToggleGroup consulterTypeGroup;
    @FXML
    private RadioButton rbConfirmes;
    @FXML
    private RadioButton rbNonConfirmes;
    @FXML
    private TextField tfRechecher;
    @FXML
    private VBox vboxFormulaireLocal;
    @FXML
    private TextField tfnomLocal;
    @FXML
    private CheckBox ckReserver;
    @FXML
    private TextField tfDureeLocal;
    @FXML
    private TextField tfAdresseLocal;
    @FXML
    private Pane pane_matriel;
    @FXML
    private TableView<?> tableMatriel;
    @FXML
    private TableColumn<?, ?> colNom1;
    @FXML
    private TableColumn<?, ?> colDisp1;
    @FXML
    private TableColumn<?, ?> colType1;
    @FXML
    private Button btSupprimer1;
    @FXML
    private Button btAjouter1;
    @FXML
    private Button btModifier1;
    @FXML
    private RadioButton rbTous1;
    @FXML
    private ToggleGroup consulterTypeGroup1;
    @FXML
    private RadioButton rbConfirmes1;
    @FXML
    private RadioButton rbNonConfirmes1;
    @FXML
    private TextField tfRechecher1;
    @FXML
    private Pane pane_calendrier;
    @FXML
    private Button btn_Local;
    @FXML
    private Button btn_matriel;
    @FXML
    private Button btn_calendrier;
    @FXML
    private Button btn_calendrier1;
    @FXML
    private Button btn_calendrier11;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void tableLocalOnMouseClicked(MouseEvent event) {
    }

   

    @FXML
    private void btSupprimerOnClick(ActionEvent event) {
    }

    @FXML
    private void onActionAjouter(ActionEvent event) {
    }

    @FXML
    private void getAllLocal(ActionEvent event) {
    }

    @FXML
    private void getReservedLocal(ActionEvent event) {
    }

    @FXML
    private void getNonReservedLocal(ActionEvent event) {
    }

    @FXML
    private void tfRechecherOnKeyReleased(KeyEvent event) {
    }

    @FXML
    private void navMenuAction(ActionEvent event) {
    }
    
}
