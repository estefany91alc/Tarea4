/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author PC
 */
public abstract class Pagina {

    // Atributos
    private String titulo;
    private int numeroPagina;
    private String contenido;

    // Constructor
    public Pagina(String titulo, int numeroPagina, String contenido) {
        this.titulo = titulo;
        this.numeroPagina = numeroPagina;
        this.contenido = contenido;
    }

    // Métodos de acceso
    public String getTitulo() {
        return titulo;
    }

    public int getNumeroPagina() {
        return numeroPagina;
    }

    public String getContenido() {
        return contenido;
    }

    // Método abstracto
    public abstract String mostrarContenido();

}//fin de clase  pagina 
