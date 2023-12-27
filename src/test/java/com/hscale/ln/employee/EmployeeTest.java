package com.hscale.ln.employee;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

   static private List<Employee> employeeList= new LinkedList<>();

    void setUp(){
        employeeList.add(new Employee("IT", 10000, false));
        employeeList.add(new Employee("Commerce", 20000, true));
        employeeList.add(new Employee("Infra", 30000, true));
        employeeList.add(new Employee("Business", 40000, true));
    }

    @Test
    void should_return_overall_salary_expenditure(){
       //total full time salary
       double totalSum= employeeList.stream().mapToDouble(Employee::getSalary).average().orElseThrow();
       assertEquals(90000,totalSum);

    }

}