package com.TeamFinderChPP.TeamFinder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee createEmployee(String text){
        Employee employee = new Employee(text);

        employeeRepository.insert(employee);

        return employee;
    }


}