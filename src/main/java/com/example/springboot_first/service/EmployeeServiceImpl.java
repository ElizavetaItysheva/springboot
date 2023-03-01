package com.example.springboot_first.service;

import com.example.springboot_first.dao.EmployeeRepo;
import com.example.springboot_first.entity.Employee;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepo employeeRepo;

    public EmployeeServiceImpl( EmployeeRepo employeeRepo ) {
        this.employeeRepo = employeeRepo;
    }


    @Override

    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }

    @Override

    public Employee getEmployeeById( int id ) {
        Employee employee = employeeRepo.findById(id).get();
        return employee;
    }

    @Override

    public void addEmployee( Employee employee ) {
        employeeRepo.save(employee);
    }

    @Override

    public void updateEmployee( Employee employee ) {
        employeeRepo.save(employee);
    }

    @Override

    public void deleteEmployee( int id ) {

        employeeRepo.deleteById(id);
    }
}