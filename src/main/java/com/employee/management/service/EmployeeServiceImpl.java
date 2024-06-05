package com.employee.management.service;

import com.employee.management.model.Employee;
import com.employee.management.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements  EmployeeService  {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {

        return employeeRepository.findAll();
    }

    @Override
    public void save(Employee employee) {
        if (Objects.nonNull(employee)){
            employeeRepository.save(employee);
        }
        employeeRepository.save(employee);

    }

    @Override
    public Employee getById(long id) {
        Employee employee = null;
        if (Objects.nonNull(id)){
            Optional<Employee> optionalEmployee= employeeRepository.findById(Math.toIntExact(id));

            if (optionalEmployee.isPresent()){
                employee = optionalEmployee.get();
            }else {
                throw new RuntimeException("Employee not found with id "+ id);

            }


        }
        return employee;

    }

    @Override
    public void deleteById(long id) {
        if (Objects.nonNull(id)){
            employeeRepository.deleteById(Math.toIntExact(id));
        }

    }
}
