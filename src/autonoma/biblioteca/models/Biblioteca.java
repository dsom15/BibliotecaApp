/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.biblioteca.models;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author juan diego montoya
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
    
    /**
     * se crea el main 
     * se crean los libros que hay en la biblioteca
     * se implementan los metodos anteriormente 
     * @param args 
     */

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
      

