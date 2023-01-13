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
    @ManyToOne
    private Pessoa pessoa;
    @Embedded
    private Endereco endereco;

}
