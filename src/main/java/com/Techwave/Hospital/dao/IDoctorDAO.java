package com.Techwave.Hospital.dao;

import com.Techwave.Hospital.pojo.Doctor;

import java.util.List;

public interface IDoctorDAO {
    List<Doctor> getAllDoctors();

    Doctor getByDoctorID(int doctorID);

    String insertDoctor(Doctor doctor);

    String updateDoctor(Doctor doctor, int doctorID);

}
