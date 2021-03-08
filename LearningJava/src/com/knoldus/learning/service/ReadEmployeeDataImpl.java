package com.knoldus.learning.service;

import com.knoldus.learning.entity.Employee;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadEmployeeDataImpl implements ReadEmployeeData{
    @Override
    public List<Employee> readDataFromDatabase() throws FileNotFoundException {
        String readLine = "";
        String splitLine = ",";
        List<Employee> employeeList = new ArrayList<>();
        try {
            BufferedReader br =new BufferedReader(new FileReader("/home/knoldus/Downloads/LearningJava/src/com/knoldus/learning/controller/employee.csv"));
            while ((readLine= br.readLine()) != null) {
                String[] employeeDataFile = readLine.split(splitLine);
                Employee addEmployee = new Employee(Integer.parseInt(employeeDataFile[0]), employeeDataFile[1]);
                employeeList.add(addEmployee);
            }
            }
        catch (Exception e) {
            e.printStackTrace();
        }
        return employeeList;
    }
}
