/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.sql.*;
import java.util.logging.*;
import java.util.regex.*;


/**
 *
 * @author Juanc
 */
public class SqlUsuarios extends Conexion{
    
    public boolean registrar(usuarios usr){
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "INSERT INTO users (usuario, password, nombre, correo, id_tipo) VALUES (?,?,?,?,?)";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getUsuario());
            ps.setString(2, usr.getPassword());
            ps.setString(3, usr.getNombre());
            ps.setString(4, usr.getCorreo());
            ps.setInt(5, usr.getId_tipo());
            ps.execute();
            return true;
        } catch (SQLException ex){
            Logger.getLogger(SqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean registrarC(cliente clt){
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "INSERT INTO client (Nombres, Apellidos, Direccion, Telefono, nit) VALUES (?,?,?,?,?)";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, clt.getNombres());
            ps.setString(2, clt.getApellidos());
            ps.setString(3, clt.getDireccion());
            ps.setString(4, clt.getTelefono());
            ps.setString(5, clt.getNit());
            ps.execute();
            return true;
        } catch (SQLException ex){
            Logger.getLogger(SqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean registrarM(merca mc){
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "INSERT INTO merca (COD, Nombre, Cantidad) VALUES (?,?,?)";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, mc.getCOD());
            ps.setString(2, mc.getNombre());
            ps.setString(3, mc.getCantidad()); 
            ps.execute();
            return true;
        } catch (SQLException ex){
            Logger.getLogger(SqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
     public boolean registrarP(prove pv){
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "INSERT INTO prove (Nombre_Vendedor, Empresa, Direccion, Telefono, Fax, Correo) VALUES (?,?,?,?,?,?)";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, pv.getNombre_Vendedor());
            ps.setString(2, pv.getEmpresa());
            ps.setString(3, pv.getDireccion()); 
            ps.setString(4, pv.getTelefono()); 
            ps.setString(5, pv.getFax()); 
            ps.setString(6, pv.getCorreo()); 
            ps.execute();
            return true;
        } catch (SQLException ex){
            Logger.getLogger(SqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    
    public boolean login(usuarios usr){
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        
        String sql = "SELECT id, usuario, password, nombre, id_tipo FROM users WHERE usuario = ?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1,usr.getUsuario());
            rs = ps.executeQuery();
            
            if(rs.next()){
                if(usr.getPassword().equals(rs.getString(3))){
                    usr.setId(rs.getInt(1));
                    usr.setNombre(rs.getString(4));
                    usr.setId_tipo(rs.getInt(5));
                    return true;
                } else {
                    return false;
                }
                
            }
            return false;
        } catch (SQLException ex){
            Logger.getLogger(SqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
 
}
