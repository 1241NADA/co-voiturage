/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modeles.cov2;

// Classe héritée de Trajet pour les trajets longs
public final class ClassTrajetLong extends ClassTrajet {
    private final int distance;

    public ClassTrajetLong(String pointDepart, String destination, ClassDate date, String heure, int placesDisponibles, int distance) {
        super(pointDepart, destination, date, heure, placesDisponibles);
        this.distance = distance;
    }

    // Getter
    public int getDistance() {
        return distance;
    }

    @Override
    public String afficherDetails() {
        return super.afficherDetails() + ", Distance : " + distance + " km";
    }
}
