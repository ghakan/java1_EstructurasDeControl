/*
 * Programa que lee dos números de tipo double por teclado
 * y muestra su suma, resta y multiplicación.
 */

//Importa todas las librerias de java
import java.util.*;

//creamos la clase
public class Secuencial2 {
	//sin esta linea no se ejecuta el programa
    public static void main(String[] args){

	//guardamos en la variable sc la clase scanner
        Scanner sc = new Scanner(System.in);
	
	//declaramos dos varaibles de tipo double
        double numero1, numero2;

	//imprimimos en pantalla el texto
        System.out.println("Introduce el primer número:");
	//guardamos en una variable lo que el usuario ha introducido
        numero1 = sc.nextDouble();

        System.out.println("Introduce el segundo número:");
        numero2 = sc.nextDouble();

	//imprimimos en pantalla el texto y mostramos en pantalla las variables
        System.out.println("Números introducido: " + numero1 + "  " + numero2);
        System.out.println
	//mostramos y sumamos/restamos/multiplicamos las variables
          (numero1 + " + " + numero2 + " = " + (numero1+numero2));
        System.out.println
          (numero1 + " - " + numero2 + " = " + (numero1-numero2));
        System.out.println
          (numero1 + " * " + numero2 + " = " + numero1*numero2);
    }
}
