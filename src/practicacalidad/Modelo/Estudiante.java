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
public class Estudiante extends Persona {
    
    private String codigo_Senecyt;

    public Estudiante(String codigo_Senecyt) {
        this.codigo_Senecyt = codigo_Senecyt;
    }

    public Estudiante(String codigo_Senecyt, String persona_cedula, String persona_nombre, String persona_apellido, String persona_email, String telefono) {
        super(persona_cedula, persona_nombre, persona_apellido, persona_email, telefono);
        this.codigo_Senecyt = codigo_Senecyt;
    }

    public Estudiante() {
      
    }
    

    public String getCodigo_Senecyt() {
        return codigo_Senecyt;
    }

    public void setCodigo_Senecyt(String codigo_Senecyt) {
        this.codigo_Senecyt = codigo_Senecyt;
    }
 
    
}
