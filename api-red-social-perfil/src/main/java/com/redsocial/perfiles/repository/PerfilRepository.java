package com.redsocial.perfiles.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.redsocial.perfiles.entity.Perfiles;

@Repository
public interface PerfilRepository extends JpaRepository<Perfiles, String> {
	Optional<Perfiles> findById(String id);
}
