package com.zanguetsuinc.radarapi.api.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AnuncioModel {

    private Long id;
    private ResumoUtilizadorModel resumoUtilizadorModel;
    private PessoaModel pessoaModel;
    private EndercoModel endercoModel;

}
