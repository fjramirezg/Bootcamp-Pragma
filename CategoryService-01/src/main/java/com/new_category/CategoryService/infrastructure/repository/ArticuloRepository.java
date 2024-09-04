package com.new_category.CategoryService.infrastructure.repository;

import com.new_category.CategoryService.domain.model.Articulo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticuloRepository extends JpaRepository<Articulo, Integer> {
}