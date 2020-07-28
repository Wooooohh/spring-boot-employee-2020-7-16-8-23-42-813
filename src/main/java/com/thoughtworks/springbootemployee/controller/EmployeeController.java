package com.thoughtworks.springbootemployee.controller;


import com.thoughtworks.springbootemployee.entity.Employee;
import com.thoughtworks.springbootemployee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> getEmployees(){
        return employeeService.getEmployees();
    }

    @PostMapping("/employees")
    public void addEmployee(@RequestBody Employee employee){
            employeeService.addEmployees(employee);
    }

    @GetMapping("/employees/{id}")
    public void getEmployee(@PathVariable("id") int id){
        employeeService.getEmployee(id);
    }

    @PostMapping("/employees")
    public void addEmployees(@RequestBody List<Employee> employees){
        for (Employee employee :
             employees) {
            employeeService.addEmployees(employee);
        }
    }

    @PutMapping("/employees/{id}")
    public void updateEmployee(@PathVariable("id") int id, @RequestBody Employee employee){
        employeeService.updateEmployee(id,employee);
    }

    @DeleteMapping("/employees/{id}")
    public void deleteEmployee(@PathVariable("id") int id){
        employeeService.deleteEmployee(id);
    }


}
