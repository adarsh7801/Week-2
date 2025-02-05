// Package declaration
package com.hospitalmanagement;

// Abstract class Patient representing a generic patient
abstract class Patient {

    // Fields for patient details
    private String patientId; // Unique ID of the patient
    private String name;      // Name of the patient
    private int age;          // Age of the patient

    // Constructor to initialize patient details
    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Concrete method to get patient details
    public String getPatientDetails() {
        return "Patient ID: " + patientId + ", Name: " + name + ", Age: " + age;
    }

    // Abstract method to calculate the bill
    abstract double calculateBill();
}
