/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaNegocio;

import CapaConexion.Conexion;
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
public class MarcaBD {

    private Conexion mysql = new Conexion();
    private Connection con = mysql.conectar();
    private String sql;

    public boolean registrarMarca(Marca ma) {

        sql = "INSERT INTO marca (idMarca,maNombre,maDescripcion) values(0,?,?)";

        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, ma.getMaNombre());
            pst.setString(2, ma.getMaNombre());
            pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Registrar " + e.getMessage());
            return false;
        }
        return false;
    }

    public DefaultTableModel reportarMarca() {

        DefaultTableModel modelo;
        String[] titulos = {"CODIGO", "NOMBRE", "DESCRIPCION"};
        String[] registros = new String[3];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idMarca,maNombre,maDescripcion FROM marca";
        try {
            java.sql.Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idMarca");
                registros[1] = rs.getString("maNombre");
                registros[2] = rs.getString("maDescripcion");

                modelo.addRow(registros);
            }
            return modelo;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al reportar marca" + e.getMessage());
            return null;

        }

    }

    public boolean modificarMarca(Marca ma) {
        sql = "UPDATE marca SET maNombre=?,maDescripcion=? where idMarca=?";

        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, ma.getMaNombre());
            pst.setString(2, ma.getMaDescripcion());
            pst.setInt(3, ma.getIdMarca());

            pst.executeUpdate();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Modificar  " + e.getMessage());
            return false;
        }
        return false;
    }

    public boolean eliminarMarca(int codigo) {

        sql = "DELETE FROM marca WHERE idMarca='" + codigo + "'";

        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar " + e.getMessage());
            return false;
        }
        return true;
    }

    public DefaultTableModel buscarMarca(String valor) {

        DefaultTableModel modelo;
        String[] titulos = {"CODIGO", "NOMBRES", "DESCRIPCION"};
        String[] registros = new String[3];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idMarca,maNombre,maDescripcion FROM marca WHERE  idMarca LIKE '%" + valor + "%' OR maDescripcion LIKE '%" + valor + "%'";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idMarca");
                registros[1] = rs.getString("maNombre");
                registros[2] = rs.getString("maDescripcion");

                modelo.addRow(registros);
            }
            return modelo;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al reportar el producto" + e.getMessage());
            return null;

        }
    }
}
