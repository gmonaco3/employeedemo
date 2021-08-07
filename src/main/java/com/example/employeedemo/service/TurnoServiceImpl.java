package com.example.employeedemo.service;

import com.example.employeedemo.model.Turno;
import com.example.employeedemo.model.compositeprimarykey.TurnoId;
import com.example.employeedemo.repository.TurnoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TurnoServiceImpl implements TurnoService {

    private final TurnoRepository turnoRepository;


    @Override
    public List<Turno> findAll() {
        return turnoRepository.findAll();
    }

    @Override
    public Optional<Turno> findById(TurnoId id) {
        return turnoRepository.findById(id);
    }

    @Override
    public void saveTurno(Turno turno) {
        turnoRepository.save(turno);
    }

    @Override
    public void updateTurno(Turno turno) {
        turnoRepository.save(turno);
    }

    @Override
    public void deleteTurno(Turno turno) {
        turnoRepository.delete(turno);
    }
}
