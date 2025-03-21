
package autonoma.BibliotecaApp.models;

import java.util.ArrayList;

/**
 *
 * @author Dsoch
 */
public class Libro {
    /**
     * 
     */
    private static int contadorId;
    /**
     * 
     */
    private  long id;
    /**
     * 
     */
    private String titulo;
    /**
     * 
     */
    private ArrayList<Libro>libros;
    /**
     * 
     */
    private Autor autor;
    //Constructor
    public Libro( String titulo) {
        this.id = contadorId++;
        this.titulo = titulo;
        this.libros = libros;
        this.autor = autor;
    }

   
    //Metodos de acceso
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }
    
    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    
    
    
}
