package com.cda.boutique.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cda.boutique.entites.Produit;

@Repository
public interface ProduitRepository extends JpaRepository<Produit, Integer> {
    
}
