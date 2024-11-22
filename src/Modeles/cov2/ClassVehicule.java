/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modeles.cov2;

/**
 * Classe représentant un véhicule utilisé dans le système de covoiturage.
 * Elle contient des informations sur le modèle, la capacité, la marque et l'immatriculation.
 */
public class ClassVehicule {
    // Attributs
    private String modele;
    private String marque;
    private String immatriculation;
    private int capacite;  // Nombre de places dans le véhicule

    // Constructeur
    public ClassVehicule(String modele, String marque, String immatriculation, int capacite) {
        this.modele = modele;
        this.marque = marque;
        this.immatriculation = immatriculation;
        this.capacite = capacite;
    }

    // Getters et Setters
    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    // Méthode pour afficher les détails du véhicule
    public String afficherDetails() {
        return "Véhicule [Marque : " + marque + ", Modèle : " + modele + ", Immatriculation : " + immatriculation + ", Capacite : " + capacite + " places]";
    }

    // Méthode pour vérifier si le véhicule peut accueillir un certain nombre de passagers
    public boolean peutAccueillir(int nbPassagers) {
        return nbPassagers <= capacite;
    }

    // Méthode toString pour une représentation textuelle du véhicule
    @Override
    public String toString() {
        return "Véhicule " + marque + " " + modele + " (" + immatriculation + ") - Capacite : " + capacite + " places";
    }
}
