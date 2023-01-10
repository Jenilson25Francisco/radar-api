package com.zanguetsuinc.radarapi.api.assembler;

import com.zanguetsuinc.radarapi.api.model.Input.PessoaInput;
import com.zanguetsuinc.radarapi.api.model.PessoaModel;
import com.zanguetsuinc.radarapi.domain.model.Pessoa;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@AllArgsConstructor
public class PessoaAssembler {

    private final ModelMapper modelMapper;

    public PessoaModel toModel(Pessoa pessoa) {

        return modelMapper.map(pessoa, PessoaModel.class);

    }

    public List<PessoaModel> toCollectionModel(List<Pessoa> pessoas) {

        return pessoas.stream()
                .map(this::toModel)
                .collect(Collectors.toList());

    }

    public Pessoa toEntity(PessoaInput pessoaInput) {

        return modelMapper.map(pessoaInput, Pessoa.class);

    }

}
