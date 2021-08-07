package com.example.employeedemo.controller;

import com.example.employeedemo.exception.ControllerException;
import com.example.employeedemo.model.Dipartimento;
import com.example.employeedemo.service.DipartimentoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "dipartimento")
public class DipartimentoController {

    private final DipartimentoService dipartimentoService;

    @GetMapping
    public List<Dipartimento> getAll() {
        return dipartimentoService.findAll();
    }

    @GetMapping(value = "/{id}")
    public Dipartimento getEmployeeById(@PathVariable Long id) {
        return dipartimentoService.findById(id).orElseThrow(() -> new ControllerException(HttpStatus.BAD_REQUEST, "dipartimento not found"));
    }

    @PostMapping
    public void saveEmployee(@RequestBody Dipartimento dipartimento) {
        dipartimentoService.saveDipartimento(dipartimento);
    }

    @PutMapping
    public void updateEmployee(@RequestBody Dipartimento dipartimento) {
        dipartimentoService.updateDipartimento(dipartimento);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        dipartimentoService.deleteDipartimento(dipartimentoService.findById(id)
                .orElseThrow(() -> new ControllerException(HttpStatus.NOT_MODIFIED, "dipartimento not found")));
    }
}
