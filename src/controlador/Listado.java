/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import vista.VistaLista;


/**
 *
 * @author Jessica Alvarez
 */
public class Listado {
    private VistaLista vistalistado;
    DefaultTableModel dtm = new DefaultTableModel();
   
 

  public Listado(VistaLista vistalistado){
     this.vistalistado.setVisible(true);
     this.vistalistado.setLocationRelativeTo(null);
      Inicializartablita();
       
  }
    public void Inicializartablita(){
        String titulos[]= {"Estudiante","Asignatura","Docente"};
        dtm.setColumnIdentifiers(titulos);
        vistalistado.getTabla().setModel(dtm);
    }
    
}
