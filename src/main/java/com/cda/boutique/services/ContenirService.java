package com.cda.boutique.services;

import org.springframework.stereotype.Service;
import com.cda.boutique.repositories.ContenirRepository;
import lombok.RequiredArgsConstructor;
import java.util.List;
import com.cda.boutique.entities.Contenir;
import com.cda.boutique.entities.ContenirId;

@Service
@RequiredArgsConstructor
public class ContenirService {

    private final ContenirRepository contenirRepository;

    public List<Contenir> findAll() {
        return contenirRepository.findAll();
    }

    public Contenir find(ContenirId id) {
        return contenirRepository.findById(id).orElse(null);
    }

    public List<Contenir> findByCommande(Integer commandeId) {
        return contenirRepository.findByCommandeId(commandeId);
    }

    public List<Contenir> findByProduit(Integer produitId) {
        return contenirRepository.findByProduitId(produitId);
    }

    public void save(Contenir contenir) {
        contenirRepository.save(contenir);
    }

    public void remove(ContenirId id) {
        contenirRepository.deleteById(id);
    }

}
