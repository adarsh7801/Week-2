// Package declaration
package com.hospitalmanagement;

import java.util.ArrayList;
import java.util.List;

// Class OutPatient extending Patient and implementing MedicalRecord
public class OutPatient extends Patient implements MedicalRecord {

    // Fields specific to out-patients
    private static final double CONSULTATION_FEE = 500.0; // Consultation fee per visit
    private List<String> medicalRecords;                // List of medical records

    // Constructor to initialize out-patient details
    public OutPatient(String patientId, String name, int age) {
        super(patientId, name, age);
        this.medicalRecords = new ArrayList<>();
    }

    // Overriding method to calculate bill for out-patient
    @Override
    public double calculateBill() {
        return CONSULTATION_FEE;
    }

    // Overriding method to add a medical record
    @Override
    public void addRecord(String record) {
        medicalRecords.add(record);
    }

    // Overriding method to view all medical records
    @Override
    public String viewRecords() {
        return "Out-Patient Medical Records: " + String.join(", ", medicalRecords);
    }
}
