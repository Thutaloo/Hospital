package com.Techwave.Hospital.controllers;

import com.Techwave.Hospital.dao.AppointmentDAO;
import com.Techwave.Hospital.pojo.Appointment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AppointmentController {
    @Autowired
    AppointmentDAO appointmentDAO;

    @GetMapping("/getAllAppointments")
    public List<Appointment> getAllAppointment() {
        List<Appointment> list = appointmentDAO.getAllAppointments();
        return list;
    }

    @GetMapping("/getAppointmentByID/{appointmentID}")
    public Appointment getAppointmentByID(@PathVariable("appointmentID") int appointmentID) {
        return appointmentDAO.getByAppointmentID(appointmentID);
    }

    @PostMapping("/addAppointment")
    public String addAppointment(@RequestBody Appointment appointment) {
        return appointmentDAO.insertAppointment(appointment);
    }

    @DeleteMapping("/cancelAppointment")
    public String cancelAppointment(Appointment appointment) {
        return appointmentDAO.deleteAppointment(appointment);
    }

    @PutMapping("/changeAppointment")
    public String updateAppointment(Appointment appointment, int appointmentID) {
        return appointmentDAO.updateAppointment(appointment, appointmentID);
    }
}
