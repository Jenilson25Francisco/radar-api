package com.zanguetsuinc.radarapi.domain.service;

import com.zanguetsuinc.radarapi.domain.model.FotoPessoa;
import com.zanguetsuinc.radarapi.domain.repository.FotoPessoaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
@AllArgsConstructor
public class CatalogoFotoPessoaService {

    private FotoPessoaRepository fotoPessoaRepository;

    public void uploadFoto(MultipartFile file) {

        FotoPessoa fotoPessoa = new FotoPessoa();

        try {

            fotoPessoa.setDadosFoto(file.getBytes());
            fotoPessoa.setTipoFoto(file.getContentType());
            fotoPessoa.setNomeFoto(file.getOriginalFilename());
            fotoPessoaRepository.save(fotoPessoa);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
