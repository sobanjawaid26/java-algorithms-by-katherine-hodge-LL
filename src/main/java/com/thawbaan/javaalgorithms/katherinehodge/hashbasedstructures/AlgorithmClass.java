package com.thawbaan.javaalgorithms.katherinehodge.hashbasedstructures;

import java.util.HashMap;
import java.util.HashSet;

public class AlgorithmClass {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Robby", 3827, "Technology");
        Employee employee2 = new Employee("Bobby", 9612, "Marketing");
        Employee employee3 = new Employee("Sally", 2519, "Sales");

        HashMap<Integer, Employee> employeesById = new HashMap<>();
        employeesById.put(employee1.id, employee1);
        employeesById.put(employee2.id, employee2);
        employeesById.put(employee3.id, employee3);

        Employee retrivedEmployee = employeesById.get(9612);

        if(retrivedEmployee != null) {
            System.out.println(retrivedEmployee.name);
        }

        HashSet<String> productCodes = new HashSet<>();
        productCodes.add("2T26B");
        productCodes.add("9K42P");
        productCodes.add("H5J781");

        System.out.println(productCodes.contains("H5J781"));
        System.out.println(productCodes.contains("H5J791"));

    }
}
