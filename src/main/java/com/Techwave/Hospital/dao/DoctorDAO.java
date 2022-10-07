package com.Techwave.Hospital.dao;

import com.Techwave.Hospital.pojo.Doctor;
import com.Techwave.Hospital.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorDAO implements IDoctorDAO {

    @Autowired
    DoctorRepository doctorRepository;

    @Override
    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }

    @Override
    public Doctor getByDoctorID(int doctorID) {
        return doctorRepository.findById(doctorID).get();
    }

    @Override
    public String insertDoctor(Doctor doctor) {
        doctorRepository.save(doctor);
        return "Doctor Created";
    }

    @Override
    public String updateDoctor(Doctor doctor, int doctorID) {
        Doctor oldDoctor = doctorRepository.findById(doctorID).get();
        if (oldDoctor == null) {
            return "No Doctor Found";
        }
        else {
            oldDoctor.setDoctorID(doctorID);
            oldDoctor.setDoctorName(doctor.getDoctorName());
            oldDoctor.setSpecialty(doctor.getSpecialty());
            oldDoctor.setWorkSchedule(doctor.getWorkSchedule());
            doctorRepository.save(oldDoctor);
            return "Changes saved";
        }
    }
}
