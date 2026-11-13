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

    // Constructor que inicializa los datos utilizando el constructor de la clase padre.
    public PaginaActividad(String titulo, int numeroPagina, String contenido) {
        super(titulo, numeroPagina, contenido);
    }

    // Implementa el método abstracto de Pagina.
    // Devuelve la información correspondiente a una actividad.
    @Override
    public String mostrarContenido() {
        return "Página de actividad: " + getTitulo()
                + "\nPágina número: " + getNumeroPagina()
                + "\n\n" + getContenido();
    }

}

