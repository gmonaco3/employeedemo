package com.example.employeedemo.controller;

import com.example.employeedemo.exception.ControllerException;
import com.example.employeedemo.model.Turno;
import com.example.employeedemo.model.compositeprimarykey.TurnoId;
import com.example.employeedemo.service.TurnoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "turno")
public class TurnoController {

    private final TurnoService turnoService;

    @GetMapping
    public List<Turno> getAll() {
        return turnoService.findAll();
    }

    @GetMapping(value = "/{id}")
    public Turno getTurnoById(@PathVariable TurnoId id) {
        return turnoService.findById(id).orElseThrow(() -> new ControllerException(HttpStatus.BAD_REQUEST, "employee not found"));
    }

    @PostMapping
    public void saveTurno(@RequestBody Turno turno) {
        turnoService.saveTurno(turno);
    }

    @PutMapping
    public void updateTurno(@RequestBody Turno turno) {
        turnoService.updateTurno(turno);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteTurno(@PathVariable TurnoId id) {

        turnoService.deleteTurno(turnoService.findById(id)
                .orElseThrow(() -> new ControllerException(HttpStatus.NOT_MODIFIED, "employee not found")));
    }
}
