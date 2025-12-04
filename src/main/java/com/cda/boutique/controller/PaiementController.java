package com.cda.boutique.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.RequiredArgsConstructor;
import com.cda.boutique.services.PaiementService;
import java.util.List;
import com.cda.boutique.entities.Paiement;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

@Controller
@RestController
@RequestMapping(value= "api/paiements", produces= "application/json")
@RequiredArgsConstructor
public class PaiementController {
    private final PaiementService paiementService;

    @GetMapping
    public ResponseEntity<List<Paiement>> getPaiements() {
        return ResponseEntity.ok(paiementService.findAll());
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Paiement> getPaiement(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(paiementService.find(id));
    }

    @PostMapping
    public ResponseEntity<String> addPaiement(@RequestBody Paiement paiement) {
        paiementService.save(paiement);
        return ResponseEntity.ok("{\"message\": \"Paiement added successfully\"}");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updatePaiement(@PathVariable("id") Integer id, @RequestBody Paiement paiement) {
        paiementService.save(paiement);
        return ResponseEntity.ok("{\"message\": \"Paiement updated successfully\"}");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePaiement(@PathVariable("id") Integer id) {
        paiementService.remove(id);
        return ResponseEntity.ok("{\"message\": \"Paiement deleted successfully\"}");
    }
}
