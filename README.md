# PESCAGYE S.A. - Product Management System

## Description

This project is a desktop application developed with JavaFX, which is used to manage products in an inventory system. The application has a **login** system to authenticate users before accessing the system, ensuring that only authorized users can interact with product management.

It allows adding products, viewing information about them in a table, and managing their details, such as code, description, and available quantity.

## Technologies Used

- **Java 17+**: Programming language.
- **JavaFX**: Framework for the graphical user interface (GUI).
- **FXML**: Definition of the user interface in XML.
- **Maven** (optional, if used as a dependency manager).
- **Authentication system**: Implementation of a login with authentication of credentials (username and password) to access the system.

## Features

- **Login with credential authentication**: Users must enter a username and password to access the system.
- **Add products**: Allows new products to be entered with their code, description and quantity.
- **Product display**: Displays the added products in a table, with columns for code, description and quantity.
- **Intuitive interface**: Use of JavaFX to create a user-friendly graphical interface.

## Installation Instructions

1. **Clone the repository**:

```tap
git clone https://github.com/AlenSaavedra/PescaGYE-S.A.git
```

2. **Build and run**:
- If you are using **Maven**, run the following commands:

```tap
mvn clean install
mvn javafx: run
```

- If you are using an **IDE** (such as IntelliJ IDEA or Eclipse), import the project and run the `App` class from `com.questionnaire`.

## Project Structure

- **src/com/questionnaire**: Contains the Java classes to handle the application logic.
- **LoginController.java**: Controller for user authentication.
- **ProductController.java**: Controller for managing products.
- **src/com/questionnaire/primary.fxml**: Definition of the main interface of the application.
- **src/com/questionnaire/secundary.fxml**: Definition of the interface for adding products.
- **src/com/questionnaire/login.fxml**: Definition of the login interface (login screen).

## Contributions

If you wish to contribute, please **fork** the project and submit a **pull request** with your changes.

## License

This project is licensed under the MIT License. See the `LICENSE` file for more details.
