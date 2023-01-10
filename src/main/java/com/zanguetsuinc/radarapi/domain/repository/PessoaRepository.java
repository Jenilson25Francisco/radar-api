package com.zanguetsuinc.radarapi.domain.repository;

import com.zanguetsuinc.radarapi.domain.model.File;
import com.zanguetsuinc.radarapi.domain.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {


}
