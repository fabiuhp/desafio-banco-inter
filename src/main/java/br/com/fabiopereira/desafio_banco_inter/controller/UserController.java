package br.com.fabiopereira.desafio_banco_inter.controller;

import br.com.fabiopereira.desafio_banco_inter.controller.dto.CreateUserRequest;
import br.com.fabiopereira.desafio_banco_inter.controller.dto.CreateUserResponse;
import br.com.fabiopereira.desafio_banco_inter.services.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping
    public ResponseEntity<CreateUserResponse> createUser(@RequestBody @Valid CreateUserRequest createUserRequest) {
        var createdUserId = userService.createUser(createUserRequest.name(), createUserRequest.email());
        var response = new CreateUserResponse(createdUserId);
        return ResponseEntity.ok(response);
    }
}
