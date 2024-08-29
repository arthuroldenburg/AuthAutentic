package com.authAuten.authAuten.domain.patient;

public record PatientResponseDTO(String id, String name, Integer consultNumber) {
    public PatientResponseDTO(Patient patient) {
        this(patient.getId(), patient.getName(), patient.getConsultNumber());
    }
}
