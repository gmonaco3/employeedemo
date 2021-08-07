package com.example.employeedemo.repository;

import com.example.employeedemo.model.Dipartimento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DipartimentoRepository extends JpaRepository<Dipartimento,Long> {
}
