package com.regis.eventosapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.regis.eventosapp.model.Evento;

public interface EventoRepository extends JpaRepository<Evento, Long> {

	Evento findByCodigo(Long codigo);
	
}