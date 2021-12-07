package com.company;
//Task 05
public class Employee {

    private String firstName;
    private String lastName;
    private double salary;

    public Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        if(salary<0){
            this.salary=0.0;
        }else {
            this.salary = salary;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary < 0){
            this.salary = 0.0;
        }else {
            this.salary = salary;
        }
    }

    public void salaryIncrease(double precentage){
        salary = salary * ((100 + precentage)/100);
        System.out.println("Salary increased....");
    }
}
