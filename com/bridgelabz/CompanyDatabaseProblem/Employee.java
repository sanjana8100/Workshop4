package com.bridgelabz.CompanyDatabaseProblem;

public class Employee {
    private String name;
    private String age;
    private String phoneNumber;
    private String city;
    private String state;
    private String department;

    public Employee() {
    }

    public Employee(String name, String age, String phoneNumber, String city, String state, String department) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.state = state;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", department='" + department + '\'' +
                "}\n";
    }
}
