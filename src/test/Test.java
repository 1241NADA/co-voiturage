/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package test;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
<<<<<<< HEAD
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
=======
>>>>>>> e286985d310282f93f6c24ff2fa2d4dcc3c9ef17
import javafx.stage.Stage;

/**
 *
<<<<<<< HEAD
 * @author noura
=======
 * @author ajeln
>>>>>>> e286985d310282f93f6c24ff2fa2d4dcc3c9ef17
 */
public class Test extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
<<<<<<< HEAD
         // Utilisation de la classe Adresse importée
        Adresse adresse = new Adresse("123 Rue Exemple", "Paris", 75000);

        // Crée une étiquette avec l'adresse
        Label label = new Label("Adresse: " + adresse.obtenirAdresseComplete());

        StackPane root = new StackPane();
        root.getChildren().add(label);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Application JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();

        // Création d'un objet Date avec une date
        Date date1 = new Date(20, 11, 2024);
        
        // Affichage de la date complète
        date1.afficherDate();  // Devrait afficher : 20/11/2024

        // Modification de la date via les setters
        date1.setJour(21);
        date1.setMois(12);
        date1.setAnnee(2025);

        // Affichage de la nouvelle date
        date1.afficherDate();  // Devrait afficher : 21/12/2025
        
        
=======
>>>>>>> e286985d310282f93f6c24ff2fa2d4dcc3c9ef17
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
