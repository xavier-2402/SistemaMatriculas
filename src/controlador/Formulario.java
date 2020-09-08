/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import conexion.Conexion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import modeloDB.EstudianteDB;
import modeloDB.MatriculaDB;
import practicacalidad.Modelo.Estudiante;
import vista.Menu;
import vista.VistaFormulario;

/**
 *
 * @author Asrock Gamer
 */
public class Formulario implements ActionListener {

    private VistaFormulario vistaFormulario;
    EstudianteDB modelo = new EstudianteDB();
    MatriculaDB modelomatricula = new MatriculaDB();
    Conexion con = new Conexion();
   

    public Formulario(VistaFormulario vistaFormulario) {
        this.vistaFormulario = vistaFormulario;
        this.vistaFormulario.setVisible(true);
        this.vistaFormulario.setLocationRelativeTo(null);
        inicializarComponentes();
        CargarCombo();
    }

    public void inicializarComponentes() {
        this.vistaFormulario.getBtnMatricular().addActionListener(this);
        this.vistaFormulario.getCbxAsignatura().addActionListener(this);
        this.vistaFormulario.getBtncancelar().addActionListener(this);
    }

    public void limpiar() {
        vistaFormulario.getTxtApellidos().setText("");
        vistaFormulario.getTxtNombres().setText("");
        vistaFormulario.getTxtCedula().setText("");
        vistaFormulario.getTxtCodigoEst().setText("");
        vistaFormulario.getTxtCorreo().setText("");
        vistaFormulario.getTxtTelefono().setText("");
    }

    public void valEmpty(String parametro) {
        if (parametro.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No deje campos vacios");
        } else {

        }
    }

    public void valCedula(String parametro) {
        if (parametro.matches("[0-9]*") && parametro.length() == 10) {

        } else {
            JOptionPane.showMessageDialog(null, "Ingrese solo números");
        }
    }

    public void valCorreo(String parametro) {
        if (parametro.matches("[-\\w\\.]+@\\w+\\.\\w+")) {

        } else {
            JOptionPane.showMessageDialog(null, "Correo Incorrecto");
        }
    }

    public void CargarDatos() {
        modelo.setPersona_cedula(vistaFormulario.getTxtCedula().getText());
        modelo.setPersona_nombre(vistaFormulario.getTxtNombres().getText());
        modelo.setPersona_apellido(vistaFormulario.getTxtApellidos().getText());
        modelo.setPersona_email(vistaFormulario.getTxtCorreo().getText());
        modelo.setTelefono(vistaFormulario.getTxtTelefono().getText());
        modelo.setCodigo_Senecyt(vistaFormulario.getTxtCodigoEst().getText());

    }

    public void Matricular() {
        try {
            if (modelo.GuardarPersona()) {
                int id = modelo.ObtenerPersona();
                if (modelo.GuardarEstudiante(id)) {
                    modelomatricula.setEstudiante_id(ObtenerEstudiante(id));
                    modelomatricula.setAsignatura_id(modelo.ObtenerAsignatura(vistaFormulario.getCbxAsignatura().getSelectedItem().toString()));
                   Fecha();
                   if(modelomatricula.Matricular()){
                        JOptionPane.showMessageDialog(vistaFormulario, "Datos Ingresados Correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
                   }else{
                        JOptionPane.showMessageDialog(vistaFormulario, "Surgió un error", "Información", JOptionPane.ERROR);
                   }

                } else {
                    JOptionPane.showMessageDialog(vistaFormulario, "Surgió un error", "Información", JOptionPane.ERROR);

                }

            } else {
                JOptionPane.showMessageDialog(vistaFormulario, "Hubo un error al ingresar la información", "Problema", JOptionPane.ERROR_MESSAGE);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(vistaFormulario, "Surgió un error", "Problema", JOptionPane.ERROR_MESSAGE);

        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(this.vistaFormulario.getBtncancelar())) {
            this.vistaFormulario.dispose();
            Menu vm = new Menu();
            ControladorMenu cm = new ControladorMenu(vm);
        }
        if (e.getSource().equals(this.vistaFormulario.getBtnMatricular())) {
            CargarDatos();
            Matricular();

        }

    }

    public void CargarCombo() {
        try {

            String sql = "select asignatura_nombre from asignatura";
            ResultSet rs = con.query(sql);
            while (rs.next()) {
                this.vistaFormulario.getCbxAsignatura().addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

     public int ObtenerEstudiante(int id) {
        try {
            int estudiante_id =0;
            String sql = "select estudiante_id from estudiante\n"
                    + "where persona_id=" + id;
            ResultSet rs = con.query(sql);
            while (rs.next()) {

                estudiante_id = rs.getInt(1);
            }
            return estudiante_id;
        } catch (SQLException ex) {
          
            Logger.getLogger(MatriculaDB.class.getName()).log(Level.SEVERE, null, ex);
              return 0;
        }
        
        
        

    }
      public void Fecha() {
        Date date = new Date();
        modelomatricula.setFecha(date);
    }
     
   
}
