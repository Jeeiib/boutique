package com.cda.boutique.services;

import org.springframework.stereotype.Service;
import com.cda.boutique.repositories.ProduitRepository;
import lombok.RequiredArgsConstructor;
import java.util.List;
import com.cda.boutique.entities.Produit;

@Service
@RequiredArgsConstructor
public class ProduitService {

    private final ProduitRepository produitRepository;

    public List<Produit> findAll() {
        return produitRepository.findAll();
    }

    public Produit find(Integer id) {
        return produitRepository.findById(id).orElse(null);
    }

    public void save(Produit produit) {
        produitRepository.save(produit);
    }

    public void remove(Integer id) {
        produitRepository.deleteById(id);
    }

}
