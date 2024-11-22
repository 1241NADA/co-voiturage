/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modeles.cov1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author noura
 */
public final class Passager extends Utilisateurs {
    //private List<Reservation> reservations;

  
    public Passager(String nom, String email, String prénom, Adresse adresse) {
        super(nom, email, prénom, adresse);
       // this.reservations = new ArrayList<>();
    }

    // Méthode pour rechercher un trajet
   // public List<Trajet> rechercherTrajet(String destination, Date date, List<Trajet> trajetsDisponibles) {
       // List<Trajet> trajetsTrouves = new ArrayList<>();
        
        // Logique de recherche : filtrer les trajets disponibles
        //for (Trajet trajet : trajetsDisponibles) {
           // if (trajet.getDestination().equalsIgnoreCase(destination) && trajet.getDate().equals(date)) {
           //     trajetsTrouves.add(trajet);
            }
       // }

       // return trajetsTrouves;
    //}

    // Méthode pour réserver un trajet
   /* public void reserverTrajet(Trajet trajet) {
        if (trajet != null) {
            Reservation reservation = new Reservation(trajet);
            reservations.add(reservation);
            System.out.println("Trajet réservé : " + trajet);
        } else {
            System.out.println("Le trajet est invalide.");
        }
    }

    // Méthode pour annuler une réservation
    public void annulerReservation(Reservation reservation) {
        if (reservations.remove(reservation)) {
            System.out.println("Réservation annulée : " + reservation);
        } else {
            System.out.println("Réservation non trouvée.");
        }
    }

    // Méthode pour afficher les réservations
    public void afficherReservations() {
        if (reservations.isEmpty()) {
            System.out.println("Aucune réservation effectuée.");
        } else {
            for (Reservation reservation : reservations) {
                System.out.println(reservation);
            }
        }
    }

    @Override
    public void afficherDetails() {
        System.out.println("Nom: " + getNom() + ", Prénom: " + getPrenom() +
                           ", Email: " + getEmail() + ", Adresse: " + getAdresse().obtenirAdresseComplete());
    }*/

    @Override
    public String obtenirRole() {
        return "Passager";
    }
    
}
