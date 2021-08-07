package com.example.employeedemo.controller;

import com.example.employeedemo.service.DipartimentoService;
import com.example.employeedemo.service.EmployeeService;
import com.example.employeedemo.service.TurnoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "employee-demo")
@AllArgsConstructor
public class ApplicationController {
    private final EmployeeService employeeService;
    private final TurnoService turnoService;
    private final DipartimentoService dipartimentoService;



}
