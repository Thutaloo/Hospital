package com.Techwave.Hospital.controllers;

import com.Techwave.Hospital.dao.AccountDAO;
import com.Techwave.Hospital.dao.DoctorDAO;
import com.Techwave.Hospital.dao.PatientDAO;
import com.Techwave.Hospital.pojo.Account;
import com.Techwave.Hospital.pojo.Doctor;
import com.Techwave.Hospital.pojo.Patient;
import oracle.ucp.proxy.annotation.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdminController {
    @Autowired
    AccountDAO accountDAO;

    @Autowired
    DoctorDAO doctorDAO;

    @Autowired
    PatientDAO patientDAO;

    @GetMapping("/getAllAccounts")
    public List<Account> getAllAccounts() {
        List<Account> list = accountDAO.getAllAccounts();
        return list;
    }

    @GetMapping("/getAccountByID/{accountID}")
    public Account getAccountByID(@PathVariable("accountID") int accountID) {
        return accountDAO.getByAccountID(accountID);
    }

    @PostMapping("/addAccount")
    public String addAccount(@RequestBody Account account) {
        return accountDAO.insertAccount(account);
    }

    @GetMapping("/getAllDoctors")
    public List<Doctor> getAllDoctors() {
        return doctorDAO.getAllDoctors();
    }
    @GetMapping("/getDoctorByID/{doctorID}")
    public Doctor getDoctorByID(@PathVariable("doctorID") int doctorID) {
        return doctorDAO.getByDoctorID(doctorID);
    }
    @PostMapping("/addDoctor")
    public String addDoctor(@RequestBody Doctor doctor) {
        return doctorDAO.insertDoctor(doctor);
    }
    @PutMapping("/updateDoctor/{doctorID}")
    public String updateDoctor(@RequestBody Doctor doctor, @PathVariable("doctorID") int doctorID) {
        return doctorDAO.updateDoctor(doctor, doctorID);
    }
    @GetMapping("/getAllPatients")
    public List<Patient> getAllPatients() {
        return patientDAO.getAllPatients();
    }
    @GetMapping("/getPatientByID/{patientID}")
    public Patient getPatientByID(@PathVariable("patientID") int patientID) {
        return patientDAO.getByPatientID(patientID);
    }
    @PostMapping("/addPatient")
    public String addPatient(@RequestBody Patient patient) {
        return patientDAO.insertPatient(patient);
    }
    @PutMapping("/updatePatient/{patientID}")
    public String updatePatient(@RequestBody Patient patient, @PathVariable("patientID") int patientID) {
        return patientDAO.updatePatient(patient, patientID);
    }

}
