package com.pauloeduardocosta.projetomodelo.service;

import com.pauloeduardocosta.projetomodelo.dto.LoginDTO;
import com.pauloeduardocosta.projetomodelo.dto.TokenDTO;

public interface IAutenticacaoService {
    TokenDTO autenticar(LoginDTO loginDTO);
}
