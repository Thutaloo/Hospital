package com.Techwave.Hospital.dao;

import com.Techwave.Hospital.pojo.Patient;
import com.Techwave.Hospital.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientDAO implements IPatientDAO {

    @Autowired
    PatientRepository patientRepository;

    @Override
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    @Override
    public Patient getByPatientID(int patientID) {
        return patientRepository.findById(patientID).get();
    }

    @Override
    public String insertPatient(Patient Patient) {
        patientRepository.save(Patient);
        return "Patient Created";
    }

    @Override
    public String updatePatient(Patient patient, int patientID) {
        Patient oldPatient = patientRepository.findById(patientID).get();
        if (oldPatient == null) {
            return "No Patient Found";
        }
        else {
            oldPatient.setPatientID(patient.getPatientID());
            oldPatient.setPatientName(patient.getPatientName());
            patientRepository.save(oldPatient);
            return "Changes Saved";
        }
    }
}
