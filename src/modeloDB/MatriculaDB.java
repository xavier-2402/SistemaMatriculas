/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDB;

import conexion.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import practicacalidad.Modelo.Matricula;

/**
 *
 * @author usuario
 */
public class MatriculaDB extends Matricula {
    Conexion conectar = new Conexion();

    public MatriculaDB() {
    }

    public MatriculaDB(Date fecha, int estudiante_id, int asignatura_id) {
        super(fecha, estudiante_id, asignatura_id);
    }

   
    public boolean Matricular(){
        String sql= "INSERT INTO public.matricula(\n" +
"	 matricula_fecha, estudiante_id, asignatura_id)\n" +
"	VALUES ('"+getFecha()+"',"+getEstudiante_id()+","+getAsignatura_id()+");";
          boolean resultado = conectar.noQuery(sql);
        return resultado;
    }
    

}
