package com.pauloeduardocosta.projetomodelo.v1.rs;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/teste")
public class TesteRS {

    @GetMapping("/mundo")
    public ResponseEntity testeMundo() {
        return ResponseEntity.ok("Olá, Mundo!");
    }

    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity testeAdmin() {
        return ResponseEntity.ok("Olá, Admin!");
    }
}
