package com.new_category.CategoryService.application.service;

import com.new_category.CategoryService.domain.model.Articulo;
import com.new_category.CategoryService.infrastructure.repository.ArticuloRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ArticuloService {

    private final ArticuloRepository articuloRepository;

    @Autowired
    public ArticuloService(ArticuloRepository articuloRepository) {
        this.articuloRepository = articuloRepository;
    }

    public Articulo crearArticulo(Articulo articulo) {
        return articuloRepository.save(articulo);
    }

    public Optional<Articulo> obtenerArticulo(Integer id) {
        return articuloRepository.findById(id);
    }
}