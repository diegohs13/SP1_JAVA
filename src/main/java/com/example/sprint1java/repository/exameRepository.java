package com.example.sprint1java.repository;

import com.example.sprint1java.domain.exame.Exame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface exameRepository extends JpaRepository<Exame, Integer> {
}
