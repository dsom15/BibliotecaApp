/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.biblioteca.models;

/**
 *
 * @author Dsoch
 */
public class Autor {
    //Atributos
    private String editorial;
    private String profesion;

   
  //constructor 
    public Autor(String editorial, String profesion) {
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
