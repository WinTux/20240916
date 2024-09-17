package com.pepe.principal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DatePicker;
import javafx.scene.Node;
import javafx.stage.Stage;
public class SegundoController {

	@FXML
    private DatePicker fchFechaNacimiento;
    @FXML
    private Label lblMensaje;

    @FXML
    private TextField txtUsuario;

    @FXML
    void btnLeerUsuario(ActionEvent event) {
    	String valor = txtUsuario.getText();
    	lblMensaje.setText(valor);
    	
    	//Date picker
    	LocalDate miFecha = fchFechaNacimiento.getValue();
    	String miFechaFormato = miFecha.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));// 04-10-2024
    	lblMensaje.setText(lblMensaje.getText() + " " + miFechaFormato);// yyyy-MM-dd
    }
    @FXML
    void btnSalir(ActionEvent event) {
    	// Ejemplo Alert
    	Alert alert = new Alert(AlertType.CONFIRMATION);
    	alert.setTitle("Salir");
    	alert.setHeaderText("Estas por salir");
    	alert.setContentText("¿Estás seguro de salir de la aplicación?");
    	if(alert.showAndWait().get() == ButtonType.OK) {
    		Node nodo = (Node) event.getSource();
    		Stage stage = (Stage) nodo.getScene().getWindow();
    		stage.close();
    	}
    }
}
