package com.authAuten.authAuten.domain.patient;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record PatientRequestDTO(@NotBlank String name, @NotNull Integer consultNumber) {
}
