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
public abstract class Persona {
   
    private String persona_cedula;
    private String persona_nombre;
    private String persona_apellido;
    private String persona_email;
    private String telefono;

    public Persona() {
    }

    public Persona(String persona_cedula, String persona_nombre, String persona_apellido, String persona_email, String telefono) {
        this.persona_cedula = persona_cedula;
        this.persona_nombre = persona_nombre;
        this.persona_apellido = persona_apellido;
        this.persona_email = persona_email;
        this.telefono = telefono;
    }
    



    public String getPersona_cedula() {
        return persona_cedula;
    }

    public void setPersona_cedula(String persona_cedula) {
        this.persona_cedula = persona_cedula;
    }

    public String getPersona_nombre() {
        return persona_nombre;
    }

    public void setPersona_nombre(String persona_nombre) {
        this.persona_nombre = persona_nombre;
    }

    public String getPersona_apellido() {
        return persona_apellido;
    }

    public void setPersona_apellido(String persona_apellido) {
        this.persona_apellido = persona_apellido;
    }

    public String getPersona_email() {
        return persona_email;
    }

    public void setPersona_email(String persona_email) {
        this.persona_email = persona_email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
}
