/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import vista.Menu;

/**
 *
 * @author usuario
 */
public class ControladorMenu {
    
    private Menu menu;

    public ControladorMenu(Menu menu) {
        this.menu = menu;
        this.menu.setVisible(true);
        this.menu.setLocationRelativeTo(null);
    }
    
    
    
    
}
