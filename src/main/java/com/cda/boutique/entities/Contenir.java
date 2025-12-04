package com.cda.boutique.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "contenir")
public class Contenir {

    @EmbeddedId
    private ContenirId id;

    @ManyToOne
    @MapsId("produitId")
    @JoinColumn(name = "PR_ID")
    private Produit produit;

    @ManyToOne
    @MapsId("commandeId")
    @JoinColumn(name = "CO_ID")
    private Commande commande;

    @Column(name = "CO_Quantite", nullable = false)
    private Integer quantite;

}
