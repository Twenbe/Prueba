package com.mycompany.calculadora;
//hola
/* Comentario
  de varias lineas */

/**
  * Es crear una documentación profesional del codigo.
  * @author: Juan Perez
  * @version: 1.0
  * @return: void
*/


public class Calculadora {

    public static void main ( String [] args ) {
        System.out.println ( " --- Ejecutando - - Calculadora - - - " ) ;
        double n1 = 10.5;
        double n2 = 5.2;
        
        System.out.println (" Resultado : " + (n1 + n2));
    }
}
//java -cp .\classes com.mycompany.calculadora.Calculadora
//javadoc -d docs .\src\Calculadora.java
