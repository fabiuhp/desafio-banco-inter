package br.com.fabiopereira.desafio_banco_inter.controller;

import br.com.fabiopereira.desafio_banco_inter.controller.dto.CreateUserRequest;
import br.com.fabiopereira.desafio_banco_inter.controller.dto.CreateUserResponse;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("users")
public class UserController {

    @PostMapping
    public ResponseEntity<CreateUserResponse> createUser(@RequestBody @Valid CreateUserRequest createUserRequest) {
        var response = new CreateUserResponse(UUID.randomUUID());
        return ResponseEntity.ok(response);
    }
}
