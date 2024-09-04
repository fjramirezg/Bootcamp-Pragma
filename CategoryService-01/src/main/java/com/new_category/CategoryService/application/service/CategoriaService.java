package com.new_category.CategoryService.application.service;

import com.new_category.CategoryService.domain.model.Categoria;
import com.new_category.CategoryService.infrastructure.repository.CategoriaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    private final CategoriaRepository categoriaRepository;

    @Autowired
    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    public Categoria crearCategoria(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    public Optional<Categoria> obtenerCategoria(Integer id) {
        return categoriaRepository.findById(id);
    }
}