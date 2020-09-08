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
public class Estudiante {
    private int estudiante_id;
    private String codigo_Senecyt;
    private int persona_id;

    public Estudiante() {
    }

    public int getEstudiante_id() {
        return estudiante_id;
    }

    public void setEstudiante_id(int estudiante_id) {
        this.estudiante_id = estudiante_id;
    }

    public String getCodigo_Senecyt() {
        return codigo_Senecyt;
    }

    public void setCodigo_Senecyt(String codigo_Senecyt) {
        this.codigo_Senecyt = codigo_Senecyt;
    }

    public int getPersona_id() {
        return persona_id;
    }

    public void setPersona_id(int persona_id) {
        this.persona_id = persona_id;
    }
    
    
}
