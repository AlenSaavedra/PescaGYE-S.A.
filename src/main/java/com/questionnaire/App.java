package com.questionnaire;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/questionnaire/primary.fxml"));
        Parent root = loader.load();
        scene = new Scene(root); // Asegurarse de que la escena se inicializa aquí
        primaryStage.setTitle("PESCAGYE S.A.");
        primaryStage.setScene(scene);
        primaryStage.setMinWidth(400);
        primaryStage.show();
    }

    // Método para cambiar de vista, pasándole el nombre del archivo FXML
    public static void setRoot(String fxml) {
        try {
            FXMLLoader fxmlLoader = loadFXML(fxml);
            Parent root = fxmlLoader.load();  // Cargar el nodo raíz de la vista
            scene.setRoot(root);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para cargar un archivo FXML
    private static FXMLLoader loadFXML(String fxml) throws IOException {
        return new FXMLLoader(App.class.getResource(fxml + ".fxml"));
    }

    // Método principal para lanzar la aplicación
    public static void main(String[] args) {
        launch();
    }
}
