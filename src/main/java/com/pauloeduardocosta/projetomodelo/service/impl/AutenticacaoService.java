package com.pauloeduardocosta.projetomodelo.service.impl;

import com.pauloeduardocosta.projetomodelo.dto.LoginDTO;
import com.pauloeduardocosta.projetomodelo.dto.TokenDTO;
import com.pauloeduardocosta.projetomodelo.enums.ETipoToken;
import com.pauloeduardocosta.projetomodelo.config.security.service.ITokenService;
import com.pauloeduardocosta.projetomodelo.service.IAutenticacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
public class AutenticacaoService implements IAutenticacaoService {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private ITokenService tokenService;

    @Override
    public TokenDTO autenticar(LoginDTO loginDTO) {
        UsernamePasswordAuthenticationToken dadosLogin = loginDTO.converter();
        Authentication authenticate = authenticationManager.authenticate(dadosLogin);
        String token = tokenService.gerarToken(authenticate);

        return new TokenDTO(token, ETipoToken.BEARER.getDescricao());
    }
}
