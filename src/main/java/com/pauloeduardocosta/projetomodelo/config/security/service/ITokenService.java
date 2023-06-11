package com.pauloeduardocosta.projetomodelo.config.security.service;

import org.springframework.security.core.Authentication;

public interface ITokenService {

    String gerarToken(Authentication authenticate);
    Boolean isTokenValido(String token);
    Long getIdUsuario(String token);
}
