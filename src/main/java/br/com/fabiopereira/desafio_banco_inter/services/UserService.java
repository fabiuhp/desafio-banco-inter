package br.com.fabiopereira.desafio_banco_inter.services;

import java.util.UUID;

public interface UserService {
    UUID createUser(String name, String email);
}
