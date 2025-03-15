/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.biblioteca.models;

import java.util.ArrayList;

/**
 *
 * @author jeron
 */
public class Biblioteca {
    private Libro libro;
    private Autor autor;
    private ArrayList <Libro>libros;

    public Biblioteca(Libro libro, Autor autor,ArrayList <Libro>libros) {
        this.libro = libro;
        this.autor = autor;
        this.libros = new ArrayList<>();
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    
    public ArrayList<Libro> getLibros(){
        return libros;
    }
    
    
    /** METODOS
     * se crea el metodo mostrar
     */
     
    public void mostarLibro(){
        System.out.println("Libro"+libro.getTitulo());
    }
    
    public void agregarLibro(Libro libro){     
            
            libros.add(libro);           
        
                    
    }
    
    public Libro  buscarLibro (long idLibro){
       for (Libro libro: libros){
          if (libro.getId()==idLibro){
              return libro;
          }
       }
       return null;
       
    }
        
 } 

