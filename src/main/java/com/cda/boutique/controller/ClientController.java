package com.cda.boutique.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.RequiredArgsConstructor;
import com.cda.boutique.services.ClientService;
import java.util.List;
import com.cda.boutique.entities.Client;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;


@Controller
@RestController
@RequestMapping(value= "api/clients", produces= "application/json")
@RequiredArgsConstructor
public class ClientController {

    private final ClientService clientService;

    @GetMapping
    public ResponseEntity<List<Client>> getClients() {
        return ResponseEntity.ok(clientService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Client> getClient(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(clientService.find(id));
    }

    @PostMapping
    public ResponseEntity<String> addClient(@RequestBody Client client) {
        clientService.save(client);
        return ResponseEntity.ok("{\"message\": \"Client added successfully\"}");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateClient(@PathVariable("id") Integer id, @RequestBody Client client) {
        clientService.save(client);
        return ResponseEntity.ok("{\"message\": \"Client updated successfully\"}");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteClient(@PathVariable("id") Integer id) {
        clientService.remove(id);
        return ResponseEntity.ok("{\"message\": \"Client deleted successfully\"}");
    }




}
