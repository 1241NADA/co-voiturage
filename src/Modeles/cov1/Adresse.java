/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modeles.cov1;

/**
 *
 * @author noura
 */
public class Adresse {
    private String rue;
    private String ville;
    private int codePostale;

    // Constructeur
    public Adresse(String rue, String ville, int codePostale) {
        this.rue = rue;
        this.ville = ville;
        this.codePostale = codePostale;
    }

    // Méthode pour obtenir l'adresse complète
    public String obtenirAdresseComplete() {
        return rue + ", " + ville + " - " + codePostale;
    }

    // Méthode pour afficher l'adresse
    public void afficherAdresse() {
        System.out.println(obtenirAdresseComplete());
    }

    // Getters
    public String getRue() {
        return rue;
    }

    public String getVille() {
        return ville;
    }

    public int getCodePostale() {
        return codePostale;
    }

 
    public void setRue(String rue) {
        this.rue = rue;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public void setCodePostale(int codePostale) {
        this.codePostale = codePostale;
    }
}


    

