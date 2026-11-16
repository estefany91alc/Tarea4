/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author PC
 */
import Vista.GUI_VentanaLibro;
import Vista.GUI_Menu;
import Vista.GUI_VentanaLibro2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ControladorLibro implements ActionListener, MouseListener {

    // Atributos.
    private GUI_VentanaLibro vistaLibro;
    private GUI_Menu vistaMenu;
    private ControladorMenu controladorMenu;

    // Constructor.
    public ControladorLibro(GUI_VentanaLibro vistaLibro, GUI_Menu vistaMenu, ControladorMenu controladorMenu) {

        this.vistaLibro = vistaLibro;
        this.vistaMenu = vistaMenu;
        this.controladorMenu = controladorMenu;

        // Conectar el botón Volver con el controlador.
        vistaLibro.addLibroListener(this);

        // Conectar las imágenes con el controlador.
        vistaLibro.addImagenesListener(this);

    }//fin del constructor

    // Método para controlar los botones.
    @Override
    public void actionPerformed(ActionEvent e) {

        String op = e.getActionCommand();

        switch (op) {

            case "VOLVER":
                vistaLibro.setVisible(false);
                vistaMenu.setLocationRelativeTo(null);
                vistaMenu.setVisible(true);
                break;

            case "SIGUIENTE":
                siguientePagina();
                break;

        }

    }//fin de actionPerformed

    //metodo siguiente pagina 
    private void siguientePagina() {

        // Crear la segunda ventana del libro.
        GUI_VentanaLibro2 vistaLibro2 = new GUI_VentanaLibro2();

        // Crear su controlador y pasar las referencias necesarias.
        ControladorLibro2 controlador2 = new ControladorLibro2(vistaLibro2, controladorMenu, vistaMenu);

        // Ocultar la primera ventana.
        vistaLibro.setVisible(false);

        // Mostrar la segunda ventana.
        vistaLibro2.setLocationRelativeTo(null);
        vistaLibro2.setVisible(true);

    }//fin de siguientePagina

    // Método para mostrar los ejemplos al tocar las imágenes.
    @Override
    public void mouseClicked(MouseEvent e) {

        String imagen = ((JLabel) e.getSource()).getName();

        switch (imagen) {

            case "WAKEUP":
                JOptionPane.showMessageDialog(vistaLibro,
                        "I wake up at 6:00 a.m.\n"
                        + "Me despierto a las 6:00 a. m.");
                break;

            case "BRUSHTEETH":
                JOptionPane.showMessageDialog(vistaLibro,
                        "I brush my teeth every morning.\n"
                        + "Me cepillo los dientes todas las mañanas.");
                break;

            case "GOSCHOOL":
                JOptionPane.showMessageDialog(vistaLibro,
                        "I go to school every day.\n"
                        + "Voy a la escuela todos los días.");
                break;

        }//fin switch

    }//fin de mouseClicked

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    // Método para abrir la segunda página del libro.
}//fin de la clase
