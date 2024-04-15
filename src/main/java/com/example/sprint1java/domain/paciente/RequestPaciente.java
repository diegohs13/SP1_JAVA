package com.example.sprint1java.domain.paciente;

public record RequestPaciente(int cpf, String nome_completo, String data_nasc,
                              String end_paciente, Number tel_paciente, String email_paciente) {
}
