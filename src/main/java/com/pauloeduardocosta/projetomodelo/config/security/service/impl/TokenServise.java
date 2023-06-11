package com.pauloeduardocosta.projetomodelo.config.security.service.impl;

import com.pauloeduardocosta.projetomodelo.config.security.entity.Usuario;
import com.pauloeduardocosta.projetomodelo.config.security.service.ITokenService;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class TokenServise implements ITokenService {

    @Value("${forum.jwt.expiration}")
    private Long expiration;

    @Value("${forum.jwt.secret}")
    private String secret;

    @Override
    public String gerarToken(Authentication authenticate) {
        Usuario usuario = (Usuario) authenticate.getPrincipal();
        Date hoje = new Date();
        Date exp = new Date(hoje.getTime() + expiration);
        StringBuilder subject = new StringBuilder()
                .append(usuario.getId());

        return Jwts.builder()
                .setIssuer("API - Auth")
                .setSubject(subject.toString())
                .setIssuedAt(hoje)
                .setExpiration(exp)
                .signWith(SignatureAlgorithm.HS256, secret)
                .compact();
    }

    @Override
    public Boolean isTokenValido(String token) {
        try {
            Jwts.parser()
                    .setSigningKey(this.secret)
                    .parseClaimsJws(token);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public Long getIdUsuario(String token) {
        Claims body = getBody(token);
        return Long.parseLong(body.getSubject());
    }

    private Claims getBody(String token) {
        return Jwts.parser()
                .setSigningKey(this.secret)
                .parseClaimsJws(token)
                .getBody();
    }
}
