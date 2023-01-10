package com.zanguetsuinc.radarapi.domain.service;

import com.zanguetsuinc.radarapi.domain.model.Anuncio;
import com.zanguetsuinc.radarapi.domain.model.Users;
import com.zanguetsuinc.radarapi.domain.repository.AnuncioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.OffsetDateTime;

@Service
@AllArgsConstructor
public class CreateAnuncioService {

    private final AnuncioRepository anuncioRepository;
    private final CreateUserService createUserService;


    @Transactional
    public Anuncio anunciar(Anuncio anuncio) {

        Users user = createUserService.buscar(anuncio.getUser().getId());

        anuncio.setUser(user);
        anuncio.setDataAnuncio(OffsetDateTime.now());

        return anuncioRepository.save(anuncio);
    }

}
