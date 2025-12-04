package com.cda.boutique.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cda.boutique.entities.Contenir;
import com.cda.boutique.entities.ContenirId;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ContenirRepository extends JpaRepository<Contenir, ContenirId> {

    List<Contenir> findByCommandeId(Integer commandeId);

    List<Contenir> findByProduitId(Integer produitId);

}
