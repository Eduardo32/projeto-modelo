package com.pauloeduardocosta.projetomodelo.config.security.repository;

import com.pauloeduardocosta.projetomodelo.config.security.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IUsuarioRepositry extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByLogin(String login);
    Optional<Usuario> findById(Long idUsuario);
}
