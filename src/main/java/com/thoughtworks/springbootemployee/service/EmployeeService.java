package com.thoughtworks.springbootemployee.service;


import com.thoughtworks.springbootemployee.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    private List<Employee> employeeList = new ArrayList<>();

    public List<Employee> getEmployees(){
        return employeeList;
    }

    public void addEmployees(Employee employee) {
        employeeList.add(employee);
    }

    public void updateEmployee(int id,Employee employee) {
        for (int i = 0; i < employeeList.size(); i++) {
            if( employeeList.get(i).getId() == id){
                employeeList.set(i,employee);
            }
        }

    }

    public void deleteEmployee(int id) {
        for (int i = 0; i < employeeList.size(); i++) {
            if(employeeList.get(i).getId() == id){
                employeeList.remove(i);
            }
        }
    }

    public Employee getEmployee(int id) {
        for (int i = 0; i < employeeList.size(); i++) {
            if(employeeList.get(i).getId() == id){
                return employeeList.get(i);
            }
        }
        return null;
    }
}
