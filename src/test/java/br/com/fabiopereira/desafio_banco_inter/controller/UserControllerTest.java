package br.com.fabiopereira.desafio_banco_inter.controller;

import br.com.fabiopereira.desafio_banco_inter.controller.dto.CreateUserRequest;
import br.com.fabiopereira.desafio_banco_inter.controller.dto.CreateUserResponse;
import br.com.fabiopereira.desafio_banco_inter.services.UserService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class UserControllerTest {

    private UserController userController;
    @Mock
    private UserService userService;

    @BeforeAll
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        userController = new UserController(userService);
    }

    @BeforeEach
    void resetMocks() {
        Mockito.reset(userService);
    }

    @Test
    void itShouldCreateUser() {
        CreateUserRequest userRequest = new CreateUserRequest("Fabio", "fabio@email.com");
        var uuid = UUID.randomUUID();
        when(userService.createUser(userRequest.name(), userRequest.email()))
                .thenReturn(uuid);

        var user = userController.createUser(userRequest);
        var body = user.getBody();

        assertEquals(body.id(), uuid);
        verify(userService, times(1)).createUser(userRequest.name(), userRequest.email());
    }
}