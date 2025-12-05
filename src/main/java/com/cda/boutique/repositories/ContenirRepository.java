package com.cda.boutique.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cda.boutique.entites.Contenir;
import com.cda.boutique.entites.ContenirID;

@Repository
public interface ContenirRepository extends JpaRepository<Contenir,ContenirID> {
    
}
