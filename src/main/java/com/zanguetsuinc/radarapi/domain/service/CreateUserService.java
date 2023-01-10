package com.zanguetsuinc.radarapi.domain.service;

import com.zanguetsuinc.radarapi.domain.exceptions.NegocioException;
import com.zanguetsuinc.radarapi.domain.model.Users;
import com.zanguetsuinc.radarapi.domain.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class CreateUserService {

    private final UserRepository userRepository;

    public Users buscar(Long userId) {

        return userRepository.findById(userId)
                .orElseThrow(() -> new NegocioException("Utilizador não encontrado"));

    }

    @Transactional
    public Users cadastrar(Users user) {

        boolean emailemuso = userRepository.findByEmail(user.getEmail())
                .stream()
                .anyMatch(existeUtilizador -> !existeUtilizador.equals(user));

        if (emailemuso) {

            throw new NegocioException("Já existe um utilizador com este email");

        }

        return userRepository.save(user);
    }

    @Transactional
    public void  apagar(Long userId) {

         userRepository.deleteById(userId);

    }

}
