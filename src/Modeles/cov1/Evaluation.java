/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modeles.cov1;
import modeles.cov1.Utilisateurs;
/**
 *
 * @author noura
 */


public class Evaluation {  
    private int note; // Note sur une échelle, par exemple de 1 à 5
    private String commentaire;
    private Utilisateurs utilisateurEval; // L'utilisateur qui a fait l'évaluation

    // Constructeur
    public Evaluation(int note, String commentaire, Utilisateurs utilisateurEval) {
        this.note = note;
        this.commentaire = commentaire;
        this.utilisateurEval = utilisateurEval;
    }

    // Méthode pour afficher l'évaluation
    public void afficherEvaluation() {
        System.out.println("Évaluation par : " + utilisateurEval.getPrénom() + " " + utilisateurEval.getNom());
        System.out.println("Note : " + note);
        System.out.println("Commentaire : " + commentaire);
    }

    // Getters et setters
    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public Utilisateurs getUtilisateurEval() {
        return utilisateurEval;
    }

    public void setUtilisateurEval(Utilisateurs utilisateurEval) {
        this.utilisateurEval = utilisateurEval;
    }
}
