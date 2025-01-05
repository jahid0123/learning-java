package classTwentyFour.Test;


import java.time.LocalDate;
import java.util.Date;

public class Employee1 {
    private String name;
    private LocalDate yearOfJoining;
    private double salary;
    private String address;

    public Employee1(String name, LocalDate yearOfJoining, double salary, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getYear_of_joining() {
        return yearOfJoining;
    }

    public void setYear_of_joining(LocalDate year_of_joining) {
        this.yearOfJoining = year_of_joining;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {

        return name + "\t"+ yearOfJoining.getYear() +
                "\t\t\t" + address;
    }
}
