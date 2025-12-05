package com.cda.boutique.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cda.boutique.entites.Produit;
import com.cda.boutique.repositories.ProduitRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProduitService {
    
    private final ProduitRepository produitRepository;

    public List<Produit> findAll(){
        List<Produit> produits = produitRepository.findAll();
        return produits;
    }

    public Produit find(Integer id){
        Produit produit = null;
        if (produitRepository.findById(id).isPresent()) {
            produit = produitRepository.findById(id).get();
        }
        return produit;
    }

    public void save(Produit produit){
        produitRepository.save(produit);
    }

    public void remove(Integer id){
        produitRepository.deleteById(id);
    }

    
}
