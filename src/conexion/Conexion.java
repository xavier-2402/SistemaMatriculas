/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Asrock Gamer
 */
public class Conexion {
     Connection conexion ;
     
    public Conexion() {
    }
    
    

//    public void connectDatabase() {
//        try {
//            // We register the PostgreSQL driver
//            // Registramos el driver de PostgresSQL
//            try { 
//                Class.forName("org.postgresql.Driver");
//            } catch (ClassNotFoundException ex) {
//                System.out.println("Error al registrar el driver de PostgreSQL: " + ex);
//            }
//            Connection connection = null;
//            // Database connect
//            // Conectamos con la base de datos
//            connection = DriverManager.getConnection(
//                    "jdbc:postgresql://192.168.0.26:5432/customerdb",
//                    "xulescode", "xulescode");
// 
//            boolean valid = connection.isValid(50000);
//            System.out.println(valid ? "TEST OK" : "TEST FAIL");
//        } catch (java.sql.SQLException sqle) {
//            System.out.println("Error: " + sqle);
//        }
//    } 
    
    public Connection conexion(String usuario,String password)
    {
         
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
}
