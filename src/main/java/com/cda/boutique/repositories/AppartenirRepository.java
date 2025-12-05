package com.cda.boutique.repositories;

import com.cda.boutique.entites.AppartenirID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cda.boutique.entites.Appartenir;

@Repository
public interface  AppartenirRepository extends JpaRepository<Appartenir, AppartenirID> {
    
}
