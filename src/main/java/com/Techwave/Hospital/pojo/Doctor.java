package com.Techwave.Hospital.pojo;

import javax.persistence.*;

@Entity
public class Doctor {
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
    private int doctorID;
    private String doctorName;
    private String specialty;
    private String workSchedule;

    public Doctor() {
    }

    public Doctor(int doctorID, String doctorName, String specialty, String workSchedule) {
        this.doctorID = doctorID;
        this.doctorName = doctorName;
        this.specialty = specialty;
        this.workSchedule = workSchedule;
    }

    public int getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getWorkSchedule() {
        return workSchedule;
    }

    public void setWorkSchedule(String workSchedule) {
        this.workSchedule = workSchedule;
    }
}