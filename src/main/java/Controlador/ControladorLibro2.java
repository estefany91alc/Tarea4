/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.GUI_Menu;
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

    // Referencias del menú principal.
    private ControladorMenu controladorMenu;
    private GUI_Menu vistaMenu;

    // Constructor.
    public ControladorLibro2(GUI_VentanaLibro2 vista, ControladorMenu controladorMenu, GUI_Menu vistaMenu) {

        this.vista = vista;
        this.controladorMenu = controladorMenu;
        this.vistaMenu = vistaMenu;

        // Conectar los botones con el controlador.
        vista.addNavigationListener(this);
        vista.addSentencesListener(this);

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

            case "AFIRMATIVA":
                vista.mostrarPanelAffirmative();
                break;

            case "NEGATIVA":
                vista.mostrarPanelNegative();
                break;

            case "INTERROGATIVA":
                vista.mostrarPanelInterrogative();
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

        // Crear el controlador de la actividad.
        ControladorActividad controladorActividad
                = new ControladorActividad(controladorMenu, vistaMenu);

        // Cerrar la segunda página del libro.
        vista.dispose();

        // Iniciar la actividad.
        controladorActividad.iniciar();

    }//fin de siguientePagina

}//fin de ControladorLibro2

