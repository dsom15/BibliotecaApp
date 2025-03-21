package autonoma.BibliotecaApp.models;

import java.util.ArrayList;

/**
 * se crea la clase libro
 * @author Dsoch
 * @since 21/03/2025
 * @version 1.0.0
 */
public class Libro {

    /**
     * Para asignar el id
     */
    private static int contadorId =0 ;
    /**
     * el ID unico de cada numero
     */
    private long id;
    /**
     * titulo del libro
     */
    private String titulo;
    /**
     * Autor del libto 
     */
    
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
