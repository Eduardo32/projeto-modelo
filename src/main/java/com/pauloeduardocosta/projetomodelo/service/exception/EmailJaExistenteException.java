package com.pauloeduardocosta.projetomodelo.service.exception;

public class EmailJaExistenteException extends RuntimeException {
    public EmailJaExistenteException(String mensagem) {
        super(mensagem);
    }

    public EmailJaExistenteException(String mensagem, Throwable cause) {
        super(mensagem, cause);
    }
}
