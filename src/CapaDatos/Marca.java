/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaDatos;

/**
 *
 * @author 51930
 */
public class Marca {

    private int idMarca;
    private String maNombre;
    private String maDescripcion;

    public Marca() {
    }

    public Marca(int idMarca, String maNombre, String maDescripcion) {
        this.idMarca = idMarca;
        this.maNombre = maNombre;
        this.maDescripcion = maDescripcion;
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public String getMaNombre() {
        return maNombre;
    }

    public void setMaNombre(String maNombre) {
        this.maNombre = maNombre;
    }

    public String getMaDescripcion() {
        return maDescripcion;
    }

    public void setMaDescripcion(String maDescripcion) {
        this.maDescripcion = maDescripcion;
    }
    
    
}
