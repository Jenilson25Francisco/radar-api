package com.zanguetsuinc.radarapi.api.model;

import com.zanguetsuinc.radarapi.domain.model.StatusPessoa;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PessoaModel {

    private Long id;
    private String nome;
    private Integer idade;
    private String descricao;
    private String imageUrl;
    private StatusPessoa status;

}
