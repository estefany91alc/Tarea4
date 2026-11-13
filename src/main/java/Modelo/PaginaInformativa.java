/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author PC
 */
// Clase hija que hereda de la clase abstracta Pagina es la que contiene información educativa.
public class PaginaInformativa extends Pagina {

    // Constructor de la clase.
    // Recibe el título, número de página y contenido.
    // Utiliza super() para enviar esos datos a la clase padre.
    public PaginaInformativa(String titulo, int numeroPagina, String contenido) {
        super(titulo, numeroPagina, contenido);
    }//fin 
    
    
    // Sobrescribe el método mostrarContenido() de la clase padre.
    // Devuelve la información de la página en forma de texto.
    @Override
    public String mostrarContenido() {
        return "Página informativa: " + getTitulo()
                + "\nPágina número: " + getNumeroPagina()
                + "\n\n" + getContenido();
    }//fin de mostrar contenido 

}// fin de la clase 
