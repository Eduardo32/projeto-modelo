package com.pauloeduardocosta.projetomodelo.service.exception;

public class ObjetoNaoEncotradoException extends RuntimeException {

    public ObjetoNaoEncotradoException(String mensagem) {
        super(mensagem);
    }

    public ObjetoNaoEncotradoException(String mensagem, Throwable cause) {
        super(mensagem, cause);
    }
}
