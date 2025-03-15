/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.biblioteca.models;

import java.util.ArrayList;

/**
 *
 * @author esteb
 */
public class Libro {
    //atributos 
    private  long id;
    private String titulo;
    private ArrayList <Libro> libros;
//contructor
    public Libro(long id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Libro(ArrayList<Libro> libros) {
        this.libros = libros;
    }
    
//getters and setters
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
