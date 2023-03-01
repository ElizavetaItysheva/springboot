package com.example.springboot_first.dao;
import com.example.springboot_first.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {


}
