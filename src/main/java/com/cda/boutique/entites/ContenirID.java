package com.cda.boutique.entites;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class ContenirID implements Serializable {

    @Column(name = "PR_ID")
    private Integer produitId;

    @Column(name = "CO_ID")
    private Integer commandeId;
}
