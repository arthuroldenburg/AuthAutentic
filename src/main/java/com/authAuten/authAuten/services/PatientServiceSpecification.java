package com.authAuten.authAuten.services;

import com.authAuten.authAuten.domain.patient.Patient;
import com.authAuten.authAuten.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceSpecification {

    @Autowired
    private PatientRepository patientRepository;

    public List<Patient> getAllPatients(){return this.patientRepository.findAll();}
}
