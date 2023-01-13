package com.zanguetsuinc.radarapi.domain.model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;
    private String nome;
    private Integer idade;
    private String descricao;
    @Enumerated(EnumType.STRING)
    private StatusPessoa status;
    @OneToOne
    private FotoPessoa fotoPessoa;
}
