package com.Techwave.Hospital.pojo;

import javax.persistence.*;

@Entity
public class Appointment {
    @Id
    @SequenceGenerator(
            name = "accountID",
            sequenceName = "accountID",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "accountID"
    )
    private int appointmentID;
    private String patientName;
    private String doctorName;
    private String appointmentDate;
    private String reason;
    private String diagnosis;
    private String prescription;

    public Appointment() {
    }

    public Appointment(int appointmentID, String patientName, String doctorName, String appointmentDate, String reason, String diagnosis, String prescription) {
        this.appointmentID = appointmentID;
        this.patientName = patientName;
        this.doctorName = doctorName;
        this.appointmentDate = appointmentDate;
        this.reason = reason;
        this.diagnosis = diagnosis;
        this.prescription = prescription;
    }

    public int getAppointmentID() {
        return appointmentID;
    }

    public void setAppointmentID(int appointmentID) {
        this.appointmentID = appointmentID;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }
}