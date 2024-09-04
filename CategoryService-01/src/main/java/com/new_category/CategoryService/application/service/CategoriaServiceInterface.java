package com.new_category.CategoryService.application.service;
import com.new_category.CategoryService.application.dto.CategoriaDTO;


import java.util.Optional;

public interface CategoriaServiceInterface {
    CategoriaDTO crearCategoria(CategoriaDTO categoriaDTO);
    Optional<CategoriaDTO> obtenerCategoria(Long id);
}