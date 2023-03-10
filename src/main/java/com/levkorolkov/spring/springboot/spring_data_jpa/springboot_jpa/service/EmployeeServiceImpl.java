package com.levkorolkov.spring.springboot.spring_data_jpa.springboot_jpa.service;

import com.levkorolkov.spring.springboot.spring_data_jpa.springboot_jpa.dao.EmployeeRepository;
import com.levkorolkov.spring.springboot.spring_data_jpa.springboot_jpa.entity.Employee;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployee(int id) {
        Employee employee = null;
        Optional<Employee> optional = employeeRepository.findById(id);
        if(optional.isPresent()) {
            employee = optional.get();
        }
        return employee;
    }


    public void deleteEmployee(int id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public List<Employee> findAllByName(String name) {
       List<Employee> employees = employeeRepository.findAllByName(name);
       return employees;
    }
}
