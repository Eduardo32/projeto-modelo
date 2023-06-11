package com.pauloeduardocosta.projetomodelo.v1.rs;

import com.pauloeduardocosta.projetomodelo.dto.LoginDTO;
import com.pauloeduardocosta.projetomodelo.dto.TokenDTO;
import com.pauloeduardocosta.projetomodelo.service.IAutenticacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/login")
public class LoginRS {

    @Autowired
    private IAutenticacaoService autenticacaoService;

    @PostMapping()
    public ResponseEntity<TokenDTO> autenticar(@RequestBody LoginDTO loginDTO) {
        TokenDTO tokenDTO = autenticacaoService.autenticar(loginDTO);
        return ResponseEntity.ok(tokenDTO);
    }
}
