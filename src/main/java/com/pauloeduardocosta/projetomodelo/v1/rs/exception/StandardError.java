package com.pauloeduardocosta.projetomodelo.v1.rs.exception;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class StandardError {

    private Integer status;
    private String mensagem;
    private LocalDateTime dateTime;

    public StandardError(Integer status, String mensagem, LocalDateTime localDateTime) {
        this.status = status;
        this.mensagem = mensagem;
        this.dateTime = localDateTime;
    }
}
