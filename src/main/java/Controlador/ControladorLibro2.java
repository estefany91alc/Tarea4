/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.GUI_VentanaActividad;
import Vista.GUI_VentanaLibro;
import Vista.GUI_VentanaLibro2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author PC
 */
public class ControladorLibro2 implements ActionListener {
    
    // Atributo para acceder a la ventana.
    private GUI_VentanaLibro2 vista;

    // Constructor.
    public ControladorLibro2(GUI_VentanaLibro2 vista) {

        this.vista = vista;

        // Conectar los botones con el controlador.
         vista.addNavigationListener(this);

    }//fin del constructor

    // Recibir los eventos de los botones.
    @Override
    public void actionPerformed(ActionEvent e) {

        String op = e.getActionCommand();

        switch (op) {

            case "VOLVER2":
                volverPagina();
                break;

            case "SIGUIENTE2":
                siguientePagina();
                break;

        }//fin del switch

    }//fin de actionPerformed

    // Regresar a la primera página.
    private void volverPagina() {

        GUI_VentanaLibro ventanaAnterior = new GUI_VentanaLibro();

        ventanaAnterior.setLocationRelativeTo(null);
        ventanaAnterior.setVisible(true);

        vista.dispose();

    }//fin de volverPagina

    // Abrir la actividad.
    private void siguientePagina() {

        GUI_VentanaActividad actividad = new GUI_VentanaActividad();

        actividad.setLocationRelativeTo(null);
        actividad.setVisible(true);

        vista.dispose();

    }//fin de siguientePagina

}//fin de ControladorLibro2
   