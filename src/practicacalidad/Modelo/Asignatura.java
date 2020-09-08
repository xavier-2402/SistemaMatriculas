/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicacalidad.Modelo;

/**
 *
 * @author Jessica Alvarez
 */
public class Asignatura {
    
    private String asignatura_nombre;
    private String nivel;
    private int docente_id;

    public Asignatura() {
    }

    public String getAsignatura_nombre() {
        return asignatura_nombre;
    }

    public void setAsignatura_nombre(String asignatura_nombre) {
        this.asignatura_nombre = asignatura_nombre;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public int getDocente_id() {
        return docente_id;
    }

    public void setDocente_id(int docente_id) {
        this.docente_id = docente_id;
    }
            
    
      
}
