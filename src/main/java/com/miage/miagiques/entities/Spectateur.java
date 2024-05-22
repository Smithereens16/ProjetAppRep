package com.miage.miagiques.entities;

import jakarta.persistence.*;
import lombok.Data;
import jakarta.validation.constraints.NotNull;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
public class Spectateur {

    /**
     * Id de l'entité
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * Nom du spéctateur
     */
    @NotNull
    private String nom;

    /**
     * Prénom du spéctateur
     */
    @NotNull
    private String prenom;

    /**
     * Adresse e-mail du spéctateur
     */
    @NotNull
    private String email;

    /**
     * Méthode pour afficher un spéctateur
     * @return une représentation textuelle du spéctateur
     */
    @Override
    public String toString() {
        return "Spectateur{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", e-mail=" + email +
                '}';
    }
}
