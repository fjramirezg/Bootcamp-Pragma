package com.new_category.CategoryService.domain.model;

import jakarta.persistence.*;

@Entity
@Table(name = "articulo_categoria")
@IdClass(ArticuloCategoriaId.class)
public class ArticuloCategoria {

    @Id
    @Column(name = "id_articulo")
    private Integer idArticulo;

    @Id
    @Column(name = "id_categoria")
    private Integer idCategoria;

    // Getters y Setters
    public Integer getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(Integer idArticulo) {
        this.idArticulo = idArticulo;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }
}