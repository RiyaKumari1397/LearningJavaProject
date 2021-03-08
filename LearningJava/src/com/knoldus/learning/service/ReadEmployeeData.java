package com.knoldus.learning.service;

import com.knoldus.learning.entity.Employee;

import java.io.FileNotFoundException;
import java.util.List;

@FunctionalInterface
public interface ReadEmployeeData {
    List<Employee> readDataFromDatabase() throws FileNotFoundException;
}
