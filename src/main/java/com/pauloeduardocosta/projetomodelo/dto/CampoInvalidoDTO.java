package com.pauloeduardocosta.projetomodelo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CampoInvalidoDTO {

    private String campo;
    private String erro;
}
