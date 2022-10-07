package com.Techwave.Hospital.dao;

import com.Techwave.Hospital.pojo.Account;
import com.Techwave.Hospital.pojo.Appointment;

import java.util.List;

public interface IAppointmentDAO {
    List<Appointment> getAllAppointments();
    Appointment getByAppointmentID(int appointmentID);
    String insertAppointment(Appointment appointment);
    String deleteAppointment(Appointment appointment);
    String updateAppointment(Appointment appointment, int appointmentID);
}
