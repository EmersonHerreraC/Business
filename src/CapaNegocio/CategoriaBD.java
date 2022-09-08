/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaNegocio;

import CapaConexion.Conexion;
import CapaDatos.Categoria;
import CapaDatos.Marca;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 51930
 */
public class CategoriaBD {

    private Conexion mysql = new Conexion();
    private Connection con = mysql.conectar();
    private String sql;

    public boolean registrarCategoria(Categoria ca) {

        sql = "INSERT INTO categoria (idCategoria,caNombre,caDescripcion) values(0,?,?)";

        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, ca.getCaNombre());
            pst.setString(2, ca.getCaDescripcion());
            pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Registrar " + e.getMessage());
            return false;
        }
        return false;
    }

    public DefaultTableModel reportarCategoria() {

        DefaultTableModel modelo;
        String[] titulos = {"CODIGO", "NOMBRE", "DESCRIPCION"};
        String[] registros = new String[3];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idCategoria,caNombre,caDescripcion FROM categoria";
        try {
            java.sql.Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idCategoria");
                registros[1] = rs.getString("caNombre");
                registros[2] = rs.getString("caDescripcion");

                modelo.addRow(registros);
            }
            return modelo;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al reportar categoria" + e.getMessage());
            return null;

        }

    }

    public boolean modificarCategoria(Categoria ca) {
        sql = "UPDATE categoria SET caNombre=?,caDescripcion=? where idCategoria=?";

        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, ca.getCaNombre());
            pst.setString(2, ca.getCaDescripcion());
            pst.setInt(3, ca.getIdCategoria());

            pst.executeUpdate();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Modificar  " + e.getMessage());
            return false;
        }
        return false;
    }

    public boolean eliminarCategoria(int codigo) {

        sql = "DELETE FROM categoria WHERE idCategoria='" + codigo + "'";

        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar " + e.getMessage());
            return false;
        }
        return true;
    }

    public DefaultTableModel buscarCategoria(String valor) {

        DefaultTableModel modelo;
        String[] titulos = {"CODIGO", "NOMBRES", "DESCRIPCION"};
        String[] registros = new String[3];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idCategoria,caNombre,caDescripcion FROM categoria WHERE  idCategoria LIKE '%" + valor + "%' OR caDescripcion LIKE '%" + valor + "%'";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idCategoria");
                registros[1] = rs.getString("caNombre");
                registros[2] = rs.getString("caDescripcion");

                modelo.addRow(registros);
            }
            return modelo;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al reportar la categoria" + e.getMessage());
            return null;

        }
    }

}
