package com.cda.boutique.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.JoinColumn;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "appartenir")
public class Appartenir {

    @EmbeddedId
    private AppartenirId id;

    @ManyToOne
    @MapsId("produitId")
    @JoinColumn(name = "PR_ID")
    private Produit produit;

    @ManyToOne
    @MapsId("categorieId")
    @JoinColumn(name = "CA_ID")
    private Categorie categorie;

}
