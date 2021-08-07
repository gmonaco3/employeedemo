package com.example.employeedemo.model;

import com.example.employeedemo.model.compositeprimarykey.TurnoId;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@NoArgsConstructor
@Data
@IdClass(TurnoId.class)
public class Turno {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cod_employee")
    private Employee employee;

    @Id
    private LocalDate date;

    private LocalTime timeI;
    private LocalTime timeF;


}
