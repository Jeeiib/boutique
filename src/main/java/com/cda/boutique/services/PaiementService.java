package com.cda.boutique.services;

import org.springframework.stereotype.Service;
import com.cda.boutique.repositories.PaiementRepository;
import lombok.RequiredArgsConstructor;
import java.util.List;
import com.cda.boutique.entities.Paiement;

@Service
@RequiredArgsConstructor
public class PaiementService {

    private final PaiementRepository paiementRepository;

    public List<Paiement> findAll() {
        return paiementRepository.findAll();
    }

    public Paiement find(Integer id) {
        Paiement paiement = null;
        if (paiementRepository.findById(id).isPresent()) {
            paiement = paiementRepository.findById(id).get();
        }
        return paiement;
    }

    public void save(Paiement paiement) {
        paiementRepository.save(paiement);
    }
    
    public void remove(Integer id) {
        paiementRepository.deleteById(id);
    }
}
