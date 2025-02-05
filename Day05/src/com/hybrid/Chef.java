package com.hybrid;

//subclass that implement worker interface
public class Chef extends Person implements Worker {
    String specialty;

    // Constructor for Chef
    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    // Implement performDuties()
    @Override
    public void performDuties() {
        System.out.println("Chef Duties: Preparing delicious " + specialty + " dishes.");
    }

    // Display additional details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Specialty: " + specialty);
    }
}
