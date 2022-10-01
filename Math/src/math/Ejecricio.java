/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math;




/**
 *
 * @author PC
 */
public class Ejecricio {

    private static int maximo;
    private static int maximos;
    private static double exp;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       //Math.sqrt
        System.out.println("Math.sqrt");
        
        //declaramos una variable de tipo double 
        double raiz = 9;
        
        
        //mostramos el valor de la variable
        System.out.println(raiz);
        
        //usamos la clase math sqrt en el numero 9 para que saque la raiz de nueve
         raiz = Math.sqrt(raiz);
        
         
         //mostramos el resultado despues de usar Math.sqrt en la variable raiz
        System.out.println(raiz);
        
        System.out.println("");
        
        
        //Math.round
        
        System.out.println("Math.round");
        
        //declaramos una variable de tipo double 
        double numeroredondeado = 10.56;
        
        
        //mostramos el valor de la variable
        System.out.println(numeroredondeado);
        
        //usamos la clase math.round en el numero 10.56 para que sea redondeado
         long numeroresultado = Math.round(numeroredondeado);
        //importante poner long antes para que sea un numero entero sin coma decimal
         
         //mostramos el resultado despues de usar Math.round en la variable numeroredondeado
        System.out.println(numeroresultado);
        
        System.out.println("");
        
        //Math.max
        
        System.out.println("Math.max");
        
        //declaramos unas variables de tipo int
        int x = 24;
        int y = 16;
        
        
        //mostramos el valor de las variables
        System.out.println(x);
        System.out.println(y);
        
        
        //usamos la clase math.max en las variables para saber cual es maximo de entre los 2 numeros
            maximo = Math.max(x, y);
            
            
            //mostramos el resultado despues de usar Math.max en las variables x y  para saber cual es mayor de los dos
        
            System.out.println(maximo);
            
            
      System.out.println("");
      
      //Math.min
        
        System.out.println("Math.min");
        
        //declaramos unas variables de tipo int
        int a = 24;
        int b = 16;
        
        
        //mostramos el valor de las variables
        System.out.println(a);
        System.out.println(b);
        
        
        //usamos la clase math.min en las variables para saber cual es menor de entre los 2 numeros
            maximos = Math.min(a, b);
            
            
            //mostramos el resultado despues de usar Math.min en las variables a b  para saber cual es menor de los dos
        
            System.out.println(maximos);
            
            
      System.out.println("");
      
      
      //Math.exp
        
     /*   System.out.println("Math.exp");
        
        //declaramos unas variables de tipo double
        double f = 2;
        
        
        
        //mostramos el valor de las variables
        System.out.println(f);
        
        
        
        //usamos la clase math.exp para sacar el exponencial de la variable f
            exp = Math.exp(f);
            
            
            //mostramos el resultado despues de usar Math.exp en la variable f 
     System.out.println("Se imprime el random entre 0 
        
            System.out.println(exp);
            
            
      System.out.println("");
         */
     
     System.out.println("Math.random");
     
     // Definir random para valor entre 0 y 1 decimal
        double rifa1 = Math.random();
        
     // Definir random para valor entre 0 y 100 entero
        double rifa = (int)(Math.random()*100);
     // Valor entre 0 y 1 decimal
     System.out.println("Se imprime el random entre 0 y  1");
        System.out.println(rifa1);
        
        // Valor entre 0 y 100 entero
            System.out.println("Se imprime el random entre 0 y  100");
        System.out.println(rifa);
        
        
        
        
       
        
        
       
    }
    
}
