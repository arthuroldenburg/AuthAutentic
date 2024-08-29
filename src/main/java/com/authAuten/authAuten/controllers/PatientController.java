package com.authAuten.authAuten.controllers;

import com.authAuten.authAuten.domain.patient.Patient;
import com.authAuten.authAuten.domain.patient.PatientRequestDTO;
import com.authAuten.authAuten.domain.patient.PatientResponseDTO;
import com.authAuten.authAuten.repositories.PatientRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    private PatientRepository patientRepository;

    @GetMapping
    public ResponseEntity<List<PatientResponseDTO>> getPatients(){
        return ResponseEntity.ok(patientRepository.findAll().stream().map(PatientResponseDTO::new).toList());
    }

    @PostMapping
    public ResponseEntity<Object> postPatient(@RequestBody @Valid PatientRequestDTO body) {
        Patient newPatient = new Patient(body);
        this.patientRepository.save(newPatient);
        return ResponseEntity.ok().build();
    }
}
