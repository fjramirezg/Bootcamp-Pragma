package com.new_category.CategoryService.infrastructure.repository;
import com.new_category.CategoryService.domain.model.Marca;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MarcaRepository extends JpaRepository<Marca, Integer> {
}