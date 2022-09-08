/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaDatos;

/**
 *
 * @author 51930
 */
public class Correlativo {
    
    private int coCodigo;
    private String coNro;
    private String coSerie;
    private String coTipoDoc;

    public Correlativo() {
    }

    public Correlativo(int coCodigo, String coNro, String coSerie, String coTipoDoc) {
        this.coCodigo = coCodigo;
        this.coNro = coNro;
        this.coSerie = coSerie;
        this.coTipoDoc = coTipoDoc;
    }

    public int getCoCodigo() {
        return coCodigo;
    }

    public void setCoCodigo(int coCodigo) {
        this.coCodigo = coCodigo;
    }

    public String getCoNro() {
        return coNro;
    }

    public void setCoNro(String coNro) {
        this.coNro = coNro;
    }

    public String getCoSerie() {
        return coSerie;
    }

    public void setCoSerie(String coSerie) {
        this.coSerie = coSerie;
    }

    public String getCoTipoDoc() {
        return coTipoDoc;
    }

    public void setCoTipoDoc(String coTipoDoc) {
        this.coTipoDoc = coTipoDoc;
    }

    
    
}
