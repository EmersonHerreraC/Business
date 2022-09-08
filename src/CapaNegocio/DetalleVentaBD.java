/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaNegocio;

import CapaConexion.Conexion;
import CapaDatos.DetalleVenta;
import CapaDatos.Usuario;
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
public class DetalleVentaBD {

    private Conexion mysql = new Conexion();
    private Connection con = mysql.conectar();
    private String sql;

    public boolean registrarUsuario(DetalleVenta dtv) {

        sql = "INSERT INTO detalleVenta (idVenta,pSerie,deCantidad,dePrecio,deImporte,deFecha) values(?,?,?,?,?,?)";

        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, dtv.getIdVenta());
            pst.setString(2, dtv.getpSerie());
            pst.setInt(3, dtv.getDeCantidad());
            pst.setDouble(4, dtv.getDePrecio());
            pst.setDouble(5, dtv.getDeImporte());
            pst.setString(6, dtv.getDeFecha());

            pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Registrar " + e.getMessage());
            return false;
        }
        return false;
    }

    public DefaultTableModel reportarDetalleVenta() {

        DefaultTableModel modelo;
        String[] titulos = {"CODIGO", "PRODUCTO VENDIDO", "DESCRIPCION PRODUCTO", "CANTIDAD", "PRECIO", "IMPORTE", "FECHA"};
        String[] registros = new String[6];
        modelo = new DefaultTableModel(null, titulos);

        sql = "SELECT idVenta AS CodigoVenta,maNombre as productoVendido,pDescripcion as descripcionProducto,deCantidad,dePrecio,deImporte,deFecha FROM detalleventa"
                + "inner join producto on detalleventa.pSerie=producto.pSerie"
                + "inner join marca on producto.idMarca=marca.idMarca";
        try {
            java.sql.Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("CodigoVenta");
                registros[1] = rs.getString("productoVendido");
                registros[2] = rs.getString("descripcionProducto");
                registros[3] = rs.getString("deCantidad");
                registros[4] = rs.getString("dePrecio");
                registros[5] = rs.getString("deImporte");

                modelo.addRow(registros);
            }
            return modelo;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al reportar el producto" + e.getMessage());
            return null;

        }

    }

    public boolean modificarDetallaVenta(DetalleVenta dtv) {
        
        sql = "UPDATE detalleventa SET deCantidad='?',dePrecio=?,deImporte=?,deFecha=? WHERE idVenta=?";

        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, dtv.getDeCantidad());
            pst.setDouble(2, dtv.getDePrecio());
            pst.setDouble(3, dtv.getDeImporte());
            pst.setString(4, dtv.getDeFecha());
         

            pst.executeUpdate();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Modificar  " + e.getMessage());
            return false;
        }
        return false;
    }

    public boolean eliminarDetalleVenta(int pserie) {

        sql = "DELETE FROM detalleVenta WHERE idVenta='" + pserie + "'";

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
