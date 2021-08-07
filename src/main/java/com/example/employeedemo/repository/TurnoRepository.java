package com.example.employeedemo.repository;

import com.example.employeedemo.model.Turno;
import com.example.employeedemo.model.compositeprimarykey.TurnoId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TurnoRepository extends JpaRepository<Turno, TurnoId> {
}
