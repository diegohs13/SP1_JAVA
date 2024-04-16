package com.example.sprint1java.repository;

import com.example.sprint1java.domain.clinica.Clinica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface clinicaRepository extends JpaRepository<Clinica, Integer> {
}