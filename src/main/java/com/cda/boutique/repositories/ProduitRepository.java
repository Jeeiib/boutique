package com.cda.boutique.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cda.boutique.entities.Produit;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduitRepository extends JpaRepository<Produit, Integer> {

}
