/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modeles.cov1;

public sealed class Utilisateurs permits Conducteur, Passager {

    private String nom;
    private String email;
    private final String prénom;
    private Adresse adresseUser;

    public Utilisateurs(String nom, String email, String prénom, Adresse adresseUser) {
        this.nom = nom;
        this.email = email;
        this.prénom = prénom;
        this.adresseUser = adresseUser;
    }

    // Méthodes abstraites
    public abstract void afficherDetails();
    public abstract String obtenirRole();

    // Méthodes getters
    public String getNom() {
        return nom;
    }
    
    public String getPrénom() {
        return prénom;
    }

    public String getEmail() {
        return email;
    }

    public Adresse getAdresseUser() {
        return adresseUser;
    }

    // Méthode pour modifier l'email
    public void setEmail(String email) {
        this.email = email;
    }

    public void setAdresseUser(Adresse adresseUser) {
        this.adresseUser = adresseUser;
    }
}
