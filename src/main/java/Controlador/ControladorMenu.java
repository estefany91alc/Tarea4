/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Libro;
import Vista.GUI_Menu;
import Vista.GUI_VentanaLibro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class ControladorMenu implements ActionListener {

    // Modelo
    private Libro modelo;
    // Vista del menú principal

    // Vista
    private GUI_Menu vista;
    private GUI_VentanaLibro vistaLibro;

    // Constructor
    public ControladorMenu() {

        modelo = new Libro();

        vista = new GUI_Menu();

        vista.addMenuListener(this);

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

        case "INSTRUCCIONES":
            mostrarInstrucciones();
            break;

        case "CREDITOS":
            mostrarCreditos();
            break;

        case "SALIR":
            System.exit(0);
            break;

          }//fin switch

    }//fin de actionPerformed

    // Método para mostrar la ventana del menú.
    public void inicio() {
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }//fin de inicio

    // Método para abrir el libro.
    public void abrirLibro() {
        // Inicializamos la vista del libro.
        GUI_VentanaLibro vistaLibro = new GUI_VentanaLibro();

        // Creamos el controlador del libro.
        ControladorLibro control = new ControladorLibro(vistaLibro, vista);

        // Ocultamos el menú principal.
        vista.setVisible(false);

        // Mostramos la ventana del libro.
        vistaLibro.setLocationRelativeTo(null);
        vistaLibro.setVisible(true);
        
    }//fin de abrirLibro
    
    
    //Metodo mostrarInstrucciones
    private void mostrarInstrucciones() {
        // Método para mostrar las instrucciones del juego.

    String instrucciones = "<html>"
            + "<div style='width:300px; text-align:center;'>"
            + "<h1 style='color:#3985D6;'>¡BIENVENIDO!</h1>"
            + "<h2>¿Cómo jugar?</h2>"
            + "<p>1. ¡Comienza tu Aventura! Toca el Boton de Inicio.</p>"
            + "<p>2. ¡Descubre cosas Nuevas! Lee la informacion de las páginas educativas.</p>"
            + "<p>3. ¡Pon a Prieba lo que sabes! Responde las preguntas de cada actividad.</p>"
            + "<p>4. ¡Sigue Aprendiendo! Tienes un máximo de tres intentos fallidos.</p>"
            + "<p>5. ¡Recuerda! Consultar tus resultados.</p>"
            + "<h3>¡Diviértete aprendiendo! </h3>"
            + "<h4>¡Que comience la Magia! </h4>"
            + "</div></html>";

    JOptionPane.showMessageDialog( vista, instrucciones, "Instrucciones",
            JOptionPane.INFORMATION_MESSAGE );

}//fin de mostrarInstrucciones
       
    
    //Metodo mostrarCreditos
    private void mostrarCreditos() {

        String creditos = "<html>"
                + "<div style='width:300px; text-align:center;'>"
                + "<h1 style='color:#8B65C5;'>CRÉDITOS</h1>"
                + "<h2>English Time</h2>"
                + "<p>Learn the Simple Present</p>"
                + "<hr>"
                + "<p>Universidad de Costa Rica</p>"
                + "<p>Informatica y Tecnolgia Multimedia</p>"
                + "<p><b>Profesora:</b></p>"
                + "<p>Licda. María Fuentes Mazutiel</p>"
                + "<p><b>Desarrollado por:</b></p>"
                + "<p>Estefany Alvarado Carranza</p>"
                + "<p>Oscar Leornardo Perez Munoz</p>"
                + "<p>Felix Morales Morales</p>"
                + "<p>Curso: Fundamentos de Programación TM-2100</p>"
                + "<p>Año: 2026</p>"
                + "</div></html>";

        JOptionPane.showMessageDialog(vista, creditos, "Créditos",
                JOptionPane.INFORMATION_MESSAGE);

    }//fin de mostrarCreditos

    
}//fin de la clase controlador menu 
        
        


