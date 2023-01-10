package com.zanguetsuinc.radarapi.domain.repository;

import com.zanguetsuinc.radarapi.domain.model.Anuncio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnuncioRepository extends JpaRepository<Anuncio, Long> {


}
