package com.cda.boutique.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cda.boutique.entities.Appartenir;
import com.cda.boutique.entities.AppartenirId;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface AppartenirRepository extends JpaRepository<Appartenir, AppartenirId> {

    List<Appartenir> findByProduitId(Integer produitId);

    List<Appartenir> findByCategorieId(Integer categorieId);

}
