/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import practicacalidad.Modelo.Estudiante;
import vista.Menu;
import vista.VistaFormulario;
/**
 *
 * @author Asrock Gamer
 */
public class Formulario implements ActionListener{
    
    private VistaFormulario vistaFormulario;

    
    public Formulario (VistaFormulario vistaFormulario){
        this.vistaFormulario = vistaFormulario;
        this.vistaFormulario.setVisible(true);
        this.vistaFormulario.setLocationRelativeTo(null);
        inicializarComponentes();
    }
    
    public void inicializarComponentes(){
        this.vistaFormulario.getBtnMatricular().addActionListener(this);
        this.vistaFormulario.getCbxAsignatura().addActionListener(this);
        this.vistaFormulario.getBtncancelar().addActionListener(this);
    }
    
    public void limpiar(){
        vistaFormulario.getTxtApellidos().setText("");
        vistaFormulario.getTxtNombres().setText("");
        vistaFormulario.getTxtCedula().setText("");
        vistaFormulario.getTxtCodigoEst().setText("");
        vistaFormulario.getTxtCorreo().setText("");
        vistaFormulario.getTxtTelefono().setText("");
    }
    
    public void valEmpty(String parametro){
        if (parametro.isEmpty()){
            JOptionPane.showMessageDialog(null, "No deje campos vacios");
        }else{
                        
        }
    }
    
    public void valCedula(String parametro){
        if (parametro.matches("[0-9]*") && parametro.length()==10){
            
        }else{
            JOptionPane.showMessageDialog(null, "Ingrese solo números");            
        }
    }
    
    public void valCorreo(String parametro){
        if(parametro.matches("[-\\w\\.]+@\\w+\\.\\w+")){
            
        }else{
            JOptionPane.showMessageDialog(null, "Correo Incorrecto");
        }
    }
    
    
    public void matricular(){
        String cedula = vistaFormulario.getTxtApellidos().getText();
        String nombres = vistaFormulario.getTxtNombres().getText();
        String apellidos = vistaFormulario.getTxtApellidos().getText();
        String telefono = vistaFormulario.getTxtTelefono().getText();
        String correo = vistaFormulario.getTxtCorreo().getText();
        
        String codigoSenecyt = vistaFormulario.getTxtCodigoEst().getText();
        
        
       
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource().equals(this.vistaFormulario.getBtncancelar())){
            this.vistaFormulario.dispose();
              Menu vm = new Menu();
              ControladorMenu cm = new ControladorMenu(vm);
        }
        
    }
    
}
