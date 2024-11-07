package br.com.fabiopereira.desafio_banco_inter.repository;

import br.com.fabiopereira.desafio_banco_inter.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
