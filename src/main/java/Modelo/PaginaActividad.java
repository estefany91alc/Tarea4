/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author PC
 */

// Clase hija que hereda de la clase abstracta Pagina.
public class PaginaActividad extends Pagina {

    // Arreglos para almacenar las preguntas y respuestas.
    private String[] preguntas;
    private String[] respuestasCorrectas;

    // Constructor que inicializa los datos utilizando el constructor de la clase padre.
    public PaginaActividad(String titulo, int numeroPagina, String contenido) {
        super(titulo, numeroPagina, contenido);
    }

    // Constructor que también recibe las preguntas y respuestas.
    public PaginaActividad(String titulo, int numeroPagina, String contenido,
            String[] preguntas, String[] respuestasCorrectas) {
        super(titulo, numeroPagina, contenido);
        this.preguntas = preguntas;
        this.respuestasCorrectas = respuestasCorrectas;
    }

    // Implementa el método abstracto de Pagina.
    // Devuelve la información correspondiente a una actividad.
    @Override
    public String mostrarContenido() {
        return "Página de actividad: " + getTitulo()
                + "\nPágina número: " + getNumeroPagina()
                + "\n\n" + getContenido();
    }

    // Devuelve el arreglo de preguntas.
    public String[] getPreguntas() {
        return preguntas;
    }

    // Devuelve el arreglo de respuestas correctas.
    public String[] getRespuestasCorrectas() {
        return respuestasCorrectas;
    }

}
