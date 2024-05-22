package com.miage.miagiques.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Organisateur {

    /**
     * Enum des types d'opérations
     */
    public enum OrganisateurTypeRole {ORGANISATEUR,CONTROLEUR}

    /**
     * Id de l'entité
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * Nom de l'organisateur
     */
    @NotNull
    private String nom;

    /**
     * Prénom l'organisateur
     */
    @NotNull
    private String prenom;

    /**
     * Adresse e-mail de l'organisateur
     */
    @NotNull
    private String email;

    /**
     * Role l'organisateur
     */
    @NotNull
    private OrganisateurTypeRole role;

    /**
     * Méthode pour afficher un organisateur
     * @return une représentation textuelle du organisateur
     */
    @Override
    public String toString() {
        return "Organisateur{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", e-mail=" + email + '\'' +
                ", role='" + role +
                '}';
    }
}
