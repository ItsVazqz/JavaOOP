/*
Practica Clase _ 1
Uso del formato print y de marcas especiales
para mostrar el resultado tipo doule de
horas / tarifa / tolerancias
 */
package pcgPracticasClaseUnidadUno;
import javax.swing.JOptionPane;

/**
 *
 * @author Josep
 */
public class clsPracticaUno {

// Declaración de la classe main //
    public static void main(String[] args) {
        // Declaración de variables double //
        // Nuestras variables necesarias son hora, tarifa y tolerancia//
        // Les asignamos valores //
      double dblHora = 34.45,dblTarifa = 15.45,dblTolerancia = 0.01000;
      
      // Indicamos el tipo de notación para el usuario //
      System.out.println("Notación decimal fija: ");
      
      /* Utilizamos printf para imprimir con formato, utilizando la marca '%.2f" que nos permite
      imprimir decimales, el .2 dentro de nos permite imprimir unicamente 2 decimales */
      System.out.printf("Horas = %.2f , tarifa = %.2f , pago = %.2f , tolerancia %f%n%n",dblHora,dblTarifa,dblHora*dblTarifa,dblTolerancia);
        // Indicamos el tipo de notación para el usuario //
      System.out.println("Notación cientifica: ");
        /* Utilizamos printf para imprimir con formato, utilizando la marca '%e" que nos permite
      utilizar notación cientifica comunmente expresada por 'e+#' o 'x10^#' */
      
      
      System.out.printf("Horas = %e , tarifa = %e , pago = %e , tolerancia %e%n%n",dblHora,dblTarifa,dblHora*dblTarifa,dblTolerancia);
      JOptionPane.showMessageDialog(null, "Notación decimal fija:");
      JOptionPane.showMessageDialog(null, String.format("Horas =" + String.format("%.2f",(dblHora))) + " " +  String.format("Tarifa =" + String.format("%.2f",(dblTarifa))) + " " + String.format("Pago=" + String.format("%.2f",(dblHora*dblTarifa))) + " " + String.format("Tolerancia =" + String.format("%.2f",(dblTolerancia))));
      JOptionPane.showMessageDialog(null, "Notación cientifica:");
      JOptionPane.showMessageDialog(null, String.format("Horas =" + String.format("%e",(dblHora))) + " " +  String.format("Tarifa =" + String.format("%e",(dblTarifa))) + " " + String.format("Pago=" + String.format("%e",(dblHora*dblTarifa))) + " " + String.format("Tolerancia =" + String.format("%e",(dblTolerancia))));
    }
    
}
