package com.miage.miagiques.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotNull;



import java.util.Calendar;

@Entity
@Data
@NoArgsConstructor
public class Epreuve {

    /**
     * Id de l'entité
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * Nom de l'épreuve
     */
    @NotNull
    private String nom;

    /**
     * Date de l'épreuve
     */
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dateEpreuve;

    /**
     * Infrastructure d'accueil
     */
    @NotNull
    private String infrastructureAccueil;


    /**
     * Nombre de places mises en vente
     */
    @NotNull
    private int nombrePlaceEnVente;


    /**
     * Méthode pour afficher l'épreuve
     * @return une représentation textuelle de l'épreuve
     */
    @Override
    public String toString() {
        return "Epreuve{" +
                "id=" + id + '\'' +
                ", nom=" + nom + '\'' +
                ", infrastructureAcceuil='" + infrastructureAccueil + '\'' +
                ", nombrePlaceEnVente=" + nombrePlaceEnVente +
                '}';
    }
}

