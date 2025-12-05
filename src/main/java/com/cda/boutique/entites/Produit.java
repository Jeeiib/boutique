package com.cda.boutique.entites;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "produits")
public class Produit {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="PR_ID")
    private Integer id;

    @Column(name ="PR_Nom")
    private String nom;

    @Column(name="PR_Description")
    private String description;

    @Column(name="PR_Prix")
    private BigDecimal prix;

    @Column(name="PR_Stock")
    private Integer stock;
}
