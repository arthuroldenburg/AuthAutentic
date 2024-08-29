package com.authAuten.authAuten.domain.patient;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "patient")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    private Integer consultNumber;

    public Patient(PatientRequestDTO body) {
        this.name = body.name();
        this.consultNumber = body.consultNumber();
    }
}
