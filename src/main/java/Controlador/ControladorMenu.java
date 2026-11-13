/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Modelo.Libro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorMenu implements ActionListener {

    // Modelo
    private Libro modelo;
    // Vista del menú principal


    // Constructor
    public ControladorMenu() {

        modelo = new Libro();

        // Conectar los botones de la vista con el controlador.
        //vista.addMenuListener(this);

    }//fin del constructor

    // Método que controla los eventos de los botones.
    @Override
    public void actionPerformed(ActionEvent e) {

        String op = e.getActionCommand();

        switch (op) {

            case "INICIO":
                abrirLibro();
                break;

            case "SALIR":
                System.exit(0);
                break;

        }//fin switch

    }//fin de actionPerformed

    // Método para mostrar la ventana del menú.
    public void inicio() {

       // vista.setLocationRelativeTo(null);
        //vista.setVisible(true);

    }//fin de inicio

    // Método para abrir el libro.
    public void abrirLibro() {

        // Aquí conectaremos la ventana de lectura
        // cuando creemos su respectiva vista.

    }//fin de abrirLibro

}//fin de la clase

