/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaNegocio;

import CapaConexion.Conexion;
import CapaDatos.Usuario;
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
public class UsuarioBD {

    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sql;

    public boolean registrarUsuario(Usuario u) {

        sql = "INSERT INTO usuario (uDni,uNombre,uApellidos,uDireccion,uCelular,uTipo,uClave) values(?,?,?,?,?,?,?)";

        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, u.getuDni());
            pst.setString(2, u.getuNombre());
            pst.setString(3, u.getuApellidos());
            pst.setString(4, u.getuDireccion());
            pst.setString(5, u.getuCelular());
            pst.setString(6, u.getuTipo());
            pst.setString(7, u.getuClave());

            pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Registrar " + e.getMessage());
            return false;
        }
        return false;
    }

    public DefaultTableModel reportarUsuario() {

        DefaultTableModel modelo;
        String[] titulos = {"DNI", "NOMBRES", "APELLIDOS", "DIRECCION", "CELULAR", "TIPO", "CLAVE"};
        String[] registros = new String[7];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT uDni,uNombre,uApellidos,uDireccion,uCelular,uTipo,uClave FROM usuario";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("uDni");
                registros[1] = rs.getString("uNombre");
                registros[2] = rs.getString("uApellidos");
                registros[3] = rs.getString("uDireccion");
                registros[4] = rs.getString("uCelular");
                registros[5] = rs.getString("uTipo");
                registros[6] = rs.getString("uClave");

                modelo.addRow(registros);
            }
            return modelo;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al reportar el producto" + e.getMessage());
            return null;

        }

    }

    public boolean modificarUsuario(Usuario u) {
        sql = "UPDATE usuario SET uNombre=?,uApellidos=?,uDireccion=?,uCelular=?,uTipo=?,uClave=? WHERE uDni=?";

        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, u.getuNombre());
            pst.setString(2, u.getuApellidos());
            pst.setString(3, u.getuDireccion());
            pst.setString(4, u.getuCelular());
            pst.setString(5, u.getuTipo());
            pst.setString(6, u.getuClave());
            pst.setString(7, u.getuDni());

            pst.executeUpdate();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Modificar  " + e.getMessage());
            return false;
        }
        return false;
    }

    public boolean eliminar(int dni) {

        sql = "DELETE FROM usuario WHERE uDni='" + dni + "'";

        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar " + e.getMessage());
            return false;
        }
        return true;
    }

    public List<Usuario> login(String dni, String clave) {

        List<Usuario> lista_Usuario = new ArrayList<>();
        sql = "SELECT uDni,uNombre,uApellidos,uDireccion,uCelular,uTipo,uClave FROM usuario where uDni='" + dni + "' AND uClave='" + clave + "'";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                Usuario objUsuario = new Usuario();
                objUsuario.setuDni(rs.getString(1));
                objUsuario.setuNombre(rs.getString(2));
                objUsuario.setuApellidos(rs.getString(3));
                objUsuario.setuDireccion(rs.getString(4));
                objUsuario.setuCelular(rs.getString(5));
                objUsuario.setuTipo(rs.getString(6));
                objUsuario.setuClave(rs.getString(7));
                lista_Usuario.add(objUsuario);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "usuario no encontrado" + e.getMessage());

        }
        return lista_Usuario;

    }

    public DefaultTableModel buscarUsuario(String apellidos) {

        DefaultTableModel modelo;
        String[] titulos = {"DNI", "NOMBRES", "APELLIDOS", "DIRECCION", "CELULAR", "TIPO", "CLAVE"};
        String[] registros = new String[7];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT uDni,uNombre,uApellidos,uDireccion,uCelular,uTipo,uClave FROM usuario WHERE  uApellidos LIKE '%" + apellidos + "%' OR uNombre LIKE '%" + apellidos + "%'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("uDni");
                registros[1] = rs.getString("uNombre");
                registros[2] = rs.getString("uApellidos");
                registros[3] = rs.getString("uDireccion");
                registros[4] = rs.getString("uCelular");
                registros[5] = rs.getString("uTipo");
                registros[6] = rs.getString("uClave");

                modelo.addRow(registros);
            }
            return modelo;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al reportar el producto" + e.getMessage());
            return null;

        }
    }

}
