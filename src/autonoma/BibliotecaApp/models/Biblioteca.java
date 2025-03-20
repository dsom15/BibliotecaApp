
package autonoma.BibliotecaApp.models;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author Juan diego montoya
 * @since 18/03/2025
 * 
 * se crea la clase biblioteca 
 */
public class Biblioteca {
    
    /**
     * se crea el atributo libros para obtenerlos de la clase libro
     */
    private final ArrayList<Libro> libros;
    
    /**
     * los nuevos libros seregistraran en la biblioteca
     */

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    /**
     * se crea el metodo  mostrar libros
     * @return 
     */
    public String mostrarLibros() {
        StringBuilder sb = new StringBuilder();
        for (Libro libro : libros) {
            sb.append("ID: ").append(libro.getId()).append(", Título: ").append(libro.getTitulo()).append("\n");
        }
        return sb.toString();
    }
    /**
     * se crea el metodo agregar libro 
     * @param libro
     * @return 
     */
    public boolean agregarLibro(Libro libro) {
        return libros.add(libro);
    }
        
    
    /**
     * se crea el metodo buscar libro
     * @param id
     * @return 
     */
    public Libro buscarLibro(long id) {
        for (Libro libro : libros) {
            if (libro.getId() == id) {
                return libro;
            }
        }
        return null;
    }
    
    /**
     * se crea el metodo de actualizar libro
     * @param id
     * @param nuevoLibro
     * @return 
     */
    public boolean actualizarLibro(long id, Libro nuevoLibro) {
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getId() == id) {
                libros.set(i, nuevoLibro);
                return true;
            }
        }
        return false;
    }
    
    /**
     * se crea el metodo de eliminar libro
     * @param id
     * @return 
     */

    public boolean eliminarLibro(long id) {
        return libros.removeIf(libro -> libro.getId() == id);
    }
    
    
    /**
     * se utuliza el arraylit para obtener los libros alfabeticamente
     * se crea el metodo de obtener libro alfabeticamete 
     * @return 
     */
    public ArrayList<Libro> obtenerLibrosAlfabeticamente() {
        ArrayList<Libro> librosOrdenados = new ArrayList<>(libros);
        librosOrdenados.sort(Comparator.comparing(Libro::getTitulo));
        return librosOrdenados;
    }   

    
}
      

