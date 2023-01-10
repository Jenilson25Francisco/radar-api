package com.zanguetsuinc.radarapi.api.assembler;

import com.zanguetsuinc.radarapi.api.model.AnuncioModel;
import com.zanguetsuinc.radarapi.api.model.Input.AnuncioInput;
import com.zanguetsuinc.radarapi.domain.model.Anuncio;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@AllArgsConstructor
public class AnuncioAssembler {

    private ModelMapper modelMapper;

    public AnuncioModel toModel(Anuncio anuncio) {
        return modelMapper.map(anuncio, AnuncioModel.class);
    }

    public List<AnuncioModel> toCollectionModel(List<Anuncio> anuncios) {

        return anuncios.stream()
                .map(this::toModel)
                .collect(Collectors.toList());

    }

    public Anuncio toEntity(AnuncioInput anuncioInput) {

        return modelMapper.map(anuncioInput, Anuncio.class);

    }

}
