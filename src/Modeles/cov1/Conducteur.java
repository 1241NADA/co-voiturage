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
public final class Conducteur extends Utilisateurs  {
    //private List<Trajet> trajetsProposes;

    // Constructeur
    public Conducteur(String nom, String email, String prénom, Adresse adresse) {
        super(nom, email , prénom, adresse);
        //this.trajetsProposes = new ArrayList<>();
    }

    // Méthode pour proposer un trajet
    public void proposerTrajet(Trajet trajet) {
        trajetsProposes.add(trajet);
    }

    // Méthode pour annuler un trajet
    //public void annulerTrajet(Trajet trajet) {
        //trajetsProposes.remove(trajet);
    }

    // Méthode pour afficher les trajets proposés
   /*public void afficherTrajetsProposes() {
       for (Trajet trajet : trajetsProposes) {
          System.out.println(trajet);
       }
    }*/

   /* @Override
    public void afficherDetails() {
        System.out.println("Nom: " + getNom() + ", Prénom: " + getPrénom() + 
                           ", Email: " + getEmail() + ", Adresse: " + getAdresseUser().obtenirAdresseComplete());
    }

    @Override
    public String obtenirRole() {
        return "conducteur";
    }
}*/

    


    
