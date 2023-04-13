package com.bridgelabz.CompanyDatabaseProblem;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class CompanyMain {
    public static ArrayList<Company> companies = new ArrayList<>();

    public static void main(String[] args) {
        HashMap<String,ArrayList<Employee>> companyMap = new HashMap<>();

        Company company1 = new Company("HCL");
        companies.add(company1);
        companyMap.put(company1.getCompanyName(),company1.company);

        Employee employee1 = new Employee("Sanjana","22","5624867598","Delhi","Delhi","Marketing");
        Employee employee2 = new Employee("Sam","24","5894678945","Bangalore","Karnataka","Accounting");
        Employee employee3 = new Employee("Tim","23","986547895","Pune","Maharashtra","Finance");
        company1.company.add(employee1);
        company1.company.add(employee2);
        company1.company.add(employee3);

        Company company2 = new Company("TCS");
        companies.add(company2);
        companyMap.put(company2.getCompanyName(),company2.company);

        Employee employee4 = new Employee("Ben","22","5624867598","Delhi","Delhi","Marketing");
        Employee employee5 = new Employee("Ram","24","5894678945","Bangalore","Karnataka","Accounting");
        Employee employee6 = new Employee("Tom","23","986547895","Pune","Maharashtra","Finance");
        Employee employee7 = new Employee("Bill","23","986547895","Pune","Maharashtra","Finance");
        company2.company.add(employee4);
        company2.company.add(employee5);
        company2.company.add(employee6);
        company2.company.add(employee7);

        Company company3 = new Company("TJX");
        companies.add(company3);
        companyMap.put(company3.getCompanyName(),company3.company);

        Employee employee8 = new Employee("Tara","22","5624867598","Delhi","Delhi","Marketing");
        Employee employee9 = new Employee("Nitin","24","5894678945","Bangalore","Karnataka","Accounting");
        company3.company.add(employee8);
        company3.company.add(employee9);

        Comparator<Company> companyComparator = (o1, o2) -> {
            if (o1.getCompany().size()>o2.getCompany().size())
                return 1;
            if (o1.getCompany().size()<o2.getCompany().size())
                return -1;
            return 0;
        };

        System.out.println("Sorted List by defining Comparator: ");
        List<Company> sortedList1 = companies.stream().sorted(companyComparator).collect(Collectors.toList());
        System.out.println(sortedList1);
        System.out.println();

        System.out.println("Sorted List using comparing: ");
        List<Company> sortedList2 = companies.stream().sorted(Comparator.comparing(company -> company.getCompany().size())).collect(Collectors.toList());
        System.out.println(sortedList2);
        System.out.println();

        System.out.println("Displaying all the Employee Details in the Hash Map: ");
        System.out.println(companyMap);
        System.out.println();

        System.out.println("Displaying all the Employee Details across all companies whose city is 'Pune': ");
        List<Employee> puneEmployee = new ArrayList<>();
        companyMap.values().stream().forEach(company -> puneEmployee.addAll(company.stream().filter(employee -> employee.getCity().equals("Pune")).collect(Collectors.toList())));
        System.out.println(puneEmployee);
        System.out.println();

        System.out.println("HashMap of Employee based on city name: ");
        HashMap<String,List<Employee>> cityBasedMap = new HashMap<>();
        companies.stream().forEach(company -> company.getCompany().stream().forEach(employee -> {
            String city = employee.getCity();
            List<Employee> cityList = new ArrayList<>();
            companies.stream().forEach(comp -> cityList.addAll(comp.getCompany().stream().filter(emp -> emp.getCity().equals(city)).collect(Collectors.toList())));
            cityBasedMap.put(city, cityList);
        }));
        System.out.println(cityBasedMap);
    }
}
