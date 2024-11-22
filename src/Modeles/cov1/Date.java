/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modeles.cov1;

/**
 *
 * @author noura
 */
public class Date {
    private int jour;
    private int mois;
    private int annee;

   
    public Date(int jour, int mois, int annee) {
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
    }

    
    public String obtenirDateComplete() {
        return jour + "/" + mois + "/" + annee;
    }

   
    public void afficherDate() {
        System.out.println(obtenirDateComplete());
    }

   
    public int getJour() {
        return jour;
    }

    public int getMois() {
        return mois;
    }

    public int getAnnee() {
        return annee;
    }

   
    public void setJour(int jour) {
        this.jour = jour;
    }

    public void setMois(int mois) {
        this.mois = mois;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }
}