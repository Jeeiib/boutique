package com.cda.boutique.entites;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class AppartenirID implements Serializable {

    @Column(name = "PR_ID")
    private Integer produitId;

    @Column(name = "CA_ID")
    private Integer categorieId;
}
