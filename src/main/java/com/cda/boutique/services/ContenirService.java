package com.cda.boutique.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cda.boutique.entites.Contenir;
import com.cda.boutique.entites.ContenirID;
import com.cda.boutique.repositories.ContenirRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ContenirService {
    
    private final ContenirRepository contenirRepository;

    public List<Contenir> findAll(){
        List<Contenir> contenirs = contenirRepository.findAll();
        return contenirs;
    }

    public Contenir find(Integer produitId, Integer commandeId){
        Contenir contenir = null;
        if (contenirRepository.findById(new ContenirID(produitId, commandeId)).isPresent()) {
            contenir = contenirRepository.findById(new ContenirID(produitId, commandeId)).get();
        }
        return contenir;
    }

    public void save(Contenir contenir){
        contenirRepository.save(contenir);
    }

    public void remove(Integer produitId, Integer commandeId){
        contenirRepository.deleteById(new ContenirID(produitId, commandeId));
    }

    
}
