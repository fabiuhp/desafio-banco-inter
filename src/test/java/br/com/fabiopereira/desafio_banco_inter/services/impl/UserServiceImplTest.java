package br.com.fabiopereira.desafio_banco_inter.services.impl;

import br.com.fabiopereira.desafio_banco_inter.domain.User;
import br.com.fabiopereira.desafio_banco_inter.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

class UserServiceImplTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserServiceImpl userService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void createUserSuccessfully() {
        String name = "John Doe";
        String email = "john.doe@example.com";
        User user = User.builder().name(name).email(email).build();

        when(userRepository.save(any(User.class))).thenReturn(user);

        UUID userId = userService.createUser(name, email);

        assertNotNull(userId);
        verify(userRepository, times(1)).save(any(User.class));
    }
}