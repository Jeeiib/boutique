package com.cda.boutique.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import com.cda.boutique.entities.Client;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {
    
    
}
