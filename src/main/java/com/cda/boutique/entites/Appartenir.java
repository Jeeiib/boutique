package com.cda.boutique.entites;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "appartenir")
public class Appartenir {

    @EmbeddedId
    private AppartenirID id;

    @MapsId("produitId")
    @ManyToOne()
    @JoinColumn(name = "PR_ID")
    private Produit produit;

    @MapsId("categorieId")
    @ManyToOne()
    @JoinColumn(name = "CA_ID")
    private Categorie categorie;

}
