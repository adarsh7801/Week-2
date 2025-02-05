package com.com.objectmodelling;

import java.util.ArrayList;
import java.util.List;

// Doctor Class
class Doctor {
    private String name;
    private String specialty;

    // Constructor
    public Doctor(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for specialty
    public String getSpecialty() {
        return specialty;
    }

    // Method to consult a patient (Communication between doctor and patient)
    public void consult(Patient patient) {
        System.out.println("Doctor " + name + " is consulting patient " + patient.getName() +
                " regarding " + patient.getSymptoms() + ".");
    }
}

// Patient Class
class Patient {
    private String name;
    private String symptoms;

    // Constructor
    public Patient(String name, String symptoms) {
        this.name = name;
        this.symptoms = symptoms;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for symptoms
    public String getSymptoms() {
        return symptoms;
    }

    // Method to consult with a doctor (Communication between patient and doctor)
    public void consult(Doctor doctor) {
        doctor.consult(this);  // Calls the consult method of Doctor
    }
}

// Hospital Class
class Hospital {
    private String name;
    private List<Doctor> doctors;
    private List<Patient> patients;

    // Constructor
    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    // Add a doctor to the hospital
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    // Add a patient to the hospital
    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    // Display the list of doctors in the hospital
    public void displayDoctors() {
        System.out.println("Doctors in " + name + ":");
        for (Doctor doctor : doctors) {
            System.out.println(" - " + doctor.getName() + " (" + doctor.getSpecialty() + ")");
        }
    }

    // Display the list of patients in the hospital
    public void displayPatients() {
        System.out.println("Patients in " + name + ":");
        for (Patient patient : patients) {
            System.out.println(" - " + patient.getName() + " (Symptoms: " + patient.getSymptoms() + ")");
        }
    }
}

// Main Class to Demonstrate Association and Communication
public class HospitalApp {
    public static void main(String[] args) {
        // Create the hospital
        Hospital hospital = new Hospital("City General Hospital");

        // Create doctors
        Doctor drSmith = new Doctor("Dr. Smith", "Cardiologist");
        Doctor drJohnson = new Doctor("Dr. Johnson", "Pediatrician");

        // Create patients
        Patient john = new Patient("John", "Chest pain and fatigue");
        Patient emily = new Patient("Emily", "Fever and cough");

        // Add doctors and patients to the hospital
        hospital.addDoctor(drSmith);
        hospital.addDoctor(drJohnson);
        hospital.addPatient(john);
        hospital.addPatient(emily);

        // Display hospital details
        hospital.displayDoctors();
        hospital.displayPatients();

        // Simulate consultations (Communication between Doctor and Patient)
        john.consult(drSmith); // John consults Dr. Smith
        emily.consult(drJohnson); // Emily consults Dr. Johnson
    }
}
