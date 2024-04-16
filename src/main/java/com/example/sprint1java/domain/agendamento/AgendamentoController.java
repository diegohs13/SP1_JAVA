package com.example.sprint1java.domain.agendamento;

import com.example.sprint1java.repository.agendamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/agendamentos")
public class AgendamentoController {
    @Autowired
    private agendamentoRepository repository;

    //Retorna todos os agendamentos
    @GetMapping()
    public ResponseEntity getAllAgendamentos(){
        var todosAgendamentos = repository.findAll();
        return new ResponseEntity<>(todosAgendamentos, HttpStatus.OK);
    }

    //Retorna um agendamento pelo id
    @GetMapping("/{n_protocolo}")
    public ResponseEntity<Agendamento> getAgendamentoById(@PathVariable int n_protocolo) {
        Optional<Agendamento> agendamento = repository.findById(n_protocolo);
        return agendamento.map(value -> new ResponseEntity<>(value, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

}
