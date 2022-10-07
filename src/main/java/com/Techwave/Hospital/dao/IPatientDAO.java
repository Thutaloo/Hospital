package com.Techwave.Hospital.dao;

import com.Techwave.Hospital.pojo.Patient;

import java.util.List;

public interface IPatientDAO {
    List<Patient> getAllPatients();

    Patient getByPatientID(int patientID);

    String insertPatient(Patient Patient);

    String updatePatient(Patient patient, int patientID);
}
