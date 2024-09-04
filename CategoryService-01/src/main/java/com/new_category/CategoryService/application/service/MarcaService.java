package com.new_category.CategoryService.application.service;

import com.new_category.CategoryService.domain.model.Marca;
import com.new_category.CategoryService.infrastructure.repository.MarcaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MarcaService {

    private final MarcaRepository marcaRepository;

    @Autowired
    public MarcaService(MarcaRepository marcaRepository) {
        this.marcaRepository = marcaRepository;
    }

    public Marca crearMarca(Marca marca) {
        return marcaRepository.save(marca);
    }

    public Optional<Marca> obtenerMarca(Integer id) {
        return marcaRepository.findById(id);
    }
}