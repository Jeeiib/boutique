package com.cda.boutique.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.RequiredArgsConstructor;
import com.cda.boutique.services.AppartenirService;
import java.util.List;
import com.cda.boutique.entities.Appartenir;
import com.cda.boutique.entities.AppartenirId;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;

@RestController
@RequestMapping(value = "api/appartenir", produces = "application/json")
@RequiredArgsConstructor
public class AppartenirController {

    private final AppartenirService appartenirService;

    @GetMapping
    public ResponseEntity<List<Appartenir>> getAll() {
        return ResponseEntity.ok(appartenirService.findAll());
    }

    @GetMapping("/produit/{produitId}")
    public ResponseEntity<List<Appartenir>> getByProduit(@PathVariable("produitId") Integer produitId) {
        return ResponseEntity.ok(appartenirService.findByProduit(produitId));
    }

    @GetMapping("/categorie/{categorieId}")
    public ResponseEntity<List<Appartenir>> getByCategorie(@PathVariable("categorieId") Integer categorieId) {
        return ResponseEntity.ok(appartenirService.findByCategorie(categorieId));
    }

    @PostMapping
    public ResponseEntity<String> add(@RequestBody Appartenir appartenir) {
        appartenirService.save(appartenir);
        return ResponseEntity.ok("{\"message\": \"Association produit-categorie added successfully\"}");
    }

    @DeleteMapping("/produit/{produitId}/categorie/{categorieId}")
    public ResponseEntity<String> delete(
            @PathVariable("produitId") Integer produitId,
            @PathVariable("categorieId") Integer categorieId) {
        AppartenirId id = new AppartenirId(produitId, categorieId);
        appartenirService.remove(id);
        return ResponseEntity.ok("{\"message\": \"Association produit-categorie deleted successfully\"}");
    }

}
