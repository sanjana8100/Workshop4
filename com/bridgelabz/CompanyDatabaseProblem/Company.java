package com.bridgelabz.CompanyDatabaseProblem;

import java.util.ArrayList;

public class Company {
    public ArrayList<Employee> company = new ArrayList<>();

    private String companyName;

    public Company() {
    }

    public Company(String companyName) {
        this.companyName = companyName;
    }

    public ArrayList<Employee> getCompany() {
        return company;
    }

    public void setCompany(ArrayList<Employee> company) {
        this.company = company;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Company{" +
                "company=" + company +
                ", companyName='" + companyName + '\'' +
                "}\n";
    }
}
