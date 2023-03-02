package com.example.springboot_first.service;

import com.example.springboot_first.dao.EmployeeDAO;
import com.example.springboot_first.entity.Employee;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    private final EmployeeDAO employeeDAO;

    public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }


    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllOdEmployees();
    }

    @Override
    @Transactional
    public Employee getEmployeeById( int id ) {
        Employee employee = employeeDAO.getEmployeeById(id);
        return  employee;
    }

    @Override
    @Transactional
    public void addEmployee( Employee employee ) {
        employeeDAO.addEmployee(employee);
    }

    @Override
    @Transactional
    public void updateEmployee( Employee employee ) {
        employeeDAO.updateEmployee(employee);
    }

    @Override
    @Transactional
    public void deleteEmployee( int id ) {
        employeeDAO.deleteEmployee(id);
    }
}