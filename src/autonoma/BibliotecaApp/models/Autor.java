
package autonoma.BibliotecaApp.models;

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
    // constructor 

    public Autor(String editorial, String profesion, String nombre, String documentoIdentidad, String correo) {
        super(nombre, documentoIdentidad, correo);
        this.editorial = editorial;
        this.profesion = profesion;
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
}
