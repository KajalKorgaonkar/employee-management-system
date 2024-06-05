package com.employee.management.service;

import com.employee.management.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void save(Employee employee);
    Employee getById(long id);
    void deleteById(long id);
}
