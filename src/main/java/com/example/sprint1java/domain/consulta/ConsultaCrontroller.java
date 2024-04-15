package com.example.sprint1java.domain.consulta;


import com.example.sprint1java.repository.ConsultaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/consultas")
public class ConsultaCrontroller {
    @Autowired
    private ConsultaRepository repository;

    //Retorna todos as consultas
    @GetMapping()
    public ResponseEntity getAllConsultas(){
        var todasConsultas = repository.findAll();
        return new ResponseEntity<>(todasConsultas, HttpStatus.OK);
    }

    //Retorna uma consulta pelo id
    @GetMapping("/{id_unidade}")
    public ResponseEntity<Consulta> getConsultaById(@PathVariable int id_unidade) {
        Optional<Consulta> consulta = repository.findById(id_unidade);
        return consulta.map(value -> new ResponseEntity<>(value, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
