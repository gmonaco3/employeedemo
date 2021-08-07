package com.example.employeedemo.service;

import com.example.employeedemo.model.Turno;
import com.example.employeedemo.model.compositeprimarykey.TurnoId;

import java.util.List;
import java.util.Optional;

public interface TurnoService {
    public List<Turno> findAll();
    public Optional<Turno> findById(TurnoId id);
    public void saveTurno(Turno turno);
    public void updateTurno(Turno turno);
    public void deleteTurno(Turno turno);
}
