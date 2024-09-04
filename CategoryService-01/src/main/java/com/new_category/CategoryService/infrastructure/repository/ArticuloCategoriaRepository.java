package com.new_category.CategoryService.infrastructure.repository;

import com.new_category.CategoryService.domain.model.ArticuloCategoria;

import com.new_category.CategoryService.domain.model.ArticuloCategoriaId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticuloCategoriaRepository extends JpaRepository<ArticuloCategoria, ArticuloCategoriaId> {
}