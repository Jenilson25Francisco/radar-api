package com.zanguetsuinc.radarapi.api.model.Input;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AnuncioInput {

    @Valid
    @NotNull
    private UserIdInput user;
    @Valid
    @NotNull
    private PessoaInput pessoa;
    @Valid
    @NotNull
    private EnderecoInput endereco;

}
