package com.zanguetsuinc.radarapi.api.model.Input;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
public class FotoPessoaInput {

    @NotNull
    private MultipartFile arquivo;
    @NotBlank
    private String descricao;

}
