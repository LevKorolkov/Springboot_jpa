package com.levkorolkov.spring.springboot.spring_data_jpa.springboot_jpa.dao;


import com.levkorolkov.spring.springboot.spring_data_jpa.springboot_jpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    public List<Employee> findAllByName(String name);

}
