package com.TeamFinderChPP.TeamFinder.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
//@RequestMapping("/api/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

//    @PostMapping
//    public ResponseEntity<Employee> createEmployee(@RequestBody String employeeBody) {
//        return new ResponseEntity<>(employeeService.registerNewEmployee(employeeBody),HttpStatus.CREATED);
//    }
    @PostMapping("/employees")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
        String email = employee.getEmail();
        String password = employee.getPassword();
        String name = employee.getName();
        Employee newEmployee = employeeService.registerNewEmployee(email, name,password);
        return new ResponseEntity<>(newEmployee, HttpStatus.CREATED);
    }
}