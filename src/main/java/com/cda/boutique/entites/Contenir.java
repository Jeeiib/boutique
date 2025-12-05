package com.cda.boutique.entites;

import jakarta.persistence.Column;
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
@Table(name="contenir")
public class Contenir {
    
    @EmbeddedId
    private ContenirID id;
    
    @MapsId("produitId")
    @ManyToOne()
    @JoinColumn(name="PR_ID")
    private Produit produit;

    @MapsId("commandeId")
    @ManyToOne()
    @JoinColumn(name="CO_ID")
    private Commande commande;
    
    @Column(name="CO_Quantite")
    private Integer quantite;
}
