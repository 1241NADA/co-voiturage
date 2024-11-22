/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modeles.cov2;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class ClassGestionTrajet {
    private List<ClassTrajet> trajets;

    public ClassGestionTrajet() {
        this.trajets = new ArrayList<>();
    }

    // Ajouter un trajet
    public void ajouterTrajet(ClassTrajet trajet) {
        trajets.add(trajet);
    }

    // Rechercher un trajet par destination et date
    public List<ClassTrajet> rechercherTrajet(String destination, ClassDate date) {
        return trajets.stream()
            .filter(t -> t.getDestination().equals(destination) && t.getDate().estEgale(date))
            .collect(Collectors.toList());
    }

    // Trier les trajets par nombre de places
    public List<ClassTrajet> trierParPlaces() {
        return trajets.stream()
            .sorted((t1, t2) -> Integer.compare(t1.getPlacesDisponibles(), t2.getPlacesDisponibles()))
            .collect(Collectors.toList());
    }
}
