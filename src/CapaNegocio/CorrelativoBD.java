/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaNegocio;

import CapaConexion.Conexion;
import CapaDatos.Correlativo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 51930
 */
public class CorrelativoBD {

    private Conexion mysql = new Conexion();
    private Connection con = mysql.conectar();
    private String sql;

    public boolean registrarCorrelativo(Correlativo co) {

        sql = "INSERT INTO correlativo (coCodigo,coNro,coSerie,coTipoDoc) values(?,?,?,?)";

        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, co.getCoNro());
            pst.setString(3, co.getCoSerie());
            pst.setString(4, co.getCoTipoDoc());

            pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Registrar " + e.getMessage());
            return false;
        }
        return false;
    }

    public DefaultTableModel reportarCorrelativo() {

        DefaultTableModel modelo;
        String[] titulos = {"CODIGO", "NRO", "SERIE", "DOCUMENTO"};
        String[] registros = new String[4];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT coCodigo,coNro,coSerie,coTipoDoc FROM correlativo";
        try {
            java.sql.Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("coCodigo");
                registros[1] = rs.getString("coNro");
                registros[2] = rs.getString("coSerie");
                registros[3] = rs.getString("coTipoDoc");

                modelo.addRow(registros);
            }
            return modelo;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al reportar el correlativo" + e.getMessage());
            return null;

        }

    }

    public boolean modificarCorrelativo(Correlativo co) {
        sql = "UPDATE correlativo SET coNro=?,coSerie=?,coTipoDoc=? WHERE coCodigo=?";

        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, co.getCoNro());
            pst.setString(2, co.getCoSerie());
            pst.setString(3, co.getCoTipoDoc());
            pst.setInt(4, co.getCoCodigo());

            pst.executeUpdate();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Modificar  " + e.getMessage());
            return false;
        }
        return false;
    }

    public boolean eliminarCorrelativo(int codigo) {

        sql = "DELETE FROM correlativo WHERE coCodigo='" + codigo + "'";

        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar " + e.getMessage());
            return false;
        }
        return true;
    }

    public boolean actualizarCorrelativo(Correlativo co) {

        sql = "UPDATE correlativo SET coSerie=? WHERE coTipoDoc=?";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, co.getCoSerie());
            pst.setString(2, co.getCoTipoDoc());

            pst.executeUpdate();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Modificar  " + e.getMessage());
            e.printStackTrace();
            return false;
        }
        return false;
    }

    public List<Correlativo> sacarNro(String documento) {
        List<Correlativo> lista = new ArrayList<>();
        sql = "SELECT coCodigo ,coNro,coSerie,coTipoDoc from correlativo where coTipoDoc='" + documento + "'";

        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                Correlativo objetoCorrelativo = new Correlativo();
                objetoCorrelativo.setCoNro(rs.getString(2));
                objetoCorrelativo.setCoSerie(rs.getString(3));
                objetoCorrelativo.setCoTipoDoc(rs.getString(4));

                lista.add(objetoCorrelativo);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al sacar el correlativo  " + e.getMessage());
            e.printStackTrace();

        }
        return lista;
    }

}
