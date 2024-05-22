package com.miage.miagiques.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
public class Participant {
    /**
     * Id de l'entité
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * Nom du participant
     */
    @NotNull
    private String nom;

    /**
     * Prénom du participant
     */
    @NotNull
    private String prenom;

    /**
     * Adresse e-mail du participant
     */
    @NotNull
    private String email;

    /**
     * Référence vers la délégation du participant
     */
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JsonBackReference // pour éviter les cycles lors de la transformation en JSON
    private Delegation delegation;

    /**
     * Méthode pour afficher un participant
     * @return une représentation textuelle du participant
     */
    @Override
    public String toString() {
        return "Participant{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", e-mail='" + email + '\'' +
                ", delegation='" + delegation +
                '}';
    }
}
