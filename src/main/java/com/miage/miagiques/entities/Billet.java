package com.miage.miagiques.entities;

import jakarta.persistence.*;
import lombok.Data;
import jakarta.validation.constraints.NotNull;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Billet {

    /**
     * Id de l'entité
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    /**
     * Epreuve sur lequel le billet est assigné
     */
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn
    private Epreuve idEpreuve;


    /**
     * Spectateur sur lequel le billet est assigné
     */
    @OneToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn
    private Spectateur idSpectateur;

    /**
     * Prix du billet
     */
    @NotNull
    private int prixBillet;


    /**
     * Etat du billet
     */
    @NotNull
    private Boolean etatBillet;


    /**
     * Méthode pour afficher le Billet
     * @return une représentation textuelle du Billet
     */
    @Override
    public String toString() {
        return "Billet{" +
                "id=" + id +
                ", idEpreuve=" + idEpreuve +
                ", idSpectateur=" + idSpectateur +
                ", prixBillet=" + prixBillet +
                ", etatBillet=" + etatBillet +
                '}';
    }
}
