package com.Techwave.Hospital.repository;

import com.Techwave.Hospital.pojo.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

}
