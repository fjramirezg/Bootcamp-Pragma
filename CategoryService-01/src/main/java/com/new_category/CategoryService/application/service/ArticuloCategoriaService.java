package com.new_category.CategoryService.application.service;

import com.new_category.CategoryService.domain.model.ArticuloCategoria;
import com.new_category.CategoryService.infrastructure.repository.ArticuloCategoriaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticuloCategoriaService {

    private final ArticuloCategoriaRepository articuloCategoriaRepository;

    @Autowired
    public ArticuloCategoriaService(ArticuloCategoriaRepository articuloCategoriaRepository) {
        this.articuloCategoriaRepository = articuloCategoriaRepository;
    }

    public ArticuloCategoria crearArticuloCategoria(ArticuloCategoria articuloCategoria) {
        return articuloCategoriaRepository.save(articuloCategoria);
    }
}