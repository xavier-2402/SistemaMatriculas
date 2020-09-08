/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import vista.VistaFormulario;
/**
 *
 * @author Asrock Gamer
 */
public class Formulario {
    
    private VistaFormulario vistaFormulario;
    
    private JButton btnMatricular;
    
    public Formulario (VistaFormulario vistaFormulario){
        vistaFormulario.setVisible(true);
        vistaFormulario.setLocationRelativeTo(null);
    }
    
    public void inicializarComponentes(){
        
    }
    
}
