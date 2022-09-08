/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaNegocio;

import CapaConexion.Conexion;
import CapaDatos.Usuario;
import CapaDatos.Venta;
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
public class VentaBD {

    private Conexion mysql = new Conexion();
    private Connection con = mysql.conectar();
    private String sql;

    public boolean registrarVenta(Venta v) {

        sql = "INSER INTO venta (idVenta,vCorrelativo,vDocumento,vFecha,vTotal,vTipo,vEstado,cDni,uDni) values(0,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, v.getvCorrelativo());
            pst.setString(2, v.getvDocumento());
            pst.setString(3, v.getvFecha());
            pst.setDouble(4, v.getvTotal());
            pst.setString(5, v.getvTipo());
            pst.setString(6, v.getvEstado());
            pst.setString(7, v.getcDni());
            pst.setString(8, v.getuDni());

            pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Registrar " + e.getMessage());
            return false;
        }
        return false;
    }

    public DefaultTableModel reportarVenta() {

        DefaultTableModel modelo;
        String[] titulos = {"CODIGO", "CORRELATIVO", "DOCUMENTO", "FECHA", "TOTAL", "TIPO", "ESTADO", "CLIENTE", "VENDEDOR"};
        String[] registros = new String[9];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idVenta,vCorrelativo,vDocumento,vFecha,vTotal, vTipo,vEstado,Concat(cApellidos,' ' ,cNombre) as cliente,Concat(uApellidos,' ' ,uNombre) as vendedor"
                + " FROM venta"
                + "INNER JOIN usuario ON venta.uDni=usuario.uDni"
                + "INNER JOIN cliente On venta.cDni=cliente.cDni";

        try {
            java.sql.Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idVenta");
                registros[1] = rs.getString("vCorrelativo");
                registros[2] = rs.getString("vDocumento");
                registros[3] = rs.getString("vFecha");
                registros[4] = rs.getString("vTotal");
                registros[5] = rs.getString("vTipo");
                registros[6] = rs.getString("vEstado");
                registros[7] = rs.getString("cliente");
                registros[8] = rs.getString("vendedor");

                modelo.addRow(registros);
            }
            return modelo;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al reportar ventas" + e.getMessage());
            return null;

        }

    }

    public boolean modificarVenta(Venta v) {
        sql = "UPDATE usuario SET vCorrelativo=?,vDocumento=?,vFecha=?,vTotal=?,vTipo=?,vEstado=?,cDni=?,uDni=? WHERE idVenta=?";

        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, v.getvCorrelativo());
            pst.setString(2, v.getvDocumento());
            pst.setString(3, v.getvFecha());
            pst.setDouble(4, v.getvTotal());
            pst.setString(5, v.getvTipo());
            pst.setString(6, v.getvEstado());
            pst.setString(7, v.getcDni());
            pst.setString(8, v.getuDni());
            pst.setInt(9, v.getIdVenta());

            pst.executeUpdate();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Modificar  " + e.getMessage());
            return false;
        }
        return false;
    }

    public boolean eliminarVentao(int idVenta) {

        sql = "DELETE FROM venta WHERE idVenta='" + idVenta + "'";

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
