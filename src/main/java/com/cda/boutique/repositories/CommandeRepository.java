package com.cda.boutique.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cda.boutique.entities.Commande;
import org.springframework.stereotype.Repository;


@Repository
public interface CommandeRepository  extends JpaRepository<Commande, Integer>{
    
}
