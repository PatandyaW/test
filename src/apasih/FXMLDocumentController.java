/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package apasih;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 *
 * @author Abhirama
 */
public class FXMLDocumentController implements Initializable {
      
    @FXML
    private Button bTambah;
    
    @FXML
    private Button bScene;
    
    @FXML
    private RadioButton RBLAKI;
    
    @FXML
    private RadioButton RBCEWE;
    
    @FXML
    private ChoiceBox cebAngkatan;
    
    
    
    // Table
    @FXML
    private TableView<Mahasiswa> tData;
    
    @FXML
    private TableColumn<Mahasiswa, String> namaKol;
    
    @FXML
    private TableColumn<Mahasiswa, String> nimKol;
    
    @FXML
    private TableColumn <Mahasiswa, String> tcAngkatan;
    
    @FXML
    private TableColumn <Mahasiswa, String> tcjenis;
    
    
    // Input
    @FXML
    private TextField inNama;
    
    @FXML
    private TextField inNIM;
    
    
    // Scene
    @FXML
    private void scene2Button(ActionEvent event) throws IOException{
        Parent scene2 = FXMLLoader.load(getClass().getResource("FXML.fxml"));
        Scene scene = new Scene(scene2);
        
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Data Mahasiswa");
        stage.show();
        System.out.println("Scene2Button is clicked");
        
    }
    
    
    // Button   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        namaKol.setCellValueFactory(new PropertyValueFactory<Mahasiswa, String>("nama"));
        nimKol.setCellValueFactory(new PropertyValueFactory<Mahasiswa, String>("NIM"));
        tcAngkatan.setCellValueFactory(new PropertyValueFactory<Mahasiswa, String>("angkatan"));
        tcjenis.setCellValueFactory(new PropertyValueFactory<Mahasiswa, String>("jenis"));
        
    cebAngkatan.setValue("2021");
        cebAngkatan.getItems().addAll("2020","2021","2022");
        cebAngkatan.getValue().toString();}  
    
    
    @FXML 
    void tambah(ActionEvent event){
        String jen = "";
        if (RBLAKI.isSelected()){
            jen = "pria";
        }else if(RBCEWE.isSelected()){
            jen = "wanita";
        }
        String angkat = "";
        angkat = cebAngkatan.getValue().toString();
        Mahasiswa data = new Mahasiswa(inNama.getText(), inNIM.getText(),angkat,jen );
        ObservableList<Mahasiswa> dataS = tData.getItems();
        dataS.add(data);
        tData.setItems(dataS);
        RBLAKI.isSelected();
        String Angkatan = cebAngkatan.getValue().toString();
        
    }
    
    
    
}
