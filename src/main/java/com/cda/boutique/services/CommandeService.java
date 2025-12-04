package com.cda.boutique.services;

import org.springframework.stereotype.Service;
import com.cda.boutique.repositories.CommandeRepository;
import lombok.RequiredArgsConstructor;
import java.util.List;
import com.cda.boutique.entities.Commande;

@Service
@RequiredArgsConstructor
public class CommandeService {
    private final CommandeRepository commandeRepository;

    public List<Commande> findAll() {
        return commandeRepository.findAll();
    }

    public Commande find(Integer id) {
        return commandeRepository.findById(id).orElse(null);
    }

    public void save(Commande commande) {
        commandeRepository.save(commande);
    }

    public void remove(Integer id) {
        commandeRepository.deleteById(id);
    }
}
