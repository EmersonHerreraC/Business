/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaNegocio;

import CapaConexion.Conexion;
import CapaDatos.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 51930
 */
public class ClienteBD {

    private Conexion mysql = new Conexion();
    private Connection con = mysql.conectar();
    private String sql;

    public boolean registrarCliente(Cliente cli) {

        sql = "INSER INTO cliente (cDni,cNombre,cApellidos,cTelefono) values(?,?,?,?)";

        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, cli.getcDni());
            pst.setString(2, cli.getcNombre());
            pst.setString(3, cli.getcApellidos());
            pst.setString(4, cli.getcTelefono());

            pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Registrar " + e.getMessage());
            return false;
        }
        return false;
    }

    public DefaultTableModel reportarCliente() {

        DefaultTableModel modelo;
        String[] titulos = {"DNI", "NOMBRE", "APELLIDOS","TELEFONO"};
        String[] registros = new String[4];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT cDni,cNombre,cApellidos,cTelefono FROM cliente";

        try {
            java.sql.Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("cDni");
                registros[1] = rs.getString("cNombre");
                registros[2] = rs.getString("cApellidos");
                registros[3] = rs.getString("cTelefono");

                modelo.addRow(registros);
            }
            return modelo;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al reportar el cliente" + e.getMessage());
            return null;

        }

    }

    public boolean modificarCliente(Cliente cli) {
        sql = "UPDATE cliente SET cNombre=?,cApellidos=?,cTelofono=? WHERE cDni=?";

        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, cli.getcDni());
            pst.setString(2, cli.getcNombre());
            pst.setString(3, cli.getcApellidos());
            pst.setString(4, cli.getcTelefono());

            pst.executeUpdate();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Modificar  " + e.getMessage());
            return false;
        }
        return false;
    }

    public boolean eliminarCliente(int dni) {

        sql = "DELETE FROM cliente WHERE cDni='" + dni + "'";

        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar " + e.getMessage());
            return false;
        }
        return true;
    }
}
