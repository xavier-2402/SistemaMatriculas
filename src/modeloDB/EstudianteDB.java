/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDB;

import conexion.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import practicacalidad.Modelo.Estudiante;

/**
 *
 * @author usuario
 */
public class EstudianteDB extends Estudiante {

    private Conexion con = new Conexion();

    public EstudianteDB(String codigo_Senecyt) {
        super(codigo_Senecyt);
    }

    public EstudianteDB(String codigo_Senecyt, String persona_cedula, String persona_nombre, String persona_apellido, String persona_email, String telefono) {
        super(codigo_Senecyt, persona_cedula, persona_nombre, persona_apellido, persona_email, telefono);
    }

    public EstudianteDB() {
    }

    public boolean GuardarPersona() {

        String sql = "INSERT INTO persona(\n"
                + "	 persona_cedula, persona_nombre, persona_apellido, persona_email, persona_telefono)\n"
                + "	VALUES ('" + getPersona_cedula() + "','" + getPersona_nombre() + "','" + getPersona_apellido() + "','" + getPersona_email() + "','" + getTelefono() + "');";

        boolean resultado = con.noQuery(sql);
        return resultado;
    }

    public int ObtenerPersona() {
        int persona_id = 0;
        try {
            String sql = "SELECT persona_id\n"
                    + "FROM persona\n"
                    + "WHERE persona_cedula ='" + getPersona_cedula() + "'";
            ResultSet rs = con.query(sql);
            while (rs.next()) {

                persona_id = rs.getInt(1);
            }
            return persona_id;
        } catch (Exception e) {
            return 0;
        }

    }
    public int ObtenerAsignatura(String item){
        try {
            int asignatura_id=0;
            String sql = " select asignatura_id from asignatura\n" +
                    "where asignatura_nombre='"+ item+"'";
            ResultSet rs = con.query(sql);
            while (rs.next()) {
                asignatura_id=rs.getInt(1);
            }
            return asignatura_id;
        } catch (SQLException ex) {
            Logger.getLogger(MatriculaDB.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
   }

    public boolean GuardarEstudiante(int id) {
        String sql = "INSERT INTO estudiante(\n"
                + "estudiante_codigosenescyt, persona_id)\n"
                + "VALUES ('" + getCodigo_Senecyt() + "'," + id + ");";
        boolean resultado = con.noQuery(sql);
        return resultado;
    }

}
