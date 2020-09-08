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
public class Docente {
    private int docente_id;
    private String docente_titulo;
    private int persona_id;

    public Docente() {
    }

    public int getDocente_id() {
        return docente_id;
    }

    public void setDocente_id(int docente_id) {
        this.docente_id = docente_id;
    }

    public String getDocente_titulo() {
        return docente_titulo;
    }

    public void setDocente_titulo(String docente_titulo) {
        this.docente_titulo = docente_titulo;
    }

    public int getPersona_id() {
        return persona_id;
    }

    public void setPersona_id(int persona_id) {
        this.persona_id = persona_id;
    }
    
}
