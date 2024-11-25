package com.senai.eli.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name = "Gdt")
@Entity
@Getter
@Setter
public class Gdt { 

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "descricao_Gdt")
    private String descricaoGdt;

    @Column(name = "Responsavel")
    private String responsavel;

    @Column(name = "Email_de_Contato")
    private String email;

    @Column(name = "Nome_do_grupo", nullable = false) 
    private String nomeGrupo;


}
