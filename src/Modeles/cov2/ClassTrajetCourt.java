/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modeles.cov2;

// Classe héritée de Trajet pour les trajets courts
public final class ClassTrajetCourt extends ClassTrajet {
    private final String typeDeVoiture;

    public ClassTrajetCourt(String pointDepart, String destination, ClassDate date, String heure, int placesDisponibles, String typeDeVoiture) {
        super(pointDepart, destination, date, heure, placesDisponibles);
        this.typeDeVoiture = typeDeVoiture;
    }

    // Getter
    public String getTypeDeVoiture() {
        return typeDeVoiture;
    }

    @Override
    public String afficherDetails() {
        return super.afficherDetails() + ", Type de voiture : " + typeDeVoiture;
    }
}
