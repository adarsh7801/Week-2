// Package declaration
package com.hospitalmanagement;

// Main class to test the hospital management system
public class Main {

    // Method to display patient details and billing
    public static void displayPatientInfo(Patient patient) {
        // Displaying patient details
        System.out.println(patient.getPatientDetails());
        System.out.println("Total Bill: " + patient.calculateBill());

        // Checking if the patient has medical records
        if (patient instanceof MedicalRecord) {
            MedicalRecord record = (MedicalRecord) patient;
            System.out.println(record.viewRecords());
        }
    }

    // Main method
    public static void main(String[] args) {

        // Creating an in-patient object
        InPatient inPatient = new InPatient("P001", "Alice Brown", 30, 5);
        inPatient.addRecord("Admitted for fever");
        inPatient.addRecord("Underwent blood tests");

        // Creating an out-patient object
        OutPatient outPatient = new OutPatient("P002", "Bob Smith", 45);
        outPatient.addRecord("Visited for routine checkup");

        // Displaying information for in-patient
        System.out.println("In-Patient Details:");
        displayPatientInfo(inPatient);
        System.out.println();

        // Displaying information for out-patient
        System.out.println("Out-Patient Details:");
        displayPatientInfo(outPatient);
    }
}
