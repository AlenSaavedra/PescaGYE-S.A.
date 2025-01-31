package com.questionnaire.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Parent;

import java.io.IOException;

public class PrimaryController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Label messageLabel;

    @FXML
    private Button loginButton;

    private boolean validateCredentials(String username, String password) {
        // Lógica de validación con las nuevas credenciales
        return "root".equals(username) && "12345".equals(password);
    }

    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Login Status");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    @FXML
    public void login(ActionEvent event) {
        // Deshabilitar botón mientras se valida
        loginButton.setDisable(true);

        // Obtener los valores de los campos de texto
        String username = usernameField.getText();
        String password = passwordField.getText();

        // Lógica de validación
        if (validateCredentials(username, password)) {
            showAlert("Login exitoso!");
            openSecondaryScene(); // Llamar al método para cambiar de escena
        } else {
            showAlert("Credenciales inválidas.");
        }

        // Limpiar campos
        usernameField.clear();
        passwordField.clear();

        // Habilitar botón nuevamente
        loginButton.setDisable(false);
    }

    private void openSecondaryScene() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/questionnaire/secondary.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) loginButton.getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("BD PESCAGYE S.A."); // Cambia el título de la ventana
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
            showAlert("Error al cargar la pantalla secundaria.");
        }
    }
}
