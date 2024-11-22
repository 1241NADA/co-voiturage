/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modeles.cov2;

// Classe scellée
public sealed class ClassTrajet permits ClassTrajetCourt, ClassTrajetLong {
    private final String pointDepart;
    private final String destination;
    private final ClassDate date;
    private final String heure;
    private final int placesDisponibles;

    // Constructeur
    public ClassTrajet(String pointDepart, String destination, ClassDate date, String heure, int placesDisponibles) {
        this.pointDepart = pointDepart;
        this.destination = destination;
        this.date = date;
        this.heure = heure;
        this.placesDisponibles = placesDisponibles;
    }

    // Getters
    public String getPointDepart() {
        return pointDepart;
    }

    public String getDestination() {
        return destination;
    }

    public ClassDate getDate() {
        return date;
    }

    public String getHeure() {
        return heure;
    }

    public int getPlacesDisponibles() {
        return placesDisponibles;
    }

    // Méthode d'affichage des détails du trajet
    public String afficherDetails() {
        return "Trajet de " + pointDepart + " à " + destination + " le " + date.toString() + " à " + heure + ", places : " + placesDisponibles;
    }
}
