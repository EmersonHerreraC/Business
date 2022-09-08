/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaDatos;

/**
 *
 * @author 51930
 */
public class Cliente {
    
    private String cDni;
    private String cNombre;
    private String cApellidos;
    private String cTelefono;

    public Cliente() {
    }

    public Cliente(String cDni, String cNombre, String cApellidos, String cTelefono) {
        this.cDni = cDni;
        this.cNombre = cNombre;
        this.cApellidos = cApellidos;
        this.cTelefono = cTelefono;
    }

    public String getcDni() {
        return cDni;
    }

    public void setcDni(String cDni) {
        this.cDni = cDni;
    }

    public String getcNombre() {
        return cNombre;
    }

    public void setcNombre(String cNombre) {
        this.cNombre = cNombre;
    }

    public String getcApellidos() {
        return cApellidos;
    }

    public void setcApellidos(String cApellidos) {
        this.cApellidos = cApellidos;
    }

    public String getcTelefono() {
        return cTelefono;
    }

    public void setcTelefono(String cTelefono) {
        this.cTelefono = cTelefono;
    }
    
    
    
}
