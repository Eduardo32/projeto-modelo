package com.pauloeduardocosta.projetomodelo.v1.rs.exception;

import com.pauloeduardocosta.projetomodelo.dto.CampoInvalidoDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor
public class ValidacaoError {

    private Integer status;
    private List<CampoInvalidoDTO> camposInvalidos;
    private LocalDateTime dateTime;

    public ValidacaoError(Integer status, LocalDateTime dateTime) {
        this.status = status;
        this.camposInvalidos = new ArrayList<>();
        this.dateTime = dateTime;
    }
}
