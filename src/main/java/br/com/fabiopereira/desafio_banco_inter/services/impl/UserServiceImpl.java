package br.com.fabiopereira.desafio_banco_inter.services.impl;

import br.com.fabiopereira.desafio_banco_inter.domain.User;
import br.com.fabiopereira.desafio_banco_inter.repository.UserRepository;
import br.com.fabiopereira.desafio_banco_inter.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public UUID createUser(String name, String email) {
        var user = User.builder()
                .name(name)
                .email(email)
                .build();

        userRepository.save(user);
        return user.getId();
    }
}
