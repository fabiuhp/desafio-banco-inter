package br.com.fabiopereira.desafio_banco_inter.controller.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import java.util.UUID;

public record CreateUserResponse(
        @Schema(description = "User id", example = "123e4567-e89b-12d3-a456-426614174000")
        UUID id
) {
}
