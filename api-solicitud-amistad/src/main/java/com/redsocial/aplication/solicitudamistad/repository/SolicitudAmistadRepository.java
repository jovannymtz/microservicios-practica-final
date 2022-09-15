package com.redsocial.aplication.solicitudamistad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

import com.redsocial.aplication.solicitudamistad.entity.SolicitudAmistad;

@Repository
public interface SolicitudAmistadRepository extends JpaRepository<SolicitudAmistad, String>{
	Optional<SolicitudAmistad> findById(String id);
}
