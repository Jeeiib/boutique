package com.cda.boutique.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cda.boutique.entities.Categorie;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieRepository extends JpaRepository<Categorie, Integer> {

}
