package com.example.springboot_first.service;

import com.example.springboot_first.entity.Employee;

import javax.transaction.Transactional;
import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    Employee getEmployeeById(int id);
    void addEmployee(Employee employee);
    void updateEmployee( Employee employee);
    void deleteEmployee( int id);
}
