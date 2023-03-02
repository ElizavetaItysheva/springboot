package com.example.springboot_first.dao;

import com.example.springboot_first.entity.Employee;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{
    private EntityManager entityManager;

    public EmployeeDAOImpl( EntityManager entityManager ) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> getAllOdEmployees() {

        return entityManager.createQuery("From Employee").getResultList();
    }

    @Override
    public Employee getEmployeeById( int id ) {
        return entityManager.find(Employee.class, id);
    }



    @Override
    public void addEmployee(Employee employee) {
        Employee employee1 = entityManager.merge(employee);
        employee.setId(employee1.getId());
    }

    @Override
    public void updateEmployee(Employee employee) {
        entityManager.merge(employee);
    }

    @Override
    public void deleteEmployee(int id) {
        Query query = entityManager.createQuery("delete from Employee where id=:id");
        query.setParameter("id", id);
        query.executeUpdate();
    }
}
