/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package test;

import Modeles.cov1.Adresse;
import Modeles.cov1.Date;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author ajeln
 */
public class Test extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        // Utilisation de la classe Adresse importée
        Adresse adresse = new Adresse("123 Rue Exemple", "Paris", 75000);

        // Crée une étiquette avec l'adresse
        Label label = new Label("Adresse: " + adresse.obtenirAdresseComplete());

        StackPane root = new StackPane();
        root.getChildren().add(label);

        Scene scene = new Scene(root, 300, 250);

        stage.setTitle("Application JavaFX");
        stage.setScene(scene);
        stage.show();

        // Création d'un objet Date avec une date
        Date date1 = new Date(20, 11, 2024);

        // Affichage de la date complète
        date1.afficherDate(); // Devrait afficher : 20/11/2024

        // Modification de la date via les setters
        date1.setJour(21);
        date1.setMois(12);
        date1.setAnnee(2025);

        // Affichage de la nouvelle date
        date1.afficherDate(); // Devrait afficher : 21/12/2025
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}