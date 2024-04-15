package com.example.sprint1java.domain.exame;

import com.example.sprint1java.repository.ExameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/exames")
public class ExameController {
    @Autowired
    private ExameRepository repository;

    //Retorna todos os exames
    @GetMapping()
    public ResponseEntity getAllExames(){
        var todosExames = repository.findAll();
        return new ResponseEntity<>(todosExames, HttpStatus.OK);
    }

    //Retorna um exame pelo id
    @GetMapping("/{id_exame}")
    public ResponseEntity<Exame> getExameById(@PathVariable int id_exame) {
        Optional<Exame> exame = repository.findById(id_exame);
        return exame.map(value -> new ResponseEntity<>(value, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
