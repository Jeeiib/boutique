package com.cda.boutique.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.RequiredArgsConstructor;
import com.cda.boutique.services.ContenirService;
import java.util.List;
import com.cda.boutique.entities.Contenir;
import com.cda.boutique.entities.ContenirId;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

@RestController
@RequestMapping(value = "api/contenir", produces = "application/json")
@RequiredArgsConstructor
public class ContenirController {

    private final ContenirService contenirService;

    @GetMapping
    public ResponseEntity<List<Contenir>> getAll() {
        return ResponseEntity.ok(contenirService.findAll());
    }

    @GetMapping("/commande/{commandeId}")
    public ResponseEntity<List<Contenir>> getByCommande(@PathVariable("commandeId") Integer commandeId) {
        return ResponseEntity.ok(contenirService.findByCommande(commandeId));
    }

    @GetMapping("/produit/{produitId}")
    public ResponseEntity<List<Contenir>> getByProduit(@PathVariable("produitId") Integer produitId) {
        return ResponseEntity.ok(contenirService.findByProduit(produitId));
    }

    @PostMapping
    public ResponseEntity<String> add(@RequestBody Contenir contenir) {
        contenirService.save(contenir);
        return ResponseEntity.ok("{\"message\": \"Ligne de commande added successfully\"}");
    }

    @PutMapping("/produit/{produitId}/commande/{commandeId}")
    public ResponseEntity<String> update(
            @PathVariable("produitId") Integer produitId,
            @PathVariable("commandeId") Integer commandeId,
            @RequestBody Contenir contenir) {
        contenirService.save(contenir);
        return ResponseEntity.ok("{\"message\": \"Ligne de commande updated successfully\"}");
    }

    @DeleteMapping("/produit/{produitId}/commande/{commandeId}")
    public ResponseEntity<String> delete(
            @PathVariable("produitId") Integer produitId,
            @PathVariable("commandeId") Integer commandeId) {
        ContenirId id = new ContenirId(produitId, commandeId);
        contenirService.remove(id);
        return ResponseEntity.ok("{\"message\": \"Ligne de commande deleted successfully\"}");
    }

}
