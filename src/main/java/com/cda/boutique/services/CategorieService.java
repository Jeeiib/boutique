package com.cda.boutique.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cda.boutique.entites.Categorie;
import com.cda.boutique.repositories.CategorieRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CategorieService {
    
    private final CategorieRepository categorieRepository;

    public List<Categorie> findAll(){
        List<Categorie> categories = categorieRepository.findAll();
        return categories;
    }

    public Categorie find(Integer id){
        Categorie categorie = null;
        if (categorieRepository.findById(id).isPresent()) {
            categorie = categorieRepository.findById(id).get();
        }
        return categorie;
    }

    public void save(Categorie categorie){
        categorieRepository.save(categorie);
    }

    public void remove(Integer id){
        categorieRepository.deleteById(id);
    }

    
}
