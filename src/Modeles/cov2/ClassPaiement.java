package Modeles.cov2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// record représentant un paiement pour un trajet
public record ClassPaiement(double montant, String modePaiement, ClassDate datePaiement) {

    // Méthode pour afficher les détails du paiement
    public String afficherDetails() {
        return "Montant : " + montant + " €, Mode de paiement : " + modePaiement + ", Date du paiement : " + datePaiement.toString();
    }

    // Méthode pour effectuer un paiement
    public boolean effectuerPaiement() {
        // Ici, vous pouvez ajouter des logiques pour effectuer un paiement réel si nécessaire (comme la validation du montant ou l'appel à une API de paiement)
        System.out.println("Paiement de " + montant + " € effectué via " + modePaiement + " le " + datePaiement.toString());
        return true;  // Retourner true pour indiquer que le paiement a été effectué avec succès
    }

    // Méthode pour vérifier si le paiement est valide
    public boolean estValide() {
        // Par exemple, vérifier si le montant est positif
        return montant > 0;
    }
}


