/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import configuracion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ale_a
 */
public class UsuariosDao {
    Conexion  objConexion = new Conexion();
    Connection cn ;
    PreparedStatement ps;
    ResultSet rs;
    
    Usuarios user = new Usuarios();
    
    public ArrayList  getListadoUsuarios(){
        ArrayList<Usuarios>  objListUser = new ArrayList<>();
        String sql = "SELECT * FROM usuarios";
        
        try{
            cn=objConexion.getConexion();
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                Usuarios usuario = new Usuarios();
                usuario.setCodigo(rs.getInt("codigo"));
                usuario.setNombres(rs.getString("nombres"));
                usuario.setApellidos(rs.getString("apellidos"));
                usuario.setCorreos(rs.getString("correos"));
                usuario.setClave(rs.getString("clave"));
                usuario.setTipo(rs.getInt("tipo"));
                usuario.setEstado(rs.getInt("estado"));
                
                objListUser.add(usuario);
            }
            
        }catch(Exception e){
            
        }
        return objListUser;
   
    }
    
    
}
