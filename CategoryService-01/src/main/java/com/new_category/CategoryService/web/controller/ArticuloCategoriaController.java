package com.new_category.CategoryService.web.controller;

import com.new_category.CategoryService.domain.model.ArticuloCategoria;
import com.new_category.CategoryService.application.service.ArticuloCategoriaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/articulo-categoria")
public class ArticuloCategoriaController {

    private final ArticuloCategoriaService articuloCategoriaService;

    @Autowired
    public ArticuloCategoriaController(ArticuloCategoriaService articuloCategoriaService) {
        this.articuloCategoriaService = articuloCategoriaService;
    }

    @PostMapping
    public ResponseEntity<ArticuloCategoria> crearArticuloCategoria(@RequestBody ArticuloCategoria articuloCategoria) {
        ArticuloCategoria nuevoArticuloCategoria = articuloCategoriaService.crearArticuloCategoria(articuloCategoria);
        return new ResponseEntity<>(nuevoArticuloCategoria, HttpStatus.CREATED);
    }
}