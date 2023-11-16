/*
 *Ejercicio 11:
Diseñar un programa que muestre el producto de los 10 primeros números impares.
 */
package Ejercicios_Bucles;

/**
 *
 * @author alexl
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num=1;
        int producto =1;
        int contador=0;
        
        for(contador=1;contador <10; contador++ ){
            num =+ 2;
            producto *=num;
        }
            System.out.println(producto);
            System.out.println("Felicidades conseguiste un numero nuevo");
            System.out.println("Lo siento mucho no conseguiste un nuevo numero");
    }
    
}