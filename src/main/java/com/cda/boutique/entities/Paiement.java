package com.cda.boutique.entities;

import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import java.time.LocalDate;
import java.math.BigDecimal;



@Getter
@Setter
@Entity
@Table(name = "paiements")
public class Paiement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "PA_ID")
    private Integer id;

    @Column(name= "PA_Montant")
    private BigDecimal montant;

    @Column(name="PA_Date")
    private LocalDate date;

    @Column(name="PA_Methode")
    private String method;
    
}
