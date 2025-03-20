
package autonoma.BibliotecaApp.models;

import java.util.ArrayList;

/**
 *
 * @author Dsoch
 */
public class Libro {
    
    private  long id;
    private String titulo;
    private ArrayList<Libro>libros;

    public Libro(long id, String titulo) {
        this.id = id;
        this.titulo = titulo;
        this.libros = libros;
    }

   

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
    
    
    
}
