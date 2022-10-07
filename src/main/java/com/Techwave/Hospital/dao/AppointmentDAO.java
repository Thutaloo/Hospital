package com.Techwave.Hospital.dao;

import com.Techwave.Hospital.pojo.Appointment;
import com.Techwave.Hospital.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentDAO implements IAppointmentDAO {
    @Autowired
    AppointmentRepository appointmentRepository;

    @Override
    public List<Appointment> getAllAppointments() {
        List<Appointment> list = appointmentRepository.findAll();
        return list;
    }

    @Override
    public Appointment getByAppointmentID(int appointmentID) {
        Appointment appointment = appointmentRepository.findById(appointmentID).get();
        return appointment;
    }

    @Override
    public String insertAppointment(Appointment appointment) {
        appointmentRepository.save(appointment);
        return "Appointment made";
    }

    @Override
    public String deleteAppointment(Appointment appointment) {
        Appointment a = appointmentRepository.findById(appointment.getAppointmentID()).get();

        if (a == null) {
            return "No account found";
        } else {
            appointmentRepository.delete(a);
            return "Account deleted";
        }
    }

    @Override
    public String updateAppointment(Appointment appointment, int appointmentID) {
        Appointment oldAppointment = appointmentRepository.findById(appointmentID).get();

        if (oldAppointment == null)
            return "No appointment found";
        else {
            oldAppointment.setDoctorName(appointment.getDoctorName());
            oldAppointment.setAppointmentDate(appointment.getAppointmentDate());
            oldAppointment.setPrescription(appointment.getReason());
            return "Changes made";
        }
    }
}
