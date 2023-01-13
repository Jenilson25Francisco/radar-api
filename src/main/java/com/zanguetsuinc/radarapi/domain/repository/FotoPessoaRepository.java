package com.zanguetsuinc.radarapi.domain.repository;

import com.zanguetsuinc.radarapi.domain.model.FotoPessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FotoPessoaRepository extends JpaRepository<FotoPessoa, Long> {
}
