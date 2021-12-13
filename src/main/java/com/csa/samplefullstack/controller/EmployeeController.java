package com.csa.samplefullstack.controller;

import com.csa.samplefullstack.entity.employee;
import com.csa.samplefullstack.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("*")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @RequestMapping("/employees")
    public List<employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    @PostMapping("/employees")
    public employee postEmployee(@RequestBody employee employee){
        return employeeRepository.save(employee);
    }

    @GetMapping("/employees/{id}")
    public employee getEmployeeFromId(@PathVariable Long id){
        return employeeRepository.findById(id).get();
    }

    @PutMapping("/employees")
    public employee putEmployee(@RequestBody employee employee){
        return employeeRepository.save(employee);
    }

    @DeleteMapping("/employees/{id}")
    public ResponseEntity<HttpStatus> deleteEmployeeFromId(@PathVariable Long id){
        employeeRepository.deleteById(id);
        return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
    }
}
