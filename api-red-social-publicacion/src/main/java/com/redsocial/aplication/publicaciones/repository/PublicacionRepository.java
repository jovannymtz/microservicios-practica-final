package com.redsocial.aplication.publicaciones.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.redsocial.aplication.publicaciones.entity.Publicaciones;

@Repository
public interface PublicacionRepository extends JpaRepository<Publicaciones, String>{
	Optional<Publicaciones> findById(String id);
}