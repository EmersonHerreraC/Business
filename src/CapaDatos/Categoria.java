/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaDatos;

/**
 *
 * @author 51930
 */
public class Categoria {
    
    private int idCategoria;
    private String caNombre;
    private String caDescripcion;

    public Categoria() {
    }

    public Categoria(int idCategoria, String caNombre, String caDescripcion) {
        this.idCategoria = idCategoria;
        this.caNombre = caNombre;
        this.caDescripcion = caDescripcion;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getCaNombre() {
        return caNombre;
    }

    public void setCaNombre(String caNombre) {
        this.caNombre = caNombre;
    }

    public String getCaDescripcion() {
        return caDescripcion;
    }

    public void setCaDescripcion(String caDescripcion) {
        this.caDescripcion = caDescripcion;
    }
    
    
    
    
    
}
