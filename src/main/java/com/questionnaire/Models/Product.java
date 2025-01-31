package com.questionnaire.Models;

public class Product {
    private String codigo;
    private String descripcion;
    private int cantidad;

    public Product(String codigo, String descripcion, int cantidad) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }
}
