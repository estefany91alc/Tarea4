/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.util.ArrayList;
/**
 *
 * @author PC
 */
// Clase encargada de administrar las páginas del libro.
public class Libro {
    
    // Lista que almacena las páginas del libro por medio de un arratlist
    private ArrayList<Pagina> paginas;

    // Constructor sin parametros que inicializa la lista de páginas.
    public Libro() {
        paginas = new ArrayList<>();
    }//fin del constructor 

    // Método para agregar páginas al libro.
    public void agregarPagina(Pagina pagina) {
        paginas.add(pagina);
    }//fin del metodo agregarPagina
    
// Método para obtener una página según su posición.
public Pagina obtenerPagina(int posicion) {
    // Verifica que la posición exista con un condicional 
    if (posicion >= 0 && posicion < paginas.size()) {
        return paginas.get(posicion);
    } else {
        return null;
    }//fin else 
}//fin obtenerPagina

    // Método para recorrer y obtener todas las páginas.
    public ArrayList<Pagina> getPaginas() {
        return paginas;
    }//fin de getPaginas

    // Devuelve la cantidad de páginas del libro.
    public int getCantidadPaginas() {
        return paginas.size();
    }//fin del metodo getCantidadPaginas() 

  } //fin de clase libro
