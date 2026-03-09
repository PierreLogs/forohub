package com.aluracursos.forohub.controller;

import com.aluracursos.forohub.domain.usuario.DatosAutenticacion;
import com.aluracursos.forohub.domain.usuario.Usuario;
import com.aluracursos.forohub.infra.security.DatosJWTToken;
import com.aluracursos.forohub.infra.security.TokenService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class AutenticacionController {
    @Autowired private AuthenticationManager manager;
    @Autowired private TokenService tokenService;

    @PostMapping
    public ResponseEntity iniciarSesion(@RequestBody @Valid DatosAutenticacion datos) {
        System.out.println("Login recibido: " + datos.login());
        System.out.println("Contraseña recibida: " + datos.contrasena());

        var authToken = new UsernamePasswordAuthenticationToken(datos.login(), datos.contrasena());
        var usuarioAutenticado = manager.authenticate(authToken);
        var JWTtoken = tokenService.generarToken((Usuario) usuarioAutenticado.getPrincipal());
        return ResponseEntity.ok(new DatosJWTToken(JWTtoken));
    }
}