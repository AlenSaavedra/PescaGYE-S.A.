package com.questionnaire.Controllers;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import com.questionnaire.Models.Product;

public class SecondaryController {

    @FXML
    private TextField txtCodigo;

    @FXML
    private TextField txtDescripcion;

    @FXML
    private TextField txtCantidad;

    @FXML
    private Button btnAgregar;

    @FXML
    private TableView<Product> tableProductos;

    @FXML
    private TableColumn<Product, String> colCodigo;

    @FXML
    private TableColumn<Product, String> colDescripcion;

    @FXML
    private TableColumn<Product, Integer> colCantidad;

    private ObservableList<Product> productosList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // Configurar las columnas de la tabla
        colCodigo.setCellValueFactory(new PropertyValueFactory<>("codigo"));
        colDescripcion.setCellValueFactory(new PropertyValueFactory<>("descripcion"));
        colCantidad.setCellValueFactory(new PropertyValueFactory<>("cantidad"));

        // Enlazar la lista con la tabla
        tableProductos.setItems(productosList);
    }

    @FXML
    private void agregarProducto() {
        String codigo = txtCodigo.getText().trim();
        String descripcion = txtDescripcion.getText().trim();
        String cantidadStr = txtCantidad.getText().trim();
        int cantidad;

        // Validar que los campos no estén vacíos
        if (codigo.isEmpty() || descripcion.isEmpty() || cantidadStr.isEmpty()) {
            mostrarAlerta("Error", "Todos los campos son obligatorios.", Alert.AlertType.ERROR);
            return;
        }

        // Validar que la cantidad sea un número válido
        try {
            cantidad = Integer.parseInt(cantidadStr);
            if (cantidad <= 0) {
                mostrarAlerta("Error", "La cantidad debe ser un número positivo.", Alert.AlertType.ERROR);
                return;
            }
        } catch (NumberFormatException e) {
            mostrarAlerta("Error", "Cantidad inválida. Debe ser un número entero.", Alert.AlertType.ERROR);
            return;
        }

        // Agregar producto a la lista
        Product nuevoProducto = new Product(codigo, descripcion, cantidad);
        productosList.add(nuevoProducto);

        // Actualizar la tabla
        tableProductos.refresh();

        // Limpiar los campos de texto
        txtCodigo.clear();
        txtDescripcion.clear();
        txtCantidad.clear();
    }

    private void mostrarAlerta(String titulo, String mensaje, Alert.AlertType tipo) {
        Alert alert = new Alert(tipo);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }
}
