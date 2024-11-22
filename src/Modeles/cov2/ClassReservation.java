/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modeles.cov2;

public class ClassReservation {
    private ClassTrajet trajet;          // L'objet Trajet associé à la réservation
    private ClassDate dateReservation;  // La date de la réservation (utilise ClassDate)
    private String statut;          // Le statut de la réservation (confirmée, annulée, etc.)

    // Constructeur
    public ClassReservation(ClassTrajet trajet, ClassDate dateReservation, String statut) {
        this.trajet = trajet;
        this.dateReservation = dateReservation;
        this.statut = statut;
    }

    // Méthode pour confirmer la réservation
    public void confirmerReservation() {
        if (!"confirmée".equals(statut)) {
            this.statut = "confirmée";
            System.out.println("Réservation confirmée.");
        } else {
            System.out.println("Réservation déjà confirmée.");
        }
    }

    // Méthode pour annuler la réservation
    public void annulerReservation() {
        if (!"annulée".equals(statut)) {
            this.statut = "annulée";
            System.out.println("Réservation annulée.");
        } else {
            System.out.println("Réservation déjà annulée.");
        }
    }

    // Getters et setters
    public ClassTrajet getTrajet() {
        return trajet;
    }

    public void setTrajet(ClassTrajet trajet) {
        this.trajet = trajet;
    }

    public ClassDate getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(ClassDate dateReservation) {
        this.dateReservation = dateReservation;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    // Méthode pour afficher les détails de la réservation
    public String afficherDetailsReservation() {
        return "Réservation:\n" +
               "Trajet: " + trajet.getDestination() + "\n" +
               "Date de Réservation: " + dateReservation.obtenirDateComplete() + "\n" +
               "Statut: " + statut;
    }

    // Méthode toString pour une représentation textuelle de la réservation
    @Override
    public String toString() {
        return "Réservation: [Trajet: " + trajet.getDestination() + ", Date: " + dateReservation.obtenirDateComplete() + ", Statut: " + statut + "]";
    }
}
