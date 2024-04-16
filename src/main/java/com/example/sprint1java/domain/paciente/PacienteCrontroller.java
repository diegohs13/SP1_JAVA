package com.example.sprint1java.domain.paciente;


import com.example.sprint1java.repository.pacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.util.Optional;

@RestController
@RequestMapping("/pacientes")
public class PacienteCrontroller {
    @Autowired
    private pacienteRepository repository;

    //Retorna todos os pacientes
    @GetMapping
    public ResponseEntity getAllPacientes(){
        var todosPacientes = repository.findAll();
        return new ResponseEntity<>(todosPacientes, HttpStatus.OK);
    }

    //Retorna um paciente pelo id
    @GetMapping("/{cpf}")
    public ResponseEntity<Paciente> getPacienteById(@PathVariable int cpf) {
        Optional<Paciente> paciente = repository.findById(cpf);
        return paciente.map(value -> new ResponseEntity<>(value, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    //Cria um novo paciente
    @PostMapping
    public Paciente createPaciente(@RequestBody @Valid RequestPaciente dadosPaciente) {
        Paciente paciente = new Paciente(dadosPaciente);
        return repository.save(paciente);
    }

    //Atualiza um paciente
    @PutMapping("/{cpf}")
    public ResponseEntity<Paciente> updatePaciente(@PathVariable int cpf, @RequestBody @Valid RequestPaciente dadosPaciente) {
        Optional<Paciente> optionalPaciente = repository.findById(cpf);
        if (optionalPaciente.isPresent()) {
            Paciente paciente = optionalPaciente.get();
            paciente.setCpf(cpf);
            paciente.setNome_completo(dadosPaciente.nome_completo());
            paciente.setData_nasc(dadosPaciente.data_nasc());
            paciente.setEnd_paciente(dadosPaciente.end_paciente());
            paciente.setTel_paciente(dadosPaciente.tel_paciente());
            paciente.setEmail_paciente(dadosPaciente.email_paciente());
            return new ResponseEntity<>(repository.save(paciente), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    //Deleta um paciente pelo id
    @DeleteMapping("/{cpf}")
    public ResponseEntity<HttpStatus> deletePaciente(@PathVariable int cpf) {
        try {
            repository.deleteById(cpf);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
