package com.new_category.CategoryService.domain.model;

import java.io.Serializable;
import java.util.Objects;

public class ArticuloCategoriaId implements Serializable {
    private Integer idArticulo;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ArticuloCategoriaId)) return false;
        ArticuloCategoriaId that = (ArticuloCategoriaId) o;
        return Objects.equals(idArticulo, that.idArticulo) &&
                Objects.equals(idCategoria, that.idCategoria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idArticulo, idCategoria);
    }
}