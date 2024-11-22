/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// record représentant une date
package Modeles.cov2;

/**
 * Classe représentant une date.
 * @author ajeln
 */
public class ClassDate {
    // Attributs
    private int jour;
    private int mois;
    private int annee;

    // Constructeur par défaut
    public ClassDate() {
        this.jour = 1;
        this.mois = 1;
        this.annee = 2000;
    }

    // Constructeur avec paramètres
    public ClassDate(int jour, int mois, int annee) {
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
    }

    // Getters et Setters
    public int getJour() {
        return jour;
    }

    public void setJour(int jour) {
        this.jour = jour;
    }

    public int getMois() {
        return mois;
    }

    public void setMois(int mois) {
        this.mois = mois;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    // Méthode pour obtenir la date complète au format jj/mm/aaaa
    public String obtenirDateComplete() {
        return String.format("%02d/%02d/%04d", jour, mois, annee);
    }

    // Méthode toString pour représenter l'objet sous forme de chaîne
    @Override
    public String toString() {
        return obtenirDateComplete();
    }

    // Comparaison de dates
    public boolean estEgale(ClassDate autreDate) {
        return this.jour == autreDate.jour && this.mois == autreDate.mois && this.annee == autreDate.annee;
    }

    // Vérifier si cette date est avant une autre
    public boolean estAvant(ClassDate autreDate) {
        if (this.annee < autreDate.annee) return true;
        if (this.annee == autreDate.annee) {
            if (this.mois < autreDate.mois) return true;
            if (this.mois == autreDate.mois) {
                return this.jour < autreDate.jour;
            }
        }
        return false;
    }

    // Vérifier si cette date est après une autre
    public boolean estApres(ClassDate autreDate) {
        return !this.estAvant(autreDate) && !this.estEgale(autreDate);
    }
}

