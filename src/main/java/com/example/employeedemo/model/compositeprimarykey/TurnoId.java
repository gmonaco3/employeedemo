package com.example.employeedemo.model.compositeprimarykey;

import com.example.employeedemo.model.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TurnoId implements Serializable {

    private Employee employee;
    private LocalDate date;
}
