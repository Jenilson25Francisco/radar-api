package com.zanguetsuinc.radarapi.api.controller;

import com.zanguetsuinc.radarapi.domain.model.Users;
import com.zanguetsuinc.radarapi.domain.repository.UserRepository;
import com.zanguetsuinc.radarapi.domain.service.CreateUserService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/auth")
public class UserController {

    private UserRepository userRepository;
    private CreateUserService createUserService;

    @GetMapping
    public List<Users> lista() {
        return userRepository.findAll();
    }

    @PostMapping("/signup")
    @ResponseStatus(HttpStatus.CREATED)
    public Users cadastro(@Valid @RequestBody Users users) {

        return createUserService.cadastrar(users);

    }

}
