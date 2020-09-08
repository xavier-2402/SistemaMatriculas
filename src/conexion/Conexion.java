/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Asrock Gamer
 */
public class Conexion {
     Connection conexion ;
      private Statement st;//COMANDOS SQL
    private ResultSet rst;//RESULTADO DE LAS CONSULTAS

    public Conexion() {
    }
    
    
    public Connection conexion()
    {
         String usuario ="postgres";
         String password ="12345678";
           String url="jdbc:postgresql://database-1.cqky7cb50g2m.us-east-1.rds.amazonaws.com:5432/SistemaMatriculas";
           
           try{
               Class.forName("org.postgresql.Driver");
               conexion = DriverManager.getConnection(url,usuario,password);
               if(conexion !=null)
               {
                   System.out.println("CONECTADO A LA BASE DE DATOS");
               }      
           }
           catch(Exception e)
           {
              JOptionPane.showMessageDialog(null,"PROBLEMAS DE CONEXION "+e);
           }
           
           return conexion;
         
    }  
    
     public ResultSet query(String sql) {//CONSULTAS 
        try {
            st = conexion().createStatement();
            rst = st.executeQuery(sql);
            conexion.close();
            return rst;
        } catch (SQLException ex) {
            System.out.println(ex);
            return null;
        }
    }//FIN DEL METODO RESULTSET DEL QUERY PARA CONSULTAS

    public boolean noQuery(String sql) {
        try {
            st = conexion().createStatement();
            st.execute(sql);
            st.close();
            conexion().close();
            return true;
        } catch (SQLException ex) {
            System.out.println("Error al ingresar:" + ex.getMessage());
            return false;
        }
    }//FIN DEL METODO RESULTSET DEL QUERY PARA CONSULTAS
}
