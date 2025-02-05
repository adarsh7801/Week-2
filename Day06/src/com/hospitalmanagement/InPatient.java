// Package declaration
package com.hospitalmanagement;

import java.util.ArrayList;
import java.util.List;

// Class InPatient extending Patient and implementing MedicalRecord
public class InPatient extends Patient implements MedicalRecord {

    // Fields specific to in-patients
    private static final double DAILY_ROOM_CHARGE = 2000.0; // Daily room charge
    private int numberOfDays;                              // Number of days in the hospital
    private List<String> medicalRecords;                  // List of medical records

    // Constructor to initialize in-patient details
    public InPatient(String patientId, String name, int age, int numberOfDays) {
        super(patientId, name, age);
        this.numberOfDays = numberOfDays;
        this.medicalRecords = new ArrayList<>();
    }

    // Overriding method to calculate bill for in-patient
    @Override
    public double calculateBill() {
        return numberOfDays * DAILY_ROOM_CHARGE;
    }

    // Overriding method to add a medical record
    @Override
    public void addRecord(String record) {
        medicalRecords.add(record);
    }

    // Overriding method to view all medical records
    @Override
    public String viewRecords() {
        return "In-Patient Medical Records: " + String.join(", ", medicalRecords);
    }
}
