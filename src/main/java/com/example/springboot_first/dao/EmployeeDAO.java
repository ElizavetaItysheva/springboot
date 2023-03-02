package com.example.springboot_first.dao;

import com.example.springboot_first.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> getAllOdEmployees();
    Employee getEmployeeById(int id);
    void addEmployee(Employee employee);
    void updateEmployee(Employee employee);
    void deleteEmployee(int id);

}