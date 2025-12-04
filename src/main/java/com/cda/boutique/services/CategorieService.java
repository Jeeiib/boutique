package com.cda.boutique.services;

import org.springframework.stereotype.Service;
import com.cda.boutique.repositories.CategorieRepository;
import lombok.RequiredArgsConstructor;
import java.util.List;
import com.cda.boutique.entities.Categorie;

@Service
@RequiredArgsConstructor
public class CategorieService {

    private final CategorieRepository categorieRepository;

    public List<Categorie> findAll() {
        return categorieRepository.findAll();
    }

    public Categorie find(Integer id) {
        return categorieRepository.findById(id).orElse(null);
    }

    public void save(Categorie categorie) {
        categorieRepository.save(categorie);
    }

    public void remove(Integer id) {
        categorieRepository.deleteById(id);
    }

}
