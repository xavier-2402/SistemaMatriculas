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
import javax.swing.table.DefaultTableModel;
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

    public boolean Matricular() {
        String sql = "INSERT INTO public.matricula(\n"
                + "	 matricula_fecha, estudiante_id, asignatura_id)\n"
                + "	VALUES ('" + getFecha() + "'," + getEstudiante_id() + "," + getAsignatura_id() + ");";
        boolean resultado = conectar.noQuery(sql);
        return resultado;
    }

    public DefaultTableModel ObtenerDatos() {
         DefaultTableModel modelo = new DefaultTableModel();
        try {
           
            String sql = "select p.persona_nombre ||' '||p.persona_apellido as \"Estudiante\" ,\n"
                    + "a.asignatura_nombre,\n"
                    + "p1.persona_nombre ||' '||p1.persona_apellido as \" Docente\"\n"
                    + "from persona p\n"
                    + "join estudiante e\n"
                    + "on p.persona_id = e.persona_id\n"
                    + "join matricula m\n"
                    + "on m.estudiante_id = e.estudiante_id\n"
                    + "join asignatura a \n"
                    + "on a.asignatura_id= m.asignatura_id \n"
                    + "join docente d\n"
                    + "on d.docente_id=a.docente_id\n"
                    + "join persona  p1\n"
                    + "on p1.persona_id=d.persona_id";
            ResultSet rs = conectar.query(sql);
            modelo.setColumnIdentifiers(new Object[]{"Estudiante", "Asignatura", "Docente"});
            while (rs.next()) {
                
                modelo.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(MatriculaDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return modelo;
    }

}
