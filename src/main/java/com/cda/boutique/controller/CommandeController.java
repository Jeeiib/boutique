package com.cda.boutique.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.RequiredArgsConstructor;
import com.cda.boutique.services.CommandeService;
import java.util.List;
import com.cda.boutique.entities.Commande;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

@Controller
@RestController
@RequestMapping(value= "api/commandes", produces= "application/json")
@RequiredArgsConstructor
public class CommandeController {
    private final CommandeService commandeService;
    
    @GetMapping
    public ResponseEntity<List<Commande>> getCommandes() {
        return ResponseEntity.ok(commandeService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Commande> getCommande(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(commandeService.find(id));
    }

    @PostMapping
    public ResponseEntity<String> addCommande(@RequestBody Commande commande) {
        commandeService.save(commande);
        return ResponseEntity.ok("{\"message\": \"Commande added successfully\"}");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateCommande(@PathVariable("id") Integer id, @RequestBody Commande commande) {
        commandeService.save(commande);
        return ResponseEntity.ok("{\"message\": \"Commande updated successfully\"}");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCommande(@PathVariable("id") Integer id) {
        commandeService.remove(id);
        return ResponseEntity.ok("{\"message\": \"Commande deleted successfully\"}");
    }
}
