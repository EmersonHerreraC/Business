/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaDatos;

/**
 *
 * @author 51930
 */
public class Venta {
    
    private int idVenta;
    private String vCorrelativo;
    private String vDocumento;
    private String vFecha;
    private double vTotal;
    private String vTipo;
    private String vEstado;
    private String cDni;
    private String uDni;

    public Venta() {
    }

    public Venta(int idVenta, String vCorrelativo, String vDocumento, String vFecha, double vTotal, String vTipo, String vEstado, String cDni, String uDni) {
        this.idVenta = idVenta;
        this.vCorrelativo = vCorrelativo;
        this.vDocumento = vDocumento;
        this.vFecha = vFecha;
        this.vTotal = vTotal;
        this.vTipo = vTipo;
        this.vEstado = vEstado;
        this.cDni = cDni;
        this.uDni = uDni;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public String getvCorrelativo() {
        return vCorrelativo;
    }

    public void setvCorrelativo(String vCorrelativo) {
        this.vCorrelativo = vCorrelativo;
    }

    public String getvDocumento() {
        return vDocumento;
    }

    public void setvDocumento(String vDocumento) {
        this.vDocumento = vDocumento;
    }

    public String getvFecha() {
        return vFecha;
    }

    public void setvFecha(String vFecha) {
        this.vFecha = vFecha;
    }

    public double getvTotal() {
        return vTotal;
    }

    public void setvTotal(double vTotal) {
        this.vTotal = vTotal;
    }

    public String getvTipo() {
        return vTipo;
    }

    public void setvTipo(String vTipo) {
        this.vTipo = vTipo;
    }

    public String getvEstado() {
        return vEstado;
    }

    public void setvEstado(String vEstado) {
        this.vEstado = vEstado;
    }

    public String getcDni() {
        return cDni;
    }

    public void setcDni(String cDni) {
        this.cDni = cDni;
    }

    public String getuDni() {
        return uDni;
    }

    public void setuDni(String uDni) {
        this.uDni = uDni;
    }
    
    
    
    
}
