/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaDatos;

/**
 *
 * @author 51930
 */
public class Producto {
    
    private String pSerie;
    private String pDescripcion;
    private double pPrecio;
    private int pStock;
    private String pFechaVencimiento;
    private String pImagen;
    private int idMarca;
    private int idCategoria;

    public Producto() {
    }

    public Producto(String pSerie, String pDescripcion, double pPrecio, int pStock, String pFechaVencimiento, String pImagen, int idMarca, int idCategoria) {
        this.pSerie = pSerie;
        this.pDescripcion = pDescripcion;
        this.pPrecio = pPrecio;
        this.pStock = pStock;
        this.pFechaVencimiento = pFechaVencimiento;
        this.pImagen = pImagen;
        this.idMarca = idMarca;
        this.idCategoria = idCategoria;
    }

    public String getpSerie() {
        return pSerie;
    }

    public void setpSerie(String pSerie) {
        this.pSerie = pSerie;
    }

    public String getpDescripcion() {
        return pDescripcion;
    }

    public void setpDescripcion(String pDescripcion) {
        this.pDescripcion = pDescripcion;
    }

    public double getpPrecio() {
        return pPrecio;
    }

    public void setpPrecio(double pPrecio) {
        this.pPrecio = pPrecio;
    }

    public int getpStock() {
        return pStock;
    }

    public void setpStock(int pStock) {
        this.pStock = pStock;
    }

    public String getpFechaVencimiento() {
        return pFechaVencimiento;
    }

    public void setpFechaVencimiento(String pFechaVencimiento) {
        this.pFechaVencimiento = pFechaVencimiento;
    }

    public String getpImagen() {
        return pImagen;
    }

    public void setpImagen(String pImagen) {
        this.pImagen = pImagen;
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }
    
    
    
    
}
