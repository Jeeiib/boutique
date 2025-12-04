package com.cda.boutique.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "produits")
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PR_ID")
    private Integer id;

    @Column(name = "PR_Nom", length = 250)
    private String nom;

    @Column(name = "PR_Description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "PR_Prix", precision = 15, scale = 2)
    private BigDecimal prix;

    @Column(name = "PR_Stock")
    private Integer stock;

}
