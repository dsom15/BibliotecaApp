
package autonoma.BibliotecaApp.models;

import java.util.ArrayList;

/**
 * Se crea la clase Autor
 * @author Dsoch
 * @since 20250314
 * @version 1.0.0
 */
public  class Autor extends Persona {
    //Atributos
    /**
     * la editorial del autor
     */
    private String editorial;
    /**
     * la profesion del autor 
     */
    private String profesion;
    /**
     * Lista de libros
     */
    
    private ArrayList<Libro> libros;
    
    // constructor 

    public Autor(String editorial, String profesion, String nombre, String documentoIdentidad, String correo) {
        super(nombre, documentoIdentidad, correo);
        this.editorial = editorial;
        this.profesion = profesion;
        this.libros = new ArrayList<>();
    }

   
  
    //Metodos de acceso
     public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    
    public ArrayList<Libro> getLibros() {
        return libros;
    }
    
    // Metodo para agregar un libro a la lista de libros del autor
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

   
}
