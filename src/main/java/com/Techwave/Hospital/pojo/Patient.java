package com.Techwave.Hospital.pojo;

import javax.persistence.*;

@Entity
public class Patient {
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
    private int patientID;
    private String patientName;

    public Patient() {
    }

    public Patient(int patientID, String patientName) {
        this.patientID = patientID;
        this.patientName = patientName;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
}