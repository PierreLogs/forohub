package com.aluracursos.forohub.topico;

import com.aluracursos.forohub.domain.Topico;

public record DatosDetalleTopico(
    Long id,
    String titulo,
    String mensaje,
    StatusTopico status
){
    public DatosDetalleTopico(Topico topico){
        this(
                topico.getId(),
                topico.getTitulo(),
                topico.getMensaje(),
                topico.getStatus()
        );
    }
}
