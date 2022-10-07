package com.Techwave.Hospital.repository;

import com.Techwave.Hospital.pojo.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {
}
