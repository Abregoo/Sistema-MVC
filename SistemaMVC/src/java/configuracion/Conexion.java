/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configuracion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ale_a
 */
public class Conexion {

    Connection cn;

    public Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema","root","");
        } catch (Exception e) {
            System.out.println("Error en la conexion BD: "+e.getMessage());
        }
       
        
    }
    
    public Connection getConexion(){
        return cn;
        
    }
    
}
