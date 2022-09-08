/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaDatos;

/**
 *
 * @author 51930
 */
public class DetalleVenta {
    
    
    private int idVenta;
    private String pSerie;
    private int deCantidad ;
    private double dePrecio;
    private double deImporte;
    private String deFecha;

    public DetalleVenta() {
    }

    public DetalleVenta(int idVenta, String pSerie, int deCantidad, double dePrecio, double deImporte, String deFecha) {
        this.idVenta = idVenta;
        this.pSerie = pSerie;
        this.deCantidad = deCantidad;
        this.dePrecio = dePrecio;
        this.deImporte = deImporte;
        this.deFecha = deFecha;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public String getpSerie() {
        return pSerie;
    }

    public void setpSerie(String pSerie) {
        this.pSerie = pSerie;
    }

    public int getDeCantidad() {
        return deCantidad;
    }

    public void setDeCantidad(int deCantidad) {
        this.deCantidad = deCantidad;
    }

    public double getDePrecio() {
        return dePrecio;
    }

    public void setDePrecio(double dePrecio) {
        this.dePrecio = dePrecio;
    }

    public double getDeImporte() {
        return deImporte;
    }

    public void setDeImporte(double deImporte) {
        this.deImporte = deImporte;
    }

    public String getDeFecha() {
        return deFecha;
    }

    public void setDeFecha(String deFecha) {
        this.deFecha = deFecha;
    }
    
    
    
}
