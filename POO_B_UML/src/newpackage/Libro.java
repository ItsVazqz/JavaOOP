/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 Crea una java clase llamada libro, que guarde la informacion de cada uno de los 
 * libros de la biblioteca, la clase debe guardar el titulo del libro,el autor
 * ,numero de ejemplares y numero de ejemplares prestados.La clase obtendra los 
 * siguientes metodos:
 * Constructor por defecto(vacio)
 * Constructor con parametros 
 * Metodos getters/setters
 * Metodo prestamo: el cual incrementa el atributo correspondiente cada vez que 
 * se realice un prestamo del libro, no se podran prestar libros de los cuales 
 * no haya ejemplares disponibles.Devuelve verdadero si se ha podido realizar
 * la operacion y false en caso contrario.
 * Metodo devolucion:Decremento al atrivbuto correspondiente cuando se prouca la 
 * devolucion de un libro.No se podra devolver libros que no se hayan prestado.
 * Devuelve verdadero si se ha podido realizar la operacion y false en caso contrario.
 * Metodo toString es para mostrar los datos de los libros, este metodo se hereda 
 * de Object y lo debemos modificar (hacer uso de OVERRIDE) para adaptar el 
 * metodo a la clase libro
 */
public class Libro {
    private String titulo;
    private String autor;
    private int ejemplares;
    private int prestados;
    
    public Libro(){
        
    }
    
    public Libro(String titulo, String autor,int ejemplares,int prestados){
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.prestados = prestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public int getPrestados() {
        return prestados;
    }

    public void setPrestados(int prestados) {
        this.prestados = prestados;
    }
    
    public boolean prestamo(){
        boolean prestado = true;
        
        if(prestados < ejemplares){
            prestados++;
        }
        else{
            prestado = false;
        }
            return prestado;
    }
    
    // metodo toString sobrescrito para ostrar los datos de la clase libro
    
    @Override public String toString(){
        return "Titulo" + " " + titulo + "\nAutor" + " " + autor                    
               + "\nEjemplares" + " " + ejemplares + "\nPrestados" + " " + prestados;
    } 
}
