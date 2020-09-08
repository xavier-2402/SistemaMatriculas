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
public class Docente extends Persona{
    
    private String docente_titulo;

    public Docente(String docente_titulo) {
        this.docente_titulo = docente_titulo;
    }

    public Docente(String docente_titulo, String persona_cedula, String persona_nombre, String persona_apellido, String persona_email, String telefono) {
        super(persona_cedula, persona_nombre, persona_apellido, persona_email, telefono);
        this.docente_titulo = docente_titulo;
    }

    public String getDocente_titulo() {
        return docente_titulo;
    }

    public void setDocente_titulo(String docente_titulo) {
        this.docente_titulo = docente_titulo;
    }
    
    

   
}
