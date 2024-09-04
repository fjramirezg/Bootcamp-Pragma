package com.new_category.CategoryService.web.controller;

import com.new_category.CategoryService.domain.model.Articulo;
import com.new_category.CategoryService.application.service.ArticuloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/articulos")
public class ArticuloController {

    private final ArticuloService articuloService;

    @Autowired
    public ArticuloController(ArticuloService articuloService) {
        this.articuloService = articuloService;
    }

    @PostMapping
    public ResponseEntity<Articulo> crearArticulo(@RequestBody Articulo articulo) {
        Articulo nuevoArticulo = articuloService.crearArticulo(articulo);
        return new ResponseEntity<>(nuevoArticulo, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Articulo> obtenerArticulo(@PathVariable Integer id) {
        return articuloService.obtenerArticulo(id)
                .map(articulo -> new ResponseEntity<>(articulo, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}