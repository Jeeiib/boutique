package com.cda.boutique.services;

import org.springframework.stereotype.Service;
import com.cda.boutique.repositories.AppartenirRepository;
import lombok.RequiredArgsConstructor;
import java.util.List;
import com.cda.boutique.entities.Appartenir;
import com.cda.boutique.entities.AppartenirId;

@Service
@RequiredArgsConstructor
public class AppartenirService {

    private final AppartenirRepository appartenirRepository;

    public List<Appartenir> findAll() {
        return appartenirRepository.findAll();
    }

    public Appartenir find(AppartenirId id) {
        return appartenirRepository.findById(id).orElse(null);
    }

    public List<Appartenir> findByProduit(Integer produitId) {
        return appartenirRepository.findByProduitId(produitId);
    }

    public List<Appartenir> findByCategorie(Integer categorieId) {
        return appartenirRepository.findByCategorieId(categorieId);
    }

    public void save(Appartenir appartenir) {
        appartenirRepository.save(appartenir);
    }

    public void remove(AppartenirId id) {
        appartenirRepository.deleteById(id);
    }

}
