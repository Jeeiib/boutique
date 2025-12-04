package com.cda.boutique.entities;

import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;

@Getter
@Setter
@Entity
@Table(name = "commande")
public class Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name= "CO_ID")
    private Integer id;

    @JoinColumn(name= "CL_ID")
    @ManyToOne
    private Client client;

    @JoinColumn(name= "PA_ID")
    @ManyToOne
    private Paiement paiement;

}
