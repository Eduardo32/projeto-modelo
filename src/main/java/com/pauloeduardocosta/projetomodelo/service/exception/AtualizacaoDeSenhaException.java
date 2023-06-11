package com.pauloeduardocosta.projetomodelo.service.exception;

public class AtualizacaoDeSenhaException extends RuntimeException {
    public AtualizacaoDeSenhaException(String mensagem) {
        super(mensagem);
    }
    public AtualizacaoDeSenhaException(String mensagem, Throwable cause) {
        super(mensagem, cause);
    }
}
