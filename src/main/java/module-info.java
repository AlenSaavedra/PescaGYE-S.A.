module com.questionnaire {
    requires javafx.controls;
    requires javafx.fxml;
    
    exports com.questionnaire;  // Exporta tu paquete principal
    opens com.questionnaire.Controllers to javafx.fxml;  // Abre el paquete de controladores a javafx.fxml
    opens com.questionnaire.Models to javafx.base;
    
    // Otras declaraciones de módulos que tu aplicación pueda requerir
}
