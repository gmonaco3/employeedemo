package com.example.employeedemo.controller;

import com.example.employeedemo.dto.response.EmployeeResponse;
import com.example.employeedemo.exception.ControllerException;
import com.example.employeedemo.model.Employee;
import com.example.employeedemo.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "employee")
public class EmployeeController {

    private final EmployeeService employeeService;
    private final ModelMapper myModelMapper;

    @GetMapping
    public List<EmployeeResponse> getAll() {
        List<EmployeeResponse> employeeResponse = new ArrayList<>();
        List<Employee> allEmploy = employeeService.findAll();

        allEmploy.forEach(emp -> employeeResponse.add(myModelMapper.map(emp, EmployeeResponse.class)));
        return employeeResponse;
    }

    @GetMapping(value = "/{id}")
    public Employee getEmployeeById(@PathVariable Long id) {
        return employeeService.findById(id).orElseThrow(() -> new ControllerException(HttpStatus.BAD_REQUEST, "employee not found"));
    }

    @PostMapping
    public void saveEmployee(@RequestBody Employee employee) {
        employeeService.saveEmployee(employee);
    }

    @PutMapping
    public void updateEmployee(@RequestBody Employee employee) {
        employeeService.updateEmployee(employee);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(employeeService.findById(id)
                .orElseThrow(() -> new ControllerException(HttpStatus.NOT_MODIFIED, "employee not found")));
    }


}
