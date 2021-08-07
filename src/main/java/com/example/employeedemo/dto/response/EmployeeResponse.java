package com.example.employeedemo.dto.response;

import com.example.employeedemo.model.compositeprimarykey.TurnoId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class EmployeeResponse {
    private Long codEmployee;
    private String name;
    private String lastname;
    private Long codDipartimento;
    private List<TurnoId> turnoIds;


}
