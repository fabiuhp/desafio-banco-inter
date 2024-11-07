package br.com.fabiopereira.desafio_banco_inter.controller.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

public record CreateUserRequest(
        @Schema(description = "User name", example = "João da Silva")
        @NotEmpty
        String name,

        @Schema(description = "User email", example = "email@email.com")
        @NotEmpty
        @Email
        String email
) {
}
