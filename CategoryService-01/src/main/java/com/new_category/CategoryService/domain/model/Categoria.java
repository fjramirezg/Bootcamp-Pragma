package com.new_category.CategoryService.domain.model;


import jakarta.persistence.*;

@Entity
@Table(name = "categorias", uniqueConstraints = @UniqueConstraint(columnNames = "nombre"))
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Integer idCategoria;

    @Column(nullable = false, length = 50)
    private String nombre;

    // Getters y Setters
    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public Long getId() {
        return 0;
    }

    public String getDescripcion() {
    }

    public void setId(Long id) {
    }

    public void setDescripcion(String descripcion) {
    }
}