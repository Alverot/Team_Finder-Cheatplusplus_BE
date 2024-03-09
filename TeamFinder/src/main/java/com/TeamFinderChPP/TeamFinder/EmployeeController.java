package com.TeamFinderChPP.TeamFinder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<Employee> createEmployee(@RequestBody String employeeBody) {
        return new ResponseEntity<>(employeeService.createEmployee(employeeBody),HttpStatus.CREATED);
    }
}
