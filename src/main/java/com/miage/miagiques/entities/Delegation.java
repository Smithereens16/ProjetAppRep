package com.miage.miagiques.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotNull;


@Entity
@Data
@NoArgsConstructor
public class Delegation {

    /**
 * Id de l'entité
 */
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;

    /**
     * Nom de la délégation
     */
    @NotNull
    private String nom;

    /**
     * Prénom de la délégation
     */
    @NotNull
    private int prenom;

    /**
     * Nombre médailles d’or
     */
    @NotNull
    private String medailleOr;

    /**
     * Nombre médailles d’argent
     */
    @NotNull
    private String medailleArgent;

    /**
     * Nombre médailles de bronze
     */
    @NotNull
    private String medailleBronze;
    /**
     * Méthode pour afficher une délégation
     * @return une représentation textuelle de la délégation
     */
    @Override
    public String toString() {
        return "Delegation{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", medailleOr=" + medailleOr + '\'' +
                ", medailleArgent=" + medailleArgent + '\'' +
                ", medailleBronze=" + medailleBronze +
                '}';
    }
}
