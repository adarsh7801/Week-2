package com.hybrid;

//subclass that implement worker interface
public class Waiter extends Person implements Worker {
    String shift;

    public Waiter(String name, int id, String shift) {
        super(name, id);
        this.shift = shift;
    }

    @Override
    public void performDuties() {
        System.out.println("Waiter Duties: Serving food and ensuring customer satisfaction.");
    }

    @Override
    public void displayDetails() {
        super.displayDetails(); // Call superclass method
        System.out.println("Shift: " + shift);
    }
}
