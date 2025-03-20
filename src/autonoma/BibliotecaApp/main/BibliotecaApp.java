
package autonoma.BibliotecaApp.main;

import autonoma.BibliotecaApp.models.Biblioteca;
import autonoma.BibliotecaApp.models.Libro;

/**
 *
 * @author Dsoch
 */
public class BibliotecaApp {
       public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarLibro(new Libro(1, "El principito"));
        biblioteca.agregarLibro(new Libro(2, "Cien años de soledad"));
        biblioteca.agregarLibro(new Libro(3, "Don Quijote de la Mancha"));
        
        System.out.println("Lista de libros:");
        System.out.println(biblioteca.mostrarLibros());

        System.out.println("Buscando libro con ID 2:");
        Libro libroEncontrado = biblioteca.buscarLibro(2);
        if (libroEncontrado != null) {
            System.out.println("Encontrado: " + libroEncontrado.getTitulo());
        } else {
            System.out.println("Libro no encontrado");
        }

        System.out.println("Eliminando libro con ID 1:");
        biblioteca.eliminarLibro(1);
        System.out.println(biblioteca.mostrarLibros());
    }
    
}
