package com.zanguetsuinc.radarapi.api.model.Input;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EnderecoInput {

    @NotNull
    @Size( max = 30)
    private String rua;
    @NotNull
    @Size(max = 70)
    private String cidade;
    @NotNull
    @Size(max = 90)
    private String bairro;

}
