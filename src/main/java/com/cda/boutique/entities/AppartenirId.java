package com.cda.boutique.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class AppartenirId implements Serializable {

    @Column(name = "PR_ID")
    private Integer produitId;

    @Column(name = "CA_ID")
    private Integer categorieId;

}
