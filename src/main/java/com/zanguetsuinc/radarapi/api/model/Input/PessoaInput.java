package com.zanguetsuinc.radarapi.api.model.Input;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class PessoaInput {

    @NotBlank
    @Size(max = 90)
    private String nome;
    @NotBlank
    @Size(max = 3)
    private Integer idade;
    @NotBlank
    @Size(max = 1000)
    private String descricao;
    private String imageUrl;

}
