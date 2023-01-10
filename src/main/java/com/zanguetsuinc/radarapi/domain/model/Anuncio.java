package com.zanguetsuinc.radarapi.domain.model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Anuncio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;
    private OffsetDateTime dataAnuncio;
    @ManyToOne
    private Users user;
    @ManyToOne(cascade = CascadeType.ALL)
    private List<Pessoa> pessoas = new ArrayList<>();
    @Embedded
    private Endereco endereco;

    public Pessoa adicionarPessoas(String descricao) {

        Pessoa pessoa = new Pessoa();
        pessoa.setStatus(StatusPessoa.DESAPARECIDA);
        pessoa.setAnuncio(this);

        this.getPessoas().add(pessoa);

        return pessoa;

    }
}
