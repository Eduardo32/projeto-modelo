package com.pauloeduardocosta.projetomodelo.config.security.emun;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ETipoUsuario {
    ADMIN(1, "ROLE_ADMIN");

    private final int cod;
    private final String role;
}
