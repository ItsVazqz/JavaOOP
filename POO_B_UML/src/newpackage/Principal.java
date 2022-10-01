/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package newpackage;
import java.util.Scanner;
/**
 *
 * @author Josep
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        String titulo,autor;
        int ejemplares,prestados;
        
        // Se crea el objeto libro 1 se va a utilizaar el constructor con parametros
        Libro libro1 = new Libro("El Quijote","Cervantes",1,0);
        Libro libro2 = new Libro("El Quijote","Cervantes",1,0);
        Libro libro3 = new Libro("El Quijote","Cervantes",1,0);
    }
    
}
