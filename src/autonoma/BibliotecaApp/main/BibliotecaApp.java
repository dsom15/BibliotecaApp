
package autonoma.BibliotecaApp.main;

import autonoma.BibliotecaApp.models.Biblioteca;
import autonoma.BibliotecaApp.models.Libro;
import autonoma.BibliotecaApp.views.VentanaPrincipal;

/**
 *
 * @author Dsoch
 */
public class BibliotecaApp {
       public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarLibro(new Libro( "El principito"));
        biblioteca.agregarLibro(new Libro( "Cien años de soledad"));
        biblioteca.agregarLibro(new Libro( "Don Quijote de la Mancha"));
        
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
        
        VentanaPrincipal ventana = new VentanaPrincipal(biblioteca);
        ventana.setVisible(true);


        
    }
    
}
