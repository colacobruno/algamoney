package com.algaworks.algamoneyapi.algamoneyapi.domain.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Cozinha {

    @Id
    private Long id;

    @Column(name = "NOME")
    private String nome;

}
