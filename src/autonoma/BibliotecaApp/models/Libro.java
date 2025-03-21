package autonoma.BibliotecaApp.models;

import java.util.ArrayList;

/**
 *
 * @author Dsoch
 */
public class Libro {

    private static int contadorId;
    private long id;
    private String titulo;
    
    private Autor autor;

    // Constructor que recibe título y autor
    public Libro(String titulo, Autor autor) {
        this.id = contadorId++;
        this.titulo = titulo;
        this.autor = autor;
    }

    // Métodos de acceso
    public long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
}
