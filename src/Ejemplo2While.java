/*
 * programa que lee un número n y muestra n asteriscos
 */
import java.util.*;
public class Ejemplo2While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

	//definimos dos varaibles la n y contador de tipo entero, contador por defecto tiene valor 0
        int n, contador = 0;
        System.out.print("Introduce un número: ");
        n = sc.nextInt();

	//si la variable contado es menor que la variable que introduce el usuario inicia el bucle
        while (contador < n){

		//eL bucle muestra por pantalla un * por cada vez que se ejecute cumpliendo la condicion anterior
               System.out.println(" * ");
		
		//cuando el bucle llega a esta linea, aumenta el valor de la variable contador en 1
               contador++;
        }
    }
}
