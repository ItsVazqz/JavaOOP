/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcgPracticasClaseUnidadUno;

/**
 *
 * @author Josep
 * Contiene Actividad 2 "Uso de los operadores asignación"
 */
public class clsPracticaTres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=5,b=10,c,d=6,e=18,f=2,g=3,h=4,i=5,j=6,k=9;
        
        boolean l = true,m = false,n = true;
        
        
       // Incremento
        a++;
       // Decremento
       b--;
       // Asignación simple
       c = 5;
       // Multiplicación más asignacicón
       d*=c;
       // División más asignación
       e/=d;
       // Modulo más asignación
       f%=f;
       // Suma más asignación
       g+=f;
       //Resta más asignación
       h-=g;
       //Desplazamiento a izquierda más asginación
       i<<=b;
       // Desplazamiento a derecha más asignación
       j>>=d;
       // Desplazamiento a derechas más asignación rellenando con ceros
       k>>>=a;
       // Operaeción AND sobre bits más asignación
       l &= l;
       // Operación OR sobre bits más asignación
       m |= l;
       // Operacion XOR sobre bits más asignación
       n^=l;
       
       
     
        
       System.out.println("uso de operadores de asignación");
       System.out.println("Incrementos");
       System.out.println("a= " + a);
       System.out.println("Decremento");
       System.out.println("b= " + b);
       System.out.println("Asignación simple ");
       System.out.println("c= " + c);
       System.out.println("Multiplicación más asignación");
       System.out.println("d= " + d);
       System.out.println("e=" + e);
       System.out.println("f= " + f);
       System.out.println("g= " + g);
       System.out.println("h= " + h);
       System.out.println("i= " + i);
       System.out.println("j=" + j);
       System.out.println("k= " + k);
       System.out.println("l= " + l);
       System.out.println("m= " + m);
       
       
      
       
       
    }
}