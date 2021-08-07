package com.example.employeedemo.service;

import com.example.employeedemo.model.Dipartimento;

import java.util.List;
import java.util.Optional;

public interface DipartimentoService {
    public List<Dipartimento> findAll();
    public Optional<Dipartimento> findById(Long id);
    public void saveDipartimento(Dipartimento dipartimento);
    public void updateDipartimento(Dipartimento dipartimento);
    public void deleteDipartimento(Dipartimento dipartimento);
}
