package com.cda.boutique.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cda.boutique.entites.Produit;
import com.cda.boutique.services.ProduitService;

import lombok.RequiredArgsConstructor;

@Controller
@RestController
@RequestMapping(value="/api/produits", produces="application/json")
@RequiredArgsConstructor
public class ProduitController {
    
    private final ProduitService produitService;


    @GetMapping
    public ResponseEntity<List<Produit>> getProduits(){
        return ResponseEntity.ok(produitService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produit> getProduit(@PathVariable("id") Integer id){
        return ResponseEntity.ok(produitService.find(id));
    }
    
    @PostMapping
    public ResponseEntity<String> addProduit(@RequestBody Produit produit){
        produitService.save(produit);
        return ResponseEntity.ok("{\"message\": \"Produit à bien été ajouté\"}");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateProduit(@PathVariable("id") Integer id,@RequestBody Produit produit){
        produit.setId(id);
        produitService.save(produit);
        return ResponseEntity.ok("{\"message\": \"Produit à bien été modifié\"}");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProduit(@PathVariable("id") Integer id){
        produitService.remove(id);
        return ResponseEntity.ok("{\"message\": \"Produit à bien été supprimé\"}");
    }
}
