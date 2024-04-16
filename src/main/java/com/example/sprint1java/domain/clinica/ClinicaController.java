package com.example.sprint1java.domain.clinica;

import com.example.sprint1java.repository.clinicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/clinicas")
public class ClinicaController {
    @Autowired
    private clinicaRepository repository;

    //Retorna todos as clinicas
    @GetMapping()
    public ResponseEntity getAllClinicas(){
        var todasClinicas = repository.findAll();
        return new ResponseEntity<>(todasClinicas, HttpStatus.OK);
    }

    //Retorna uma clinica pelo id
    @GetMapping("/{cnpj}")
    public ResponseEntity<Clinica> getClinicaById(@PathVariable int cnpj) {
        Optional<Clinica> clinica = repository.findById(cnpj);
        return clinica.map(value -> new ResponseEntity<>(value, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
