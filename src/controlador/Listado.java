/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import com.sun.org.apache.xpath.internal.axes.WalkerFactory;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import vista.VistaLista;

/**
 *
 * @author Jessica Alvarez
 */
public class Listado implements ActionListener {

    private VistaLista vistalistado;
    DefaultTableModel dtm = new DefaultTableModel();

    public Listado(VistaLista vistalistado) {
        this.vistalistado = vistalistado;
        this.vistalistado.setVisible(true);
        this.vistalistado.setLocationRelativeTo(null);
        this.vistalistado.getBtnaceptar().addActionListener(this);

        Inicializartablita();

    }

    public void Inicializartablita() {
        String titulos[] = {"Estudiante", "Asignatura", "Docente"};
        dtm.setColumnIdentifiers(titulos);
        vistalistado.getTabla().setModel(dtm);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(this.vistalistado.getBtnaceptar())) {
            this.vistalistado.dispose();
        }
    }

}
