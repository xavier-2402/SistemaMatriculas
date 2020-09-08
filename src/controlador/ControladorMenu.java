/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.Menu;
import vista.VistaFormulario;
import vista.VistaLista;

/**
 *
 * @author usuario
 */
public class ControladorMenu  implements ActionListener{
    
    private Menu menu;

    public ControladorMenu(Menu menu) {
        this.menu = menu;
        this.menu.setVisible(true);
        this.menu.setLocationRelativeTo(null);
        this.menu.getBtn_formulario().addActionListener(this);
        this.menu.getBtn_listar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource().equals(this.menu.getBtn_formulario())){
           VistaFormulario vf = new VistaFormulario();
           Formulario fm = new Formulario(vf);
           this.menu.dispose();
       }
       if(e.getSource().equals(this.menu.getBtn_listar())){
           VistaLista vl = new VistaLista();
           Listado lista = new Listado(vl);
           
       }
    }
    
    
    
    
}
