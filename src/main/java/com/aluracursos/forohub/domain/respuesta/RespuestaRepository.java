package com.aluracursos.forohub.domain.respuesta;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RespuestaRepository extends JpaRepository<Respuesta, Long> {
    Page<Respuesta> findAllByTopicoId(Long topicoId, Pageable paginacion);

    @Query("SELECT r FROM Respuesta r JOIN FETCH r.autor JOIN FETCH r.topico")
    Page<Respuesta> findAll(Pageable paginacion);
}
