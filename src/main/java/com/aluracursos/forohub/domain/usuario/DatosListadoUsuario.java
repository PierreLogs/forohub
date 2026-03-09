package com.aluracursos.forohub.domain.usuario;

public record DatosListadoUsuario(Long id, String login, String nombre, String email) {

    public DatosListadoUsuario(Usuario usuario) {
        this(usuario.getId(), usuario.getLogin(), usuario.getNombre(), usuario.getEmail());
    }
}
