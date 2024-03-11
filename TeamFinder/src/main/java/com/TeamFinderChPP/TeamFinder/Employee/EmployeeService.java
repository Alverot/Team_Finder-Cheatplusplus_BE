package com.TeamFinderChPP.TeamFinder.Employee;

import com.TeamFinderChPP.TeamFinder.Employee.Employee;
import com.TeamFinderChPP.TeamFinder.Employee.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

//    public Employee createEmployee(String text){
//        Employee employee = new Employee(text);
//
//        employeeRepository.insert(employee);
//
//        return employee;
//    }
    public Employee registerNewEmployee(String email,String name ,String password ) {
        Employee newEmployee = new Employee(email, name,password );
        return employeeRepository.insert(newEmployee);
    }
}
