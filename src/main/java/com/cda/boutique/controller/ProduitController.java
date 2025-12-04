package com.cda.boutique.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.RequiredArgsConstructor;
import com.cda.boutique.services.ProduitService;
import java.util.List;
import com.cda.boutique.entities.Produit;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

@RestController
@RequestMapping(value = "api/produits", produces = "application/json")
@RequiredArgsConstructor
public class ProduitController {

    private final ProduitService produitService;

    @GetMapping
    public ResponseEntity<List<Produit>> getProduits() {
        return ResponseEntity.ok(produitService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produit> getProduit(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(produitService.find(id));
    }

    @PostMapping
    public ResponseEntity<String> addProduit(@RequestBody Produit produit) {
        produitService.save(produit);
        return ResponseEntity.ok("{\"message\": \"Produit added successfully\"}");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateProduit(@PathVariable("id") Integer id, @RequestBody Produit produit) {
        produitService.save(produit);
        return ResponseEntity.ok("{\"message\": \"Produit updated successfully\"}");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProduit(@PathVariable("id") Integer id) {
        produitService.remove(id);
        return ResponseEntity.ok("{\"message\": \"Produit deleted successfully\"}");
    }

}
