package com.example.sprint1java.repository;

import com.example.sprint1java.domain.agendamento.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgendamentoRepository extends JpaRepository<Agendamento, Integer> {
}
