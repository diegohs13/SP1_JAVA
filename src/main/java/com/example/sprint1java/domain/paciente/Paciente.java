package com.example.sprint1java.domain.paciente;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Table(name = "tb_paciente")
@Entity(name = "Paciente")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Paciente {
    @Id
    @Column(name = "cpf")
    private int cpf;

    @Column(name = "nome_completo")
    private String nome_completo;

    @Column(name = "data_nasc")
    private String data_nasc;

    @Column(name = "end_paciente")
    private String end_paciente;

    @Column(name = "tel_paciente")
    private Number tel_paciente;

    @Column(name = "email_paciente")
    private String email_paciente;

    public Paciente(RequestPaciente dadosPaciente) {
        this.cpf = dadosPaciente.cpf();
        this.nome_completo = dadosPaciente.nome_completo();
        this.data_nasc = dadosPaciente.data_nasc();
        this.end_paciente = dadosPaciente.end_paciente();
        this.tel_paciente = dadosPaciente.tel_paciente();
        this.email_paciente = dadosPaciente.email_paciente();
    }
}
