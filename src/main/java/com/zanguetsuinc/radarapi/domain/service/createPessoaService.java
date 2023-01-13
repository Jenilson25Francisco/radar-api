package com.zanguetsuinc.radarapi.domain.service;

import com.zanguetsuinc.radarapi.domain.exceptions.NegocioException;
import com.zanguetsuinc.radarapi.domain.model.Anuncio;
import com.zanguetsuinc.radarapi.domain.model.Pessoa;
import com.zanguetsuinc.radarapi.domain.repository.AnuncioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@AllArgsConstructor
@Service
public class createPessoaService {

    private final AnuncioRepository anuncioRepository;

    @Transactional
    public Pessoa anunciar(Long pessoaId  ,Pessoa pessoa){



        return null; //pessoa.adicionarPessoas(descricao);

    }

}
