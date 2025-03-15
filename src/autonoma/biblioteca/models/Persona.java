
package autonoma.biblioteca.models;

/**
 * se crea la clase persona 
 * @author Dsoch
 * @version 1.0.0
 * @since 20250314
 */
public abstract class Persona {
    //Atributos
    /**
     * nombre de la persina
     */
    private String nombre;
    /**
     * documeto de identidad de la persona
     */
    
    private String documentoIdentidad;
    /**
     * correo electronico de la persona
     */
    private String correo;
    // Constructor
     public Persona(String nombre, String documentoIdentidad, String correo) {
        this.nombre = nombre;
        this.documentoIdentidad = documentoIdentidad;
        this.correo = correo;
    }
    // metodos de acceso 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

   
    
}

