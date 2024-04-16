package com.example.sprint1java.repository;

import com.example.sprint1java.domain.paciente.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface pacienteRepository extends JpaRepository<Paciente, Integer> {
}
