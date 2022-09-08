/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaNegocio;

import CapaConexion.Conexion;
import CapaDatos.Marca;
import CapaDatos.Producto;
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
public class ProductoBD {

    private Conexion mysql = new Conexion();
    private Connection con = mysql.conectar();
    private String sql;

    public boolean registrarProducto(Producto pro) {

        sql = "INSER INTO producto (pSerie,pDescripcion,pPrecio,pStock,pFechaVencimiento,pImagen,idMarca,idCategoria) values(?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, pro.getpSerie());
            pst.setString(2, pro.getpDescripcion());
            pst.setDouble(3, pro.getpPrecio());
            pst.setInt(4, pro.getpStock());
            pst.setString(5, pro.getpFechaVencimiento());
            pst.setString(6, pro.getpImagen());
            pst.setInt(7, pro.getIdMarca());
            pst.setInt(8, pro.getIdCategoria());

            pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Registrar " + e.getMessage());
            return false;
        }
        return false;
    }

    public DefaultTableModel reportarProducto() {

        DefaultTableModel modelo;
        String[] titulos = {"SERIE", "DESCRIPCION", "PRECIO", "STOCK", "FECHA_VCTO", "MARCA", "CATEGORIA"};
        String[] registros = new String[7];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT pSerie,pDescripcion,pPrecio,pStock,pFechaVencimiento, maNombre as marca,caNombre as categoria FROM producto"
                + "INNER JOIN marca ON producto.idMarca=marca.idMarca"
                + "INNER JOIN categoria On producto.idCategoria=categoria.idCategoria";
        try {
            java.sql.Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("pSerie");
                registros[1] = rs.getString("pDescripcion");
                registros[2] = rs.getString("pPrecio");
                registros[3] = rs.getString("pStock");
                registros[4] = rs.getString("pFechaVencimiento");
                registros[5] = rs.getString("marca");
                registros[6] = rs.getString("categoria");

                modelo.addRow(registros);
            }
            return modelo;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al reportar el producto" + e.getMessage());
            return null;

        }

    }

    public boolean modificarProducto(Producto pro) {
        sql = "UPDATE producto SET pDescripcion=?,pPrecio=?,pStock=?,pFechaVencimiento=?,pImagen=?,idMarca=?,idCategoria=? WHERE pSerie=?";

        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, pro.getpSerie());
            pst.setString(2, pro.getpDescripcion());
            pst.setDouble(3, pro.getpPrecio());
            pst.setInt(4, pro.getpStock());
            pst.setString(5, pro.getpFechaVencimiento());
            pst.setString(6, pro.getpImagen());
            pst.setInt(7, pro.getIdMarca());
            pst.setInt(8, pro.getIdCategoria());

            pst.executeUpdate();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Modificar  " + e.getMessage());
            return false;
        }
        return false;
    }

    public boolean eliminarProducto(int serie) {

        sql = "DELETE FROM producto WHERE pSerie='" + serie + "'";

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
