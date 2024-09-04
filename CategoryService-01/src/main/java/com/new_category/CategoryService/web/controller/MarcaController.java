package com.new_category.CategoryService.web.controller;

import com.new_category.CategoryService.domain.model.Marca;
import com.new_category.CategoryService.application.service.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/marcas")
public class MarcaController {

    private final MarcaService marcaService;

    @Autowired
    public MarcaController(MarcaService marcaService) {
        this.marcaService = marcaService;
    }

    @PostMapping
    public ResponseEntity<Marca> crearMarca(@RequestBody Marca marca) {
        Marca nuevaMarca = marcaService.crearMarca(marca);
        return new ResponseEntity<>(nuevaMarca, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Marca> obtenerMarca(@PathVariable Integer id) {
        return marcaService.obtenerMarca(id)
                .map(marca -> new ResponseEntity<>(marca, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}