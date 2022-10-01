/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcgPracticasClaseUnidadUno;
import javax.swing.JOptionPane;
/**
 *
 * @author Josep
 */
public class clsPracticaDos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double radio,circunferencia,area;
        String radiusString,outputStr;
        
        // Se hace encapsulamiento, un dato contiene a otro
        radiusString =  JOptionPane.showInputDialog("Introduzca el valor del radio: ");
        radio = Double.parseDouble(radiusString);
        // Se determina el area
        area = Math.PI*radio;
        // Se calcula la circunferencia
        circunferencia = 2*Math.PI*radio;
        outputStr="Radio: " + radio + " " +"Unidades\n" + 
                "Area: " + area + " " +  "Unidades Cuadradas\n" +
                "Circunferencia: " + circunferencia + " " + "Unidades";
        JOptionPane.showMessageDialog(null, outputStr,"Circulo",JOptionPane.INFORMATION_MESSAGE);
        
        System.exit(0);
       
    }
    
}
