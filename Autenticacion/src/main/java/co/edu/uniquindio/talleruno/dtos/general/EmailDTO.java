package co.edu.uniquindio.talleruno.dtos.general;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record EmailDTO(

        @NotBlank
        String asunto,

        @NotBlank
        @Email
        String para,
        @NotBlank
        String mensaje
) {
}