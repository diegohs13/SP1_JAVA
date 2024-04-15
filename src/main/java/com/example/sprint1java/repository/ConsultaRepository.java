package com.example.sprint1java.repository;

import com.example.sprint1java.domain.consulta.Consulta;
import com.example.sprint1java.domain.consulta.Consulta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultaRepository extends JpaRepository<Consulta, Integer> {
}