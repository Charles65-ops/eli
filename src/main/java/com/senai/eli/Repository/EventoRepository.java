package com.senai.eli.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.eli.Model.Evento;

public interface EventoRepository extends JpaRepository<Evento, Long> {

}
