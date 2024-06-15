package org.example;

public class Student {
    private int id;
    private String lastName;
    private String firstName;
    private double gpe;

    public Student(int id, String lastName, String firstName, double gpe) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.gpe = gpe;
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public double getGpe() {
        return gpe;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", gpe=" + gpe +
                '}';
    }
}