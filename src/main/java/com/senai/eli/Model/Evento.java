package com.senai.eli.Model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name = "evento")
@Entity
@Getter
@Setter
public class Evento { 

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "descricao")
    private String descricao;

    @Column(name = "ip")
    private String ip;

    @Column(name = "valor")
    private double valor;

    @Column(name = "banner")
    private String banner;

    @Column(name = "nome", nullable = false) 
    private String nome;

    @Column(name = "data")
    private LocalDate data;

}
