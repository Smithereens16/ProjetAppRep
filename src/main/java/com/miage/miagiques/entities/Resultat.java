package com.miage.miagiques.entities;

import jakarta.persistence.*;
import lombok.Data;
import jakarta.validation.constraints.NotNull;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class Resultat {

    /**
     * Epreuve sur lequel le Resultat est assigné
     */
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn
    private Epreuve idEpreuve;


    /**
     * Spectateur sur lequel le Resultat est assigné
     */
    @OneToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn
    private Participant idParticipant;

    /**
     * Point du Resultat
     */
    @NotNull
    private int tmpPoint;


    /**
     * Position du Resultat
     */
    @NotNull
    private int position;


    /**
     * Méthode pour afficher le Resultat
     * @return une représentation textuelle du Resultat
     */
    @Override
    public String toString() {
        return "Resultat{" +
                ", idEpreuve=" + idEpreuve +
                ", idParticipant=" + idParticipant +
                ", tmpPoint=" + tmpPoint +
                ", position=" + position +
                '}';
    }
}
