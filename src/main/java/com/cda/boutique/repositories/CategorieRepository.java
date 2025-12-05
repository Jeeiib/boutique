package com.cda.boutique.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cda.boutique.entites.Categorie;

public interface CategorieRepository  extends JpaRepository<Categorie, Integer>{
    
}
