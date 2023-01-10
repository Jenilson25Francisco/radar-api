package com.zanguetsuinc.radarapi.api.model.Input;

import com.zanguetsuinc.radarapi.common.FileContentType;
import com.zanguetsuinc.radarapi.common.FileSize;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.MediaType;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
public class FotoPessoaInput {

    @NotNull
    @FileSize(max = "700KB")
    @FileContentType(allowed = { MediaType.IMAGE_JPEG_VALUE, MediaType.IMAGE_PNG_VALUE })
    private MultipartFile arquivo;
    @NotBlank
    private String descricao;

}
