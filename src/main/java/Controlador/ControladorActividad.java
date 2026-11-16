/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.PaginaActividad;
import Vista.GUI_Menu;
import Vista.GUI_VentanaActividad;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author blood
 */
public class ControladorActividad implements ActionListener {

    // Modelo
    private PaginaActividad modelo;

    // Vista
    private GUI_VentanaActividad vista;
    private GUI_Menu vistaMenu;

    // Controlador del menú
    private ControladorMenu controladorMenu;

    // Control de preguntas
    private int preguntaActual = 0;
    private int respuestasCorrectas = 0;

    // Respuestas del usuario
    private String[] respuestasUsuario;

    // Resultados de la actividad
    private int puntuacion;
    private boolean actividadFinalizada = false;

    // Constructor
    public ControladorActividad(ControladorMenu controladorMenu, GUI_Menu vistaMenu) {

        this.controladorMenu = controladorMenu;
        this.vistaMenu = vistaMenu;

        this.controladorMenu = controladorMenu;

        // Crear la actividad.
        modelo = new PaginaActividad(
                "Simple Present",
                1,
                "Completa las siguientes oraciones.",
                new String[]{
                    "She _____ to school every day.",
                    "They _____ soccer on Sundays.",
                    "He _____ coffee every morning.",
                    "I _____ English at school.",
                    "My mother _____ dinner every night."
                },
                new String[]{
                    "goes",
                    "play",
                    "drinks",
                    "study",
                    "cooks"
                }
        );

        // Preparar el arreglo de respuestas.
        respuestasUsuario = new String[modelo.getPreguntas().length];

        // Crear la ventana.
        vista = new GUI_VentanaActividad();

        // Conectar los botones.
        vista.addActividadListener(this);
    }

    // Controlar eventos.
    @Override
    public void actionPerformed(ActionEvent e) {

        String op = e.getActionCommand();

        switch (op) {

            case "VOLVER":
                volverMenu();
                break;

            case "SIGUIENTE":
                siguientePregunta();
                break;

            case "FINALIZAR":
                finalizarActividad();
                break;
        }
    }

    // Mostrar la ventana.
    public void iniciar() {
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        mostrarPregunta();
    }

    // Mostrar la pregunta actual.
    private void mostrarPregunta() {

        vista.mostrarPregunta(
                modelo.getPreguntas()[preguntaActual],
                preguntaActual + 1
        );
    }

    // Guardar respuesta y avanzar.
    private void siguientePregunta() {

        String respuesta = vista.getRespuesta();

        if (respuesta.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(
                    vista,
                    "Debes escribir una respuesta."
            );
            return;
        }

        // Guardar la respuesta del usuario.
        respuestasUsuario[preguntaActual] = respuesta;

        preguntaActual++;

        // Comprobar si quedan preguntas.
        if (preguntaActual < modelo.getPreguntas().length) {

            mostrarPregunta();

        } else {

            // Mostrar el botón finalizar.
            vista.mostrarFinalizar();
        }
    }

    // Comprobar resultados.
    private void finalizarActividad() {

        // Reiniciar la cantidad de respuestas correctas.
        respuestasCorrectas = 0;

        // Comparar las respuestas del usuario con las correctas.
        for (int i = 0; i < respuestasUsuario.length; i++) {

            if (respuestasUsuario[i].equalsIgnoreCase(
                    modelo.getRespuestasCorrectas()[i])) {

                respuestasCorrectas++;
            }
        }

        // Calcular la puntuación sobre 100.
        puntuacion = (respuestasCorrectas * 100)
                / respuestasUsuario.length;

        // Indicar que la actividad terminó.
        actividadFinalizada = true;

        // Cerrar la ventana de actividad.
        vista.dispose();

        // Regresar al menú principal.
        volverMenu();
    }

    // Regresar al menú.
    private void volverMenu() {

        javax.swing.JOptionPane.showMessageDialog(
                vista,
                "Regresando al menú principal."
        );

        // Cerrar la ventana de actividad.
        vista.dispose();

        // Mostrar nuevamente el menú principal.
        vistaMenu.setLocationRelativeTo(null);
        vistaMenu.setVisible(true);

    }

    // Obtener la cantidad de respuestas correctas.
    public int getRespuestasCorrectas() {
        return respuestasCorrectas;
    }

    // Obtener la cantidad total de preguntas.
    public int getTotalPreguntas() {
        return modelo.getPreguntas().length;
    }

    // Obtener la puntuación.
    public int getPuntuacion() {
        return puntuacion;
    }

    // Obtener las respuestas del usuario.
    public String[] getRespuestasUsuario() {
        return respuestasUsuario.clone();
    }

    // Obtener las respuestas correctas.
    public String[] getRespuestasEsperadas() {
        return modelo.getRespuestasCorrectas().clone();
    }

    // Comprobar si la actividad fue finalizada.
    public boolean isActividadFinalizada() {
        return actividadFinalizada;
    }

}//Fin de la clase
