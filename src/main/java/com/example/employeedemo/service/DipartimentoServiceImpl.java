package com.example.employeedemo.service;

import com.example.employeedemo.model.Dipartimento;
import com.example.employeedemo.repository.DipartimentoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class DipartimentoServiceImpl implements DipartimentoService {

    private final DipartimentoRepository dipartimentoRepository;

    @Override
    public List<Dipartimento> findAll() {
        return dipartimentoRepository.findAll();
    }

    @Override
    public Optional<Dipartimento> findById(Long id) {
        return dipartimentoRepository.findById(id);
    }

    @Override
    public void saveDipartimento(Dipartimento dipartimento) {
        dipartimentoRepository.save(dipartimento);
    }

    @Override
    public void updateDipartimento(Dipartimento dipartimento) {
        dipartimentoRepository.save(dipartimento);
    }

    @Override
    public void deleteDipartimento(Dipartimento dipartimento) {
        dipartimentoRepository.delete(dipartimento);
    }
}
