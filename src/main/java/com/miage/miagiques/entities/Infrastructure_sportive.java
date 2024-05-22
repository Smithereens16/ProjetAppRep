package com.miage.miagiques.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Infrastructure_sportive {
    /**
     * Id de l'entité
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * Nom de l'infrastructure sportive
     */
    @NotNull
    private String nom;

    /**
     * Adresse de l'infrastructure sportive
     */
    @NotNull
    private String adresse;

    /**
     * Capacité de l'infrastructure sportive
     */
    @NotNull
    private int capacite;


    /**
     * Méthode pour afficher une Infrastructure_sportive
     * @return une représentation textuelle de l'Infrastructure_sportive
     */
    @Override
    public String toString() {
        return "Infrastructure_sportive{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", capacite=" + capacite +
                '}';
    }
}
