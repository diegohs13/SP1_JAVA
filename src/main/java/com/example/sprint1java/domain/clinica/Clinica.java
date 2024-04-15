package com.example.sprint1java.domain.clinica;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.*;

@Table(name = "tb_clinica")
@Entity(name = "Clinica")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Clinica {
    @Id
    @Column(name = "cnpj")
    private int cnpj;

    @Column(name = "nome_clinica")
    private String nome_clinica;

    @Column(name = "tel_clinica")
    private Number tel_clinica;

    @Column(name = "conveniada")
    private char conveniada;
}
