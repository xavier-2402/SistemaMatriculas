/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicacalidad;

import controlador.ControladorMenu;
import vista.Menu;

/**
 *
 * @author usuario
 */
public class PracticaCalidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Menu menu = new Menu();
        ControladorMenu ctrl = new ControladorMenu(menu);
    }
    
}
